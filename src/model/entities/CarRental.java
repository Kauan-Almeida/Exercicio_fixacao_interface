package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date Start;
	private Date finish;
	
	private Vehicle vehivcle;
	private Invoice invoice;
	
	public CarRental() {	
	}

	public CarRental(Date start, Date finish, Vehicle vehivcle) {
		Start = start;
		this.finish = finish;
		this.vehivcle = vehivcle;
	}

	public Date getStart() {
		return Start;
	}

	public void setStart(Date start) {
		Start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Vehicle getVehivcle() {
		return vehivcle;
	}

	public void setVehivcle(Vehicle vehivcle) {
		this.vehivcle = vehivcle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
