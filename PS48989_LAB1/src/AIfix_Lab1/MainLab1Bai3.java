package AIfix_Lab1;
import NhanVien_Lab1.*;
import java.util.ArrayList;

public class MainLab1Bai3 {
	public static void main(String[] args) {
        ArrayList<Employee> listEmployee = new ArrayList<>();

        // --- BƯỚC 1: DÙNG AI TẠO DỮ LIỆU MẪU (BAO GỒM DỮ LIỆU LỖI) ---
        // 1. Dữ liệu đúng
        listEmployee.add(new FullTimeEmployee("FT01", "Nguyễn An", 1500, 200, 0));
        
        // 2. LỖI: ID rỗng (Dữ liệu lỗi 1)
        listEmployee.add(new FullTimeEmployee("", "Trần Bình", 2000, 100, 50));
        
        // 3. LỖI: Lương cơ bản âm (Dữ liệu lỗi 2)
        listEmployee.add(new PartTimeEmployee("PT01", "Lê Chi", -500, 40, 20));
        
        // 4. Dữ liệu đúng
        listEmployee.add(new PartTimeEmployee("PT02", "Phạm Dương", 0, 50, 30));
        listEmployee.add(new FullTimeEmployee("FT02", "Hoàng Giang", 1800, 150, 20));

        System.out.println(">>> TRẠNG THÁI: Đang quét và sửa lỗi dữ liệu bằng AI...");
        
        // --- BƯỚC 2: SỬ DỤNG LOGIC AI ĐỂ FIX LỖI ---
        for (Employee e : listEmployee) {
            fixDataError(e);
        }

        // --- BƯỚC 3: IN DANH SÁCH SAU KHI ĐÃ FIX ---
        System.out.println("\n======= DANH SÁCH NHÂN VIÊN (ĐÃ CHUẨN HÓA) =======");
        for (Employee e : listEmployee) {
            System.out.println(e.toString());
        }

        // --- BƯỚC 4: TÌM THU NHẬP CAO NHẤT (DÙNG STREAM API) ---
        System.out.print("\n>>> NHÂN VIÊN CÓ THU NHẬP CAO NHẤT: ");
        Employee maxEmp = listEmployee.get(0); 
        for (Employee e : listEmployee) {
            if (e.income() > maxEmp.income()) {
                maxEmp = e; 
            }
        }
        System.out.println(maxEmp);
    }

    /**
     * Hàm giả lập AI để tự động phát hiện và sửa lỗi dữ liệu
     */
    public static void fixDataError(Employee e) {
        // Kiểm tra lỗi ID
        if (e.getId() == null || e.getId().trim().isEmpty()) {
            String autoID = "FIXED_ID_" + (int)(Math.random() * 1000);
            e.setId(autoID);
            System.err.println("[FIXED] Đã sửa ID trống cho NV: " + e.getName() + " -> " + autoID);
        }

        // Kiểm tra lỗi Lương âm
        if (e.getBasicSalary() < 0) {
            e.setBasicSalary(0);
            System.err.println("[FIXED] Đã đưa lương âm về 0 cho ID: " + e.getId());
        }
    }

}
