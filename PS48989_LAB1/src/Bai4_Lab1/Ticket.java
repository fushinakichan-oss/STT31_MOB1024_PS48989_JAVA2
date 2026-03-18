package Bai4_Lab1;

public class Ticket {
	private String id;
	private String customerName;
	private double basePrice;
	
	
	public Ticket() {
	}
	public Ticket(String id, String customerName, double basePrice) {
		this.setId(id);
		this.customerName = customerName;
		this.setBasePrice(basePrice);
	}
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if(id!=""){
		this.id = id;
	    return true;
		}
		return false;
	}
	public String getName() {
		return customerName;
	}
	public void setName(String customerName) {
		this.customerName = customerName;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public boolean setBasePrice(double basePrice) {
		if(basePrice>=0) {
		this.basePrice = basePrice;
		return true;
	    }
	return false;
	}
	public double calculateTotal() {
		return this.basePrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", customerName=" + customerName + ", basePrice=" + basePrice +"]";
	}

}
