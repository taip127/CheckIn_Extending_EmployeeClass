import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String title;
    private double payRate;

    public Employee(String firstName, String lastName, String title, double payRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.payRate = payRate;
    }

    public double calculateWeeklySalary() {
        return payRate * 40;

    }
    public double calculateSalary() {
        return 0.0;
    }

    public String getFirstName() {return firstName;}
    public String getLastName(){ return lastName; }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setTitle(String title) {this.title = title;}
    public void setPayRate(double payRate) {this.payRate = payRate;};
    public String getTitle() {return title;}
    public double getPayRate() {return payRate;}


    @Override
    public String toString() {
//        System.out.printf("firstName=%s, lastName=%s, title=%s,payRate=%f\n", firstName, lastName, title, payRate);
        return "firstName="+firstName+",lastName="+lastName+", title="+title+",payRate="+ payRate;
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Double.compare(employee.payRate, payRate) == 0 && Objects.equals(this.firstName, employee.firstName) && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.title, employee.title);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, title, payRate);
    }
}




