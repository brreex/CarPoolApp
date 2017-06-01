package cs544.cxm1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ClinicApp {
	public static SessionFactory sessionFactory;

	protected static void setUp() throws Exception {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
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

		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();

			// list of registered doctors
			Doctor doctor = new Doctor("dentist", new Name("Berhanu", "Ababu"));
			session.persist(doctor);

			// register the user
			
			Address address = new Address("1000N 5 st", "52554", "FairField");
			Patient patient = new Patient("Samson", address);
			
			session.persist(patient);
			
			
			//create new Appointment for the patient
			
			Appointment appointment = new Appointment("2017-06-31", new Payment(new Date(), 200.0), patient, doctor);
			
			session.persist(appointment);
			
			session.getTransaction().commit();
		}
		tearDown();
	}
}
