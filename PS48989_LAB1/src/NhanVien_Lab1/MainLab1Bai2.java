package NhanVien_Lab1;
import java.util.ArrayList;

public class MainLab1Bai2 {
	public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        listEmployee.add(new FullTimeEmployee("FT01", "Đàm Vĩnh Tê", 1000, 200, 50));
        listEmployee.add(new FullTimeEmployee("FT02", "Duy Mạnh", 1200, 300, 0));
        listEmployee.add(new PartTimeEmployee("PT01", "Wesker 7p", 0, 40, 20));
        listEmployee.add(new PartTimeEmployee("PT02", "Smộker Siha", 0, 50, 25));
        listEmployee.add(new PartTimeEmployee("PT03", "Gộjo Satoru", 0, 30, 20));

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
