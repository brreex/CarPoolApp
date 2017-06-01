package cs544.imp1;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ShppingApp {
	public static SessionFactory sessionFactory;

	protected static void setUp() throws Exception {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
	
	 protected static void tearDown() throws Exception {
	        if (sessionFactory != null) {
	            sessionFactory.close();
	        }
	    }

	public static void main(String[] args) throws Exception {
		setUp();
			
		
		try(Session session = sessionFactory.openSession()){
			session.beginTransaction();
			// create product
			Product product1 = new Product("Galaxy s7", "Galaxy Note s7");
			session.persist(product1);
			
			Product product2 = new Product("I-Phone 6", "I phone 6 plus");
			session.persist(product2);
			
			CD cd = new CD("Teddy Afro", "Ethiopia", "Ethiopia");
			session.persist(cd);
			
			DVD dvd = new DVD("Adventure", "Lord of The Rings", "Lord of The Rings Return of The King");
			session.persist(dvd);
			
			Book book = new Book("JavaScript", "You don't know javaScript", "Scopes and Closures");
			session.persist(book);
			
			session.getTransaction().commit();
		}
		//user Sign up
		try(Session session = sessionFactory.openSession()){
			session.beginTransaction();
			Customer customer1 = new Customer("Berhanu", "Ababu");
			Customer customer2 = new Customer("Abreham", "Derso");
			
			session.persist(customer1);
			session.persist(customer2);
			session.getTransaction().commit();
		}
		
		
		try(Session session = sessionFactory.openSession()){
			session.beginTransaction();
			
			// now user logs in and sees all products and starts to order
			Customer customer = session.get(Customer.class, 1);
			@SuppressWarnings("unchecked")
			List<Product> products = session.createQuery("From Product").list();
			
			
			Order order1 = new Order(new Date());
			order1.setCustomer(customer);

			OrderLine orderLine1 = new OrderLine(2);
			orderLine1.setProduct(products.get(0));
			
			OrderLine orderLine2 = new OrderLine(10);
			orderLine2.setProduct(products.get(1));
			
			order1.setOrderline(Arrays.asList(orderLine1,orderLine2));
			
			session.persist(order1);
			
			session.getTransaction().commit();
		}
		
		try(Session session = sessionFactory.openSession()){
			session.beginTransaction();
			
			Customer customer2 = session.get(Customer.class, 2);
			@SuppressWarnings("unchecked")
			List<Product> products = session.createQuery("From Product").list();
			
			
			Order order2 = new Order(new Date());
			order2.setCustomer(customer2);
			
			OrderLine orderLine1 = new OrderLine(3);
			orderLine1.setProduct(products.get(2));
			
			OrderLine orderLine2 = new OrderLine(5);
			orderLine2.setProduct(products.get(3));
			
			OrderLine orderLine3 = new OrderLine(2);
			orderLine3.setProduct(products.get(4));
			
			order2.setOrderline(Arrays.asList(orderLine1,orderLine2,orderLine3));
			
			session.persist(order2);
			
			session.getTransaction().commit();
		}
		
		tearDown();
	}
}
