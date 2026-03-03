import java.sql.*;
import java.util.Scanner;
import java.time.LocalDate;

public class Lab {

    private static final String URL = "jdbc:mysql://localhost:3306/lab_management";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=====LAB MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Lab Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Stock");
            System.out.println("4. Record Item Usage");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addItem(sc);
                    break;
                case 2:
                    viewItems();
                    break;
                case 3:
                    updateStock(sc);
                    break;
                case 4:
                    recordUsage(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
