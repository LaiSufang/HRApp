public class Department {
    // Private fields
    private String depName;
    private Employee[] employees = new Employee[10];
    private int lastAddedEmpIndex = -1;

    // Constructor:
    public Department(String depName) {
        this.depName = depName;
    }

    // getters and setters:
    public String getDepName() {
        return depName;
    }
    public void setDepName(String depName) {
        this.depName = depName;
    }

    // method to add an employee to the department:
    // if the last added employee index is less than the length of the employee array, add a new employee.
    // you can stop adding new employees once you reach the employee capacity
    public void addEmployee(Employee employee) {
        if (lastAddedEmpIndex < employees.length ) {
            lastAddedEmpIndex++;
            employees[lastAddedEmpIndex] = employee;
        }
    }

    // method to return the list of employees in the department:
    public Employee[] getEmployees() {
        Employee[] actualEmployees = new Employee[lastAddedEmpIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    // method to return the total number of employees in the department:
    public int getTotalEmployees() {
        return lastAddedEmpIndex + 1;
    }

    // method to identify an employee by ID:
    public Employee findEmployeeById(int empId) {
        for (Employee employee : employees) {
            if (employee != null && employee.getEmpId() == empId)
            {
                return employee;
            }
        }
        return null; // Return null if no employee found with the given ID
    }

    // method to return the total salary of all employees in the department:
    public double getTotalSalary() {
        double total = 0.0;
        for (int i = 0; i <= lastAddedEmpIndex; i++ ) {
            total += employees[i].getSalary();
        }
        return total;
    }

    // method to return the average salary of employees in the department:
    public double getAverageSalary() {
        if (lastAddedEmpIndex > -1) {
            return getTotalSalary() / (lastAddedEmpIndex + 1);
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return depName;
    }
}
