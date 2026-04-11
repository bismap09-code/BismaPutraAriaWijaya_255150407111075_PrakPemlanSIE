public class Kris extends Emoney {
    public Kris() { 
        this.name = "Kris"; 
    }
    
    @Override
    public void topUp(double amount) {
        System.out.println("Top up: " + amount);
        this.balance += (amount + (0.05 * amount));  // Bonus 5% deposit
        this.balance();
    }
    
    @Override
    public void pay(double amount) {
        double amountToPay = amount - (0.03 * amount);  // Diskon 3% payment
        if (this.balance >= amountToPay) {
            this.balance -= amountToPay;
            System.out.printf("Pay " + amount);
            System.out.println(" using " + this.name + " (discount 3%)");
        } else {
            System.out.println("Not enough balance.");
        }
        this.balance();
    }
}