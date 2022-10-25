import java.util.*;
abstract class Accounts {
    double balance;
    long accountNumber;
    String accountHoldersName = new String();
    String address = new String();

    Accounts(long ac, String name, double bal, String add) {
        accountNumber = ac;
        balance = bal;
        accountHoldersName = name;
        address = add;
    }

    abstract void withrawl(double d);

    abstract void deposit(double d);

    void display() {
        System.out.println("Availiable Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    SavingsAccount(long ac, String name, double bal, String add) {
        super(ac, name, bal, add);
    }

    final double rateOfInterest = 3.5;// in percentage

    void calculateAmount() {
        super.balance += rateOfInterest / 100 * super.balance;
    }

    void withrawl(double amt) {
        super.balance -= amt;
    }

    void deposit(double amt) {
        super.balance += amt;
    }
}

class p13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = new String();
        long acn;
        double b, a;
        String add = new String();
        int ch;
        System.out.print("Enter Account Number: ");
        acn = sc.nextLong();
        System.out.print("Enter Name: ");
        n = sc.next();
        System.out.print("Enter Address: ");
        add = sc.next();
        System.out.print("Enter Initial Amount: ");
        b = sc.nextDouble();
        SavingsAccount ob = new SavingsAccount(acn, n, b, add);
        while (true) {
            System.out.print("1. Deposit 2. Withraw 3. Display Balance");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    a = sc.nextDouble();
                    ob.deposit(a);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    a = sc.nextDouble();
                    ob.withrawl(a);
                    break;

                case 3:
                    ob.calculateAmount();
                    ob.display();
                    break;
                default:
                    System.out.println("Invalid input");

            }
        }
    }

}