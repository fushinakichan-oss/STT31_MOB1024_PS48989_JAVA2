package SinhVien_Bai3_Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
        List<Student> list = new ArrayList<>();
        list.add(new Student("SV01", "Tuấn", StudentType.REGULAR));
        list.add(new Student("SV02", "Cường", StudentType.PART_TIME));
        list.add(new Student("SV03", "Phương", StudentType.INTERNATIONAL));
        list.add(new Student("SV04", "Lan", StudentType.REGULAR));
        list.add(new Student("SV05", "Huệ", StudentType.PART_TIME));
        list.add(new Student("SV06", "Minh", StudentType.INTERNATIONAL));

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getType().compareTo(o2.getType());
            }
        };
        Collections.sort(list, com);

        for (Student s : list) {
            System.out.println(s);
        }

        for (StudentType t : StudentType.values()) {
            int count = 0;
            System.out.println(" Loại: " + t);
            for (Student s : list) {

                if (s.getType() == t) {
                    System.out.println("   + " + s.getName());
                    count++;
                }
            }
            System.out.println(" Tổng: " + count);
        }
    }

}
