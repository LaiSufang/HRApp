public class Employee {
    // private fields
    private int empId;
    private String empFirstName;
    private String empLastName;
    private double salary;

    // Constructor
    public Employee(int empId, String empFirstName, String empLastName, double salary) {
        this.empId = empId;
        this.empFirstName = empFirstName;
        this.empLastName = empLastName;
        this.salary = salary;
    }

    // getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getEmpId() + ", " + getEmpFirstName() + " " + getEmpLastName() + ", $" + getSalary();
    }
}
