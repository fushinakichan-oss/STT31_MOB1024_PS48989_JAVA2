package Bai4_Lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainBai4_Lab3 {
	public static void main(String[] args) {
		List<Student> ls =new ArrayList <Student>();
		
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
		
		ls.forEach(System.out::println);
		
		Predicate<Student> gpahon32 = s -> s.getGpa() >= 3.2;
			    System.out.println(" Danh Sách Sinh Viên có GPA hơn 3,2");
		ls.stream().filter((gpahon32)).forEach(System.out::println);
		
		Comparator<Student> SAPXEPSV = Comparator.comparingDouble(Student::getGpa).reversed();
	    System.out.println("Sắp xếp sinh viên theo gpa giảm dần và lấy top 3");
		ls.stream().sorted(SAPXEPSV).limit(3).forEach(System.out::println);

		Predicate<Student> isPartTime = s -> s.getType() == Bai4_Lab3.EnumStudentType.StudentType.PART_TIME;

			Function<Student, String> getName = Student::getName;

			List<String> names = ls.stream()
			    .filter(isPartTime)
			    .map(getName)
			    .toList();

		    System.out.println("DANH SACH CHI TEN SINH VIEN PARTIME");
			names.forEach(System.out::println);
	}

}
