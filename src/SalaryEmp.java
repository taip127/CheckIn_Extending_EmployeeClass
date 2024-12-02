public class SalaryEmp extends Employee {
    public SalaryEmp(String firstName, String lastName, String title, double payRate) {
        super(firstName, lastName, title, payRate);
    }
    public double calculateSalary() {
        return getPayRate()/24;
    }
    public void display() {
        System.out.println(super.toString());
        System.out.println("bi-monthly Salary: " + calculateSalary());
    }
}
