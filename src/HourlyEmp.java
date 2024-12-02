public class HourlyEmp extends Employee {
    private double hoursWorked;
    public HourlyEmp(String firstName, String lastName, String title, double payRate,double hourswork) {
        super(firstName, lastName, title, payRate);
        this.hoursWorked = hourswork;

    }

    public double calculateSalary() {
        return getPayRate() * hoursWorked;
    }
    public void display() {
        System.out.println(super.toString());
        System.out.printf("Hours Worked: %.1f%n", hoursWorked);
        System.out.printf("Weekly Pay: $%.2f%n", calculateSalary());
    }
}
