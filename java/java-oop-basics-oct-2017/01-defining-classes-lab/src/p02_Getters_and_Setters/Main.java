package p02_Getters_and_Setters;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setId(1);
        acc.deposit(15);
        acc.withdraw(5);

        System.out.printf("Account ID%s, balance %.2f", acc, acc.getBalance());
    }
}
