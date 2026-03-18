package Bai4_Lab1;

public class VIPTicket extends Ticket {
    private double serviceFee;
    private double discountRate;

    public VIPTicket() {}

    public VIPTicket(String id, String customerName, double basePrice, double serviceFee, double discountRate) {
        super(id, customerName, basePrice);
        this.serviceFee = (serviceFee >= 0) ? serviceFee : 0;
        this.setDiscountRate(discountRate);
    }

    public double getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(double serviceFee) {
        this.serviceFee = serviceFee;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public boolean setDiscountRate(double discountRate) {
        if (discountRate >= 0 && discountRate <= 1) {
            this.discountRate = discountRate;
            return true;
        }
        return false;
    }

    @Override
    public double calculateTotal() {

        return getBasePrice() + serviceFee - (getBasePrice() * discountRate);
    }

    @Override
    public String toString() {
        return super.toString() + " | VIP [Service Fee: " + serviceFee + ", Discount: " + (discountRate * 100) + "%]";
    }
}