package cs544.cxm1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	private String doctortype;
	@EmbeddedId
	private Name name;
	@OneToMany(mappedBy="doctor",cascade=CascadeType.PERSIST)
	private List<Appointment> appointments = new ArrayList<>();
	
	public Doctor(){
		
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Doctor(String doctortype, Name name) {
		this.doctortype = doctortype;
		this.name = name;
	}
	public String getDoctortype() {
		return doctortype;
	}

	public void setDoctortype(String doctortype) {
		this.doctortype = doctortype;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public void addAppointment(Appointment appointment){
		this.appointments.add(appointment);
	}
	public void removeAppointment(int id){
		this.appointments.remove(id);
	}
	
	
}
