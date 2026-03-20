package SanPham_Bai3_Lab2;

public class Product {
	private String id;
    private String name;
    private Double price;
    private ProductCategory category;
    
    public Product() {
    }
    
    public Product(String id, String name, double price, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() { 
    	return id; 
    	}
    
    public String getName() { 
    	return name; 
    	}
    
    public Double getPrice() { 
    	return price; 
    	}
    
    public ProductCategory getCategory() { 
    	return category; 
    	}

    @Override
    public String toString() {
        return "ID: " + id + " | Tên: " + name + " | Giá: " + price + " | Loại: " + category;
    }

}
