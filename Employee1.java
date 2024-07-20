// Employee.java
public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Overriding the toString() method to print the employee details
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

// EmployeeTest.java
public class EmployeeTest {
    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[3];

        // Initialize Employee objects
        employees[0] = new Employee("Alice", 1, 50000);
        employees[1] = new Employee("Bob", 2, 60000);
        employees[2] = new Employee("Charlie", 3, 70000);

        // Print Employee objects
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
