package cs544.cxm1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String appDate;
	private Payment payment;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="doctor_firstname",referencedColumnName="firstname"),
		@JoinColumn(name="doctor_lastname",referencedColumnName="lastname")
	})
	private Doctor doctor;
	
	public Appointment(){}

	public Appointment(String appDate, Payment payment, Patient patient, Doctor doctor) {
		this.appDate = appDate;
		this.payment = payment;
		this.patient = patient;
		this.doctor = doctor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAppDate() {
		return appDate;
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
