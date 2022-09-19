import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /** Nap tien vao tai khoan. */
    private void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /** Rut tien tu tai khoan. */
    private void withdraw(double amount) {
        if (amount > 0) {
            if (amount > balance) {
                System.out.println("So tien ban rut vuot qua so du!");
            } else {
                balance -= amount;
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /** Them mot giao dich. */
    public void addTransaction(double amount, String operation) {
        if (!operation.equals("deposit") && !operation.equals("withdraw")) {
            System.out.println("Yeu cau khong hop le!");
            return;
        }
        if (operation.equals("deposit")) {
            deposit(amount);
            Transaction temp = new Transaction("deposit", amount, balance);
            transitionList.add(temp);
        } else {
            withdraw(amount);
            Transaction temp = new Transaction("withdraw", amount, balance);
            transitionList.add(temp);
        }
    }

    /** In ra cac giao dich. */
    public void printTransaction() {
        int n = transitionList.size();
        for (int i = 0; i < n; i++) {
            System.out.print("Giao dich " + (i + 1) + ": ");
            if (transitionList.get(i).getOperation().equals("deposit")) {
                System.out.print("Nap tien ");
            } else {
                System.out.print("Rut tien ");
            }
            double amount = transitionList.get(i).getAmount();
            amount = (double) (Math.round(amount * 100)) / 100;
            if (Math.round(amount * 100) % 10 != 0) {
                System.out.print("$" + amount + ". So du luc nay: $");
            } else {
                System.out.print("$" + amount + "0. So du luc nay: $");
            }
            double balance = transitionList.get(i).getBalance();
            balance = (double) (Math.round(balance * 100)) / 100;
            if (Math.round(balance * 100) % 10 != 0) {
                System.out.println(balance + ".");
            } else {
                System.out.println(balance + "0.");
            }
        }
    }
}
