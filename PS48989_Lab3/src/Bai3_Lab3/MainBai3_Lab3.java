package Bai3_Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;


import Bai2_Lab3.Employee;

public class MainBai3_Lab3 {
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


    ToDoubleFunction<Employee> getsalary = e -> e.getSalary();
    
    double tong = ls.stream().mapToDouble(getsalary).sum();
    System.out.println("Tổng lương tất cả nhân viên.");
    System.out.println(String.format("%,d", (long)tong));
    

    ToDoubleFunction<Employee> TrungBinh = e -> e.getSalary();
    
    OptionalDouble trungBinh = ls.stream().mapToDouble(TrungBinh).average();
    System.out.println("Lương trung bình");
    System.out.println(String.format("%,d", (long)trungBinh.getAsDouble()));
    
    Comparator<Employee> top1Luong = (a,b) -> Double.compare(a.getSalary(), b.getSalary());
    
    Employee LuongCaoNhat = ls.stream().max(top1Luong).orElse(null);;
    System.out.println("Nhân viên có lương cao nhất");
    System.out.println(String.format("ID: %s, Name: %s, Salary: %,d",
            LuongCaoNhat.getId(),
            LuongCaoNhat.getName(),
            (long)LuongCaoNhat.getSalary()
        )
    		);
    }
}