public class ComparisonTest {
    public static void main(String[] args) {
        ShopiPay shopi = new ShopiPay();
        shopi.topUp(100);  // saldo = 105
        shopi.pay(100);    // bayar 100, sisa = 5
        
        Opo opo = new Opo();
        opo.topUp(100);    // saldo = 100
        opo.pay(100);      // bayar 90, sisa = 10
        
        Kris kris = new Kris();
        kris.topUp(100);   // saldo = 105
        kris.pay(100);     // bayar 97, sisa = 8
    }
}