import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PaymentMenu {

    private static Map<String, Customer> customerData = new HashMap<>();
    private static Map<String, StringBuilder> history_of_transactions = new HashMap<>();
    private static List<Customer> customers = new ArrayList<>();

    public enum CardBrand {
        VISA,
        MASTERCARD
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        customers.add(new Customer("John", "1234567890123456", 8000.0, CardBrand.VISA));
        customers.add(new Customer("Sam", "6543210987654321", 600.0, CardBrand.MASTERCARD));

        while (!exit) {
            System.out.println("\nWelcome to our payment system!");
            System.out.println("Hello, make your choise!\n1 Make payment\n2 Check balance" +
                    "\n3 Add customer\n4 Remove client\n5 View transaction history" +
                    "\n6 Reverse transaction\n7 List of client\n8 Increase credit history" +
                    "\n9 Export transaction history\n0 Exit");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    performPayment(scanner);
                    break;
                case 2:
                    checkBalance(scanner);
                    break;
                case 3:
                    addNewCustomer(scanner);
                    break;
                case 4:
                    removeCustomer(scanner);
                    break;
                case 5:
                    viewTransactionHistory(scanner);
                    break;
                case 6:
                    refundTransaction(scanner);
                    break;
                case 7:
                    listCustomers();
                    break;
                case 8:
                    increaseCreditLimit(scanner);
                    break;
                case 9:
                    exportTransactionHistoryToFile(scanner);
                    break;
                default:
                    System.out.println("Invalid option. Please try again...");
            }
        }

        scanner.close();
    }

    private static void performPayment(Scanner scanner) {
    }

    private static boolean isValidCardNumber(String cardNumber) {
        return false;
    }

    private static boolean processPayment(String cardNumber, double amount, int cvv, int expirationMonth,
                                          int expirationYear, int installments) {
        return false;
    }

    private static void recordTransaction(String cardNumber, double amount, int installments) {
    }

    private static String getCurrentDate() {
        return null;
    }

    private static String getCurrentTime() {
        return null;
    }

    private static void checkBalance(Scanner scanner) {
    }

    private static void addNewCustomer(Scanner scanner) {
    }

    private static void removeCustomer(Scanner scanner) {
    }

    private static void viewTransactionHistory(Scanner scanner) {
    }

    private static void refundTransaction(Scanner scanner) {
    }

    private static void listCustomers() {
    }

    private static void increaseCreditLimit(Scanner scanner) {
    }

    private static void exportTransactionHistoryToFile(Scanner scanner) {
    }
}

class Customer {
    private String name;
    private String cardNumber;
    private double balance;
    private PaymentMenu.CardBrand cardBrand;

    public Customer(String name, String cardNumber, double balance, PaymentMenu.CardBrand cardBrand) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.cardBrand = cardBrand;
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}