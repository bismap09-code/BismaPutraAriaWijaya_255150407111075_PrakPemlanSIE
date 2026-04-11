public abstract class DigitalWallet {
    protected String ownerName;
    protected double balance;
    protected String walletType;
    
    public abstract void topUp(double amount);
    public abstract void pay(double amount);
    public abstract void checkBalance();
    
    public void showOwner() {
        System.out.println("Owner: " + ownerName);
    }
}

class GoPay extends DigitalWallet {
    private static final double ADMIN_FEE = 1000;
    
    public GoPay(String name) {
        this.ownerName = name;
        this.walletType = "GoPay";
    }
    
    @Override
    public void topUp(double amount) {
        balance += (amount - ADMIN_FEE);
        System.out.println("Top up Rp" + amount + " fee Rp1000");
    }
    
    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Pay Rp" + amount + " using GoPay");
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }
    
    @Override
    public void checkBalance() {
        System.out.println(walletType + " balance: Rp" + balance);
    }
}

class OVO extends DigitalWallet {
    private static final double CASHBACK = 0.02; // 2% cashback
    
    public OVO(String name) {
        this.ownerName = name;
        this.walletType = "OVO";
    }
    
    @Override
    public void topUp(double amount) {
        balance += amount;
        System.out.println("Top up Rp" + amount);
    }
    
    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            balance += (amount * CASHBACK); // dapat cashback
            System.out.println("Pay Rp" + amount + " using OVO, cashback Rp" + (amount * CASHBACK));
        } else {
            System.out.println("Saldo tidak cukup");
        }
    }
    
    @Override
    public void checkBalance() {
        System.out.println(walletType + " balance: Rp" + balance);
    }
}