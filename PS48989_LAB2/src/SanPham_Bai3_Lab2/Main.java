package SanPham_Bai3_Lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("P01", "Bánh mì", 15000.0, ProductCategory.FOOD));
        list.add(new Product("P02", "Sữa tươi", 12000.0, ProductCategory.FOOD));
        list.add(new Product("P03", "iPhone 15", 25000000.0, ProductCategory.ELECTRONIC));
        list.add(new Product("P04", "Laptop", 18000000.0, ProductCategory.ELECTRONIC));
        list.add(new Product("P05", "Áo thun", 250000.0, ProductCategory.CLOTHING));
        list.add(new Product("P06", "Quần Jean", 450000.0, ProductCategory.CLOTHING));
        list.add(new Product("P07", "Chuột ", 500000.0, ProductCategory.ELECTRONIC));
        list.add(new Product("P08", "Váy ", 350000.0, ProductCategory.CLOTHING));


        Comparator<Product> com = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice()); 
            }
        };
        Collections.sort(list, com);
        
        for (Product p : list) {
            System.out.println(p);
        }

        Map<ProductCategory, Integer> countMap = new HashMap<>();
        Map<ProductCategory, Double> sumMap = new HashMap<>();

        for (Product p : list) {
            ProductCategory cat = p.getCategory();
            countMap.put(cat, countMap.getOrDefault(cat, 0) + 1);
            sumMap.put(cat, sumMap.getOrDefault(cat, 0.0) + p.getPrice());
        }

        System.out.println("\n--- Thống Kê ---");
        for (Map.Entry<ProductCategory, Integer> entry : countMap.entrySet()) {
            ProductCategory key = entry.getKey();
            System.out.println("Loại: " + key + " | Số lượng: " + entry.getValue() +" | Tổng giá trị: " + sumMap.get(key));
        }
    }
}