import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    void create(String name, int number, String type) {
        customerName = name;
        accountNumber = number;
        accountType = type;
        balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Updated balance: " + balance);
    }

    void display() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Type of Account: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
}

class Savings extends Account {
    void computeInterest() {
        double interest = balance * 0.04; // 4% interest
        balance += interest;
        System.out.println("Interest added: " + interest + ". Updated balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class Current extends Account {
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc1 = sc.nextInt();
        sc.nextLine();
        Savings s = new Savings();
        s.create(name1, acc1, "saving");

        System.out.print("Enter customer name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc2 = sc.nextInt();
        sc.nextLine();
        Current c = new Current();
        c.create(name2, acc2, "current");

        int choice;
        do {
            System.out.println("\n------MENU------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute Interest for Savings Account");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the type of account (saving/current): ");
                    String t = sc.next();
                    System.out.print("Enter the deposit amount: ");
                    double d = sc.nextDouble();
                    if (t.equalsIgnoreCase("saving"))
                        s.deposit(d);
                    else
                        c.deposit(d);
                }

                case 2 -> {
                    System.out.print("Enter the type of account (saving/current): ");
                    String t = sc.next();
                    System.out.print("Enter the withdrawal amount: ");
                    double w = sc.nextDouble();
                    if (t.equalsIgnoreCase("saving"))
                        s.withdraw(w);
                    else
                        c.withdraw(w);
                }

                case 3 -> s.computeInterest();

                case 4 -> {
                    System.out.print("Enter the type of account (saving/current): ");
                    String t = sc.next();
                    if (t.equalsIgnoreCase("saving"))
                        s.display();
                    else
                        c.display();
                }

                case 5 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
