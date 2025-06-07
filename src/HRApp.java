
public class HRApp {
    public static void main(String[] args) {
        System.out.println("Welcome to HR App!");

        // Create some employees
        Employee emp1 = new Employee(1, "John", "Doe", 50000);
        Employee emp2 = new Employee(2, "Jane", "Smith", 60000);
        Employee emp3 = new Employee(3, "Alice", "Johnson", 55000);
        Employee emp4 = new Employee(4, "Bob", "Brown", 70000);

        // Create a department
        Department eduDep = new Department("Education");
        System.out.println(eduDep);

        // Add employees to the department
        eduDep.addEmployee(emp1);
        eduDep.addEmployee(emp2);
        eduDep.addEmployee(emp3);
        eduDep.addEmployee(emp4);

        Employee[] employees = eduDep.getEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Total Salary: $" + eduDep.getTotalSalary());
        System.out.println("Average Salary: $" + eduDep.getAverageSalary());
        // Search an employee by ID
        System.out.println(eduDep.findEmployeeById(2));
        System.out.println(eduDep.findEmployeeById(20));

        }
    }
