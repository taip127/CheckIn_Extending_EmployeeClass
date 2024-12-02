import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Employee employee1 = new Employee("tai","pham","student",19.5);
        Employee employee2 = new Employee("john","doe","teacher",20.5);
        Employee employee3 = new Employee("tai","pham","student",19.5);
        System.out.println(employee1.calculateWeeklySalary());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        employee1.setFirstName("Tony");
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.toString());
        System.out.println(employee1.equals(employee3));*/

     /*   SalaryEmp salaryEmp = new SalaryEmp("tai","pham","student",60000);
        HourlyEmp hourlyEmp = new HourlyEmp("john","doe","teacher",20.5);

        salaryEmp.display();
        hourlyEmp.display();*/

        inputEmployee();
    }

    public static void inputEmployee(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee type(salary/hourly): ");
        String emptype = input.nextLine().trim().toLowerCase();

        Employee employee;
        switch (emptype) {
            case "salary": {
                System.out.print("Enter first name: ");
                String firstname = input.nextLine();
                System.out.print("Enter last name: ");
                String lastname = input.nextLine();
                System.out.print("Enter title: ");
                String title = input.nextLine();
                System.out.print("Enter annual salary: ");
                double salary = input.nextDouble();

                employee = new SalaryEmp(firstname, lastname, title, salary);
                ((SalaryEmp) employee).display();

                break;
            }
            case "hourly": {
                System.out.print("Enter first name: ");
                String firstname = input.nextLine();
                System.out.print("Enter last name: ");
                String lastname = input.nextLine();
                System.out.print("Enter title: ");
                String title = input.nextLine();
                System.out.print("Enter hourly salary: ");
                double salary = input.nextDouble();
                System.out.print("Enter hours worked: ");
                double hoursWorked = input.nextDouble();
                employee = new HourlyEmp(firstname, lastname, title, salary, hoursWorked);
                ((HourlyEmp) employee).display();
            }
            default:
                System.out.println("Invalid employee type");

        }
        input.close();
    }
}