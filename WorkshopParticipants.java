import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorkshopParticipants {
    private Map<String, ArrayList<String>> companyEmployees;

    public WorkshopParticipants() {
        companyEmployees = new HashMap<>();
    }

    public void addEmployee(String company, String name) {
        if (!companyEmployees.containsKey(company)) {
            companyEmployees.put(company, new ArrayList<>());
        }
        companyEmployees.get(company).add(name);
    }

    public void displayEmployees() {
        for (Map.Entry<String, ArrayList<String>> entry : companyEmployees.entrySet()) {
            System.out.println("Company: " + entry.getKey());
            for (String name : entry.getValue()) {
                System.out.println(" - " + name);
            }
        }
    }

    public static void main(String[] args) {
        WorkshopParticipants workshop = new WorkshopParticipants();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees for each company:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter company " + i + " name: ");
            String company = scanner.nextLine();

            System.out.print("How many employees from " + company + "? ");
            int numEmployees = scanner.nextInt();
            scanner.nextLine(); 

            for (int j = 1; j <= numEmployees; j++) {
                System.out.print("Enter employee " + j + " name: ");
                String name = scanner.nextLine();
                workshop.addEmployee(company, name);
            }
        }

        System.out.println("\nList of workshop participants:");
        workshop.displayEmployees();

        scanner.close();
    }
}
