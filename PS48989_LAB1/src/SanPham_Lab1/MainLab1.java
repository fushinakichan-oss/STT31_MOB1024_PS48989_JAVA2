package SanPham_Lab1;
import java.util.ArrayList;

public class MainLab1 {
	public static void main(String[]args) {
		ArrayList<Product> listProduct= new ArrayList<Product>();
		Product p1=new Product("Ao01","Ao Thun",10);
		listProduct.add(p1);
		listProduct.add(new Product("Ao02","Ao So Mi",12));
		listProduct.add(new ImportedProduct("Q01","Quan Tay",15,0.1,1));
		listProduct.add(new ImportedProduct("Q02","Quan Jean",20,0.2,1));
		listProduct.add(new ImportedProduct("Q03","Quan Bo",25,0.4,1));
		
		for(Product p:listProduct) {
			if (p instanceof ImportedProduct) {
	            System.out.print("[San Pham Nhap Khau] ");
	        } else {
	            System.out.print("[San Pham] ");
	        }
	        System.out.println(p.toString());
		}
    }
}
