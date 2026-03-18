package NhanVien_Lab1;
import java.util.ArrayList;

public class MainLab1Bai2 {
	public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        listEmployee.add(new FullTimeEmployee("A01", "Đàm Vĩnh Tê", 1000, 200, 50));
        listEmployee.add(new FullTimeEmployee("A02", "Đặng Duy Mạnh", 1200, 300, 0));
        listEmployee.add(new PartTimeEmployee("B01", "Lê Công An", 0, 40, 20));
        listEmployee.add(new PartTimeEmployee("B02", "Nguyễn Trường An", 0, 50, 25));
        listEmployee.add(new PartTimeEmployee("B03", "Bùi Đức Thuận", 0, 30, 20));

        for (Employee e : listEmployee) {
            System.out.println(e.toString());
        }

        if (!listEmployee.isEmpty()) {
            Employee maxEmployee = listEmployee.get(0);
            for (Employee e : listEmployee) {
                if (e.income() > maxEmployee.income()) {
                    maxEmployee = e;
                }
            }
            System.out.println(maxEmployee.toString());
        }
    }

}
