package NhanVien_Lab1;

public class FullTimeEmployee extends Employee {
	private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        this.setBonus(bonus);
        this.setPenalty(penalty);
        }

    public void setBonus(double bonus) { 
    	if (bonus >= 0) 
    		this.bonus = bonus; 
    	}
    public void setPenalty(double penalty) { 
    	if (penalty >= 0) 
    		this.penalty = penalty; 
    	}

    @Override
    public double income() {
        return getBasicSalary() + bonus - penalty;
        }

    @Override
    public String toString() {
        return super.toString() + " [Full-time: Thưởng=" + bonus + ", Phạt=" + penalty + "]";
        }

}
