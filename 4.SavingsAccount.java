import java.util.Scanner;

public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate / 12) / 100;
        savingsBalance += monthlyInterest;
    }

    public void printSavingsBalance() {
        System.out.printf("Savings Balance: $%.2f%n", savingsBalance);
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial balance: $");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double annualInterestRate = scanner.nextDouble();
        SavingsAccount.modifyInterestRate(annualInterestRate);

        SavingsAccount saver = new SavingsAccount(initialBalance);

        System.out.print("Enter the number of months: ");
        int months = scanner.nextInt();

        for (int month = 1; month <= months; month++) {
            saver.calculateMonthlyInterest();
        }

        saver.printSavingsBalance();

        scanner.close();
    }
}
