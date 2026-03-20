package NhanVien_Bai3_Lab2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> list = new ArrayList<>();

    public void add(Employee e) {
        list.add(e);
    }

    public void show() {
        if (list.isEmpty()) {
            System.out.println("Danh sách nhân viên bị trống");
            return;
        }
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    public void updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e != null) {
            e.setSalary(newSalary);
            System.out.println("Thành công cập nhật lương cho nhân viên: " + e.getName());
        } else {
            System.out.println("Không thể tìm thấy nhân viên với ID: " + id);
        }
    }
}
