package cs544.imp1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("cd")
public class CD extends Product{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String artist;
	
	public CD(){
	}

	public CD(String artist,String name,String description) {
		super(name,description);
		this.artist = artist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
