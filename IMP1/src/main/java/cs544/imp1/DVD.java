package cs544.imp1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@DiscriminatorValue("dvd")
public class DVD extends Product{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String genere;
	
	public DVD(){}

	public DVD(String genere,String name,String description) {
		super(name, description);
		this.genere = genere;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
}
