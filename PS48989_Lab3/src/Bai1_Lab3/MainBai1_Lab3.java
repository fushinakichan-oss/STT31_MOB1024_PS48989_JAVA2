package Bai1_Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MainBai1_Lab3 {
	public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
            List.of("Thanh Tín", "Khánh Tân ", "Thục Chi", "Quốc Dũng", "Trung Nghĩa",
                "Quanh Vinh", "Quốc Lan", "Minh Tín", "Phúc Kỳ", "Lê Chi"
                   )
            );


        System.out.println(" in danh sách");
       names.forEach(System.out::println);
       
        Predicate<String> dodaiten = name ->name.length()>5;
        System.out.println("tên có độ dài hơn 5");
        names.stream()
        .filter(dodaiten)   
        .forEach(System.out::println ); 
        
        Comparator<String> sapxeptuA_Z =(a,b)-> a.compareTo(b);
        System.out.println("Sắp xêps tên từ a-z");
        names.stream().sorted(sapxeptuA_Z).forEach(System.out::println);
        
        Comparator<String> sapxeptheododaiten = (a,b)-> a.length() - b.length();
        System.out.println("SẮP XẾP THEO ĐỘ DÀI TÊN");
        names.stream().sorted(sapxeptheododaiten).forEach(System.out::println);
    }
}

