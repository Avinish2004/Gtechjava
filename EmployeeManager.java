import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    private ArrayList<String> employeeNames;

    public EmployeeManager() {
        employeeNames = new ArrayList<>();
    }

    public void addEmployee(String name) {
        employeeNames.add(name);
    }

    public void displayEmployees() {
        System.out.println("Employee Names:");
        for (String name : employeeNames) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    manager.addEmployee(name);
                    break;
                case 2:
                    manager.displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
