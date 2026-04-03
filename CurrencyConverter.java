import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, result;
        int choice;

        System.out.println("===== CURRENCY CONVERTER =====");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");

        System.out.print("Choose option: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        switch (choice) {
            case 1:
                result = amount / 83;
                System.out.println("Converted Amount: " + result + " USD");
                break;

            case 2:
                result = amount * 83;
                System.out.println("Converted Amount: " + result + " INR");
                break;

            case 3:
                result = amount / 90;
                System.out.println("Converted Amount: " + result + " EUR");
                break;

            case 4:
                result = amount * 90;
                System.out.println("Converted Amount: " + result + " INR");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}