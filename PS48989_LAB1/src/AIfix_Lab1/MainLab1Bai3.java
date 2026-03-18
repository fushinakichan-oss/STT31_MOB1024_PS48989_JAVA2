package AIfix_Lab1;
import java.util.ArrayList;
import java.util.List;

public class MainLab1Bai3 {
		static class Student {
	        String name;
	        String email;
	        double score;

	        public Student(String name, String email, double score) {
	            this.name = name;
	            this.email = email;
	            this.score = score;
	        }

	        @Override
	        public String toString() {
	            return String.format("| %-15s | %-20s | %-5.1f |", name, email, score);
	        }
	    }

	    public static void main(String[] args) {
	        List<Object[]> rawData = new ArrayList<>();
	        rawData.add(new Object[]{"Minh Tin", "tinntm@fpt.edu.vn", 9.5}); 
	        rawData.add(new Object[]{"", "error@gmail.com", 8.0});           
	        rawData.add(new Object[]{"Tran Van A", "abc-gmail.com", 7.0});    
	        rawData.add(new Object[]{"Le Thi B", "lethib@fpt.edu.vn", -5.0});
	        rawData.add(new Object[]{"Hoang C", "hoang@fpt.edu.vn", "10đ"});  

	        List<Student> validStudents = new ArrayList<>();

	        System.out.println("--- QUÁ TRÌNH AI KIỂM TRA VÀ FIX LỖI ---");

	        for (Object[] data : rawData) {
	            try {
	                String name = (String) data[0];
	                String email = (String) data[1];
	                

	                double score;
	                if (data[2] instanceof String) {

	                    String scoreStr = ((String) data[2]).replaceAll("[^0-9.]", "");
	                    score = Double.parseDouble(scoreStr);
	                    System.out.println("[FIXED] Đã chuyển đổi điểm '" + data[2] + "' thành " + score);
	                } else {
	                    score = (Double) data[2];
	                }
	                if (name == null || name.trim().isEmpty()) {
	                    throw new Exception("Lỗi: Tên không được để trống!");
	                }
	                if (!email.contains("@") || !email.contains(".")) {
	                    throw new Exception("Lỗi: Định dạng Email '" + email + "' không hợp lệ!");
	                }
	                if (score < 0 || score > 10) {
	                    throw new Exception("Lỗi: Điểm " + score + " nằm ngoài phạm vi (0-10)!");
	                }
	                validStudents.add(new Student(name, email, score));

	            } catch (Exception e) {
	                System.out.println("[REJECTED] " + e.getMessage());
	            }
	        }

	        System.out.println("\n--- DANH SÁCH DỮ LIỆU ĐÃ LÀM SẠCH ---");
	        System.out.println("-----------------------------------------------------");
	        System.out.println("| Họ và Tên       | Email                | Điểm  |");
	        System.out.println("-----------------------------------------------------");
	        for (Student s : validStudents) {
	            System.out.println(s);
	        }
	        System.out.println("-----------------------------------------------------");
	    }
}
