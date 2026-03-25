package Bai2_Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainBai2_Lab3 {
	public static void main(String[] args) {
		
	List<Employee> ls = new ArrayList<Employee>();
	
	ls.add(new Employee("E01", "Anh", 12000000));
    ls.add(new Employee("E02", "Bắc", 18000000));
    ls.add(new Employee("E03", "Cường", 15000000));
    ls.add(new Employee("E04", "Danh", 9000000));
    ls.add(new Employee("E05", "Hình", 20000000));
    ls.add(new Employee("E06", "Hà", 17000000));
    ls.add(new Employee("E07", "Linh", 14000000));
    ls.add(new Employee("E08", "Mạnh", 16000000));
    
    ls.forEach(System.out::println);
    
    
    Predicate<Employee> salary = e -> e.getSalary() >= 15000000;
    System.out.println("Nhân viên có salary >= 15_000_000");
    ls.stream().filter(salary).forEach(System.out::println);
    

    Comparator<Employee> GiamdanTheoLuong = (a,b) -> Double.compare(b.getSalary(),a.getSalary());
    System.out.println("Sắp xếp nhân viên theo salary giảm dần");
    ls.stream().sorted(GiamdanTheoLuong).forEach(System.out::println);
    
    Function<Employee, String> GetName = ten ->ten.getName();
    List<String> names = ls.stream()
        .map(GetName)
    	    .collect(Collectors.toList());
    
    System.out.println("Danh sách tên nhân viên từ danh sách nhân viên");
    ls.stream()
    .map(GetName)   
    .forEach(System.out::println); 
       
    Predicate<Employee> tenBatDauA = e -> e.getName().toLowerCase().startsWith("a");

    	long count = ls.stream()
    	    .filter(tenBatDauA)
    	    .count();
    	System.out.println("Đếm số nhân viên có tên bắt đầu bằng chữ “A” ");
    	ls.stream()
	    .filter(tenBatDauA)
    	.forEach(System.out::println);

    	System.out.println("Số lượng: " + count);
    	
}
	
}
	