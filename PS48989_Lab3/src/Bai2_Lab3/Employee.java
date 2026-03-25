package Bai2_Lab3;

public class Employee {
	String id;
    String name;
    double Salary;

    public Employee() {
    }

    public Employee(String id, String name, double Salary) {
        this.id = id;
        this.name = name;
        this.Salary = Salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Name: %s, Salary: %,d", id, name, (long)getSalary());
    }
  }


