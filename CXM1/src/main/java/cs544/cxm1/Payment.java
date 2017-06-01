package cs544.cxm1;

import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Embeddable
public class Payment {
	@Temporal(TemporalType.DATE)
	private Date paydate;
	private Double amount;
	
	public Payment(){
		
	}

	public Payment(Date paydate, Double amount) {
		this.paydate = paydate;
		this.amount = amount;
	}

	public Date getPaydate() {
		return paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
}
