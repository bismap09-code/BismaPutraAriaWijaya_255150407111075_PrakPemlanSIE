public class ClassBaru {
    public static void main(String[] args) {
        // Membuat objek Kris tanpa class baru menggunakan anonymous class
        Emoney kris = new Emoney() {
            {
                this.name = "Kris";
                this.balance = 0;
            }
            
            @Override
            public void topUp(double amount) {
                System.out.println("Top up: " + amount);
                this.balance += (amount + (0.05 * amount));
                this.balance();
            }
            
            @Override
            public void pay(double amount) {
                double amountToPay = amount - (0.03 * amount);
                if (this.balance >= amountToPay) {
                    this.balance -= amountToPay;
                    System.out.printf("Pay " + amount);
                    System.out.println(" using " + this.name + " (discount 3%)");
                } else {
                    System.out.println("Not enough balance.");
                }
                this.balance();
            }
        };
        
        // Testing
        Customer customer = new Customer(kris);
        customer.deposit(100);
        customer.pay(100);
        customer.getMoney();
    }
}