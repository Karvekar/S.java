import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary() {
        this.salary = this.salary * 1.10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Salary: $");
        double salary = scanner.nextDouble();

        // Create an Employee object using user input
        Employee employee1 = new Employee(employeeId, employeeName, salary);

        // Print employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Employee Name: " + employee1.getEmployeeName());
        System.out.println("Salary: $" + employee1.getSalary());

        // Raise the salary by 10%
        employee1.raiseSalary();

        // Print updated salary
        System.out.println("\nUpdated Salary: $" + employee1.getSalary());

        // Close the scanner
        scanner.close();
    }
}
