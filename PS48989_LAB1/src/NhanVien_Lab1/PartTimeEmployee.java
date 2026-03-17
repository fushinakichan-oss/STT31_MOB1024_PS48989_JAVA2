package NhanVien_Lab1;

public class PartTimeEmployee extends Employee{
	private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
        super(id, name, basicSalary);
        this.setWorkingHours(workingHours);
        this.setHourlyRate(hourlyRate);
    }

    public void setWorkingHours(double workingHours) { 
    	if (workingHours >= 0) 
    		this.workingHours = workingHours; 
    	}
    public void setHourlyRate(double hourlyRate) { 
    	if (hourlyRate >= 0) this.hourlyRate = hourlyRate; 
    	}

    @Override
    public double income() {
        return workingHours * hourlyRate;
        }

    @Override
    public String toString() {
        return super.toString() + " [Part-time: H làm=" + workingHours + ", Giá/h=" + hourlyRate + "]";
        }

}
