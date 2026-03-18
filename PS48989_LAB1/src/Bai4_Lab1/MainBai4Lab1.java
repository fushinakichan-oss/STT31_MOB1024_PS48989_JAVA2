
	package Bai4_Lab1;
	import java.util.ArrayList;

	public class MainBai4Lab1 {
	    public static void main(String[] args) {
	        ArrayList<Ticket> listTicket = new ArrayList<>();

	        listTicket.add(new Ticket("T01", "Nguyen Van A", 100));
	        listTicket.add(new Ticket("T02", "Tran Thi B", 150));
	        listTicket.add(new VIPTicket("V01", "Lê Văn C", 200, 50, 0.1)); // Giảm 10%
	        listTicket.add(new VIPTicket("V02", "Hoàng Thị D", 300, 50, 0.2)); // Giảm 20%
	        listTicket.add(new Ticket("T03", "Phạm Văn E", 80));

	        Ticket minTicket = listTicket.get(0);

	        for (Ticket t : listTicket) {
	            System.out.println(t.toString() + "Tổng tiền: " + t.calculateTotal());
	            
	            if (t.calculateTotal() < minTicket.calculateTotal()) {
	                minTicket = t;
	            }
	        }

	        System.out.println(minTicket.toString() + "Giá: " + minTicket.calculateTotal());
	    }
	}


