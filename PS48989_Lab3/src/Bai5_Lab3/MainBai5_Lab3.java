package Bai5_Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;


import Bai4_Lab3.EnumStudentType.StudentType;
import Bai4_Lab3.Student;

public class MainBai5_Lab3 {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList <Student> ();
		
		ls.add(new Student("S01", "Nguyen Van A", Bai4_Lab3.EnumStudentType.StudentType.REGULAR, 3.2));
		ls.add(new Student("S02", "Tran Thi B", Bai4_Lab3.EnumStudentType.StudentType.INTERNATIONAL, 3.8));
		ls.add(new Student("S03", "Le Van C", Bai4_Lab3.EnumStudentType.StudentType.PART_TIME, 2.5));
		ls.add(new Student("S04", "Pham Thi D", Bai4_Lab3.EnumStudentType.StudentType.REGULAR, 1.8));
		ls.add(new Student("S05", "Hoang Van E", Bai4_Lab3.EnumStudentType.StudentType.PART_TIME, 3.0));
		ls.add(new Student("S06", "Do Thi F", Bai4_Lab3.EnumStudentType.StudentType.INTERNATIONAL, 3.9));
		ls.add(new Student("S07", "Bui Van G", Bai4_Lab3.EnumStudentType.StudentType.REGULAR, 2.7));
		ls.add(new Student("S08", "Dang Thi H", Bai4_Lab3.EnumStudentType.StudentType.PART_TIME, 1.5));
		ls.add(new Student("S09", "Vo Van I", Bai4_Lab3.EnumStudentType.StudentType.REGULAR, 3.4));
		ls.add(new Student("S10", "Nguyen Thi K", Bai4_Lab3.EnumStudentType.StudentType.INTERNATIONAL, 3.7));
		
		Function<Student, StudentType> getType = Student::getType;

		Collector<Student, ?, Long> countingCollector = Collectors.counting();
		Map<StudentType, Long> countByType =
			    ls.stream().collect(Collectors.groupingBy( getType,countingCollector));
		
		System.out.println("Đếm số sinh viên theo từng StudentType.");
		countByType.forEach((type, count) ->
	    System.out.println(type + ": " + count));
		
		Function<Student, StudentType> laydanhsach = Student::getType;

		Collector<Student, ?, Double> avgGpaCollector =
		    Collectors.averagingDouble(Student::getGpa);
		
		Map<StudentType, Double> GPAtrungbinh =
			    ls.stream()
			      .collect(Collectors.groupingBy(laydanhsach,avgGpaCollector));
		
		System.out.println("Tính GPA trung bình theo từng StudentType.");
		GPAtrungbinh.forEach((type, avg) ->
	    System.out.println(type + ": " + avg));

		
		Comparator<Map.Entry<StudentType, Double>> loaiSV =
			    Map.Entry.comparingByValue();
		
		Map.Entry<StudentType, Double> maxEntry =
			    GPAtrungbinh.entrySet()
			                .stream()
			                .max(loaiSV)
			                .orElse(null);
		
		System.out.println("In loại sinh viên có GPA trung bình cao nhất");
		if (maxEntry != null) {
		    System.out.println("Top type: " + maxEntry.getKey());
		    System.out.println("Avg GPA: " + maxEntry.getValue());
		}
	}

}
