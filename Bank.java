public class Bank
{
    private static int totalNumAcc = 0;

    public static void printTotalNumAcc() {
        System.out.println("Total no. of account being created: " + totalNumAcc);
    }

    private String name;
    private int balance;

    public Bank(String name, int balance) {
        this.name = name;
        this.balance = balance;
        this.totalNumAcc++;
    }

    public void printBalance() {
        System.out.println("Account balance of " + this.name + " is: $" + this.balance);
    }

    public void updateBalance(int amount) {
        System.out.println("Account balance of " + this.name + " is changed from $" + this.balance + " to: $" + (this.balance + amount));
        this.balance = this.balance + amount;
    }

    public void adjustBalance(int amount) {
        if (amount != 0) {
            String type = amount > 0 ? "deposits" : "draws";
            System.out.println(this.name + " " + type + " $" + Math.abs(amount));
            updateBalance(amount);
        }
    }

    public void transferTo(int transAmount, Bank targetAcct) {
        if (transAmount > 0) {
            System.out.println(this.name + " transferd $" + transAmount + " to " + targetAcct.name);
            updateBalance(0 - transAmount);
            targetAcct.updateBalance(transAmount);
        }
    }
}