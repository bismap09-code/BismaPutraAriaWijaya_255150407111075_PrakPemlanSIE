public class Mobil {
    
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private double jaraktempuh;

    public void setNopol(String n) {
        nopol = n;
    }
    
    public void setWarna(String s) {
        warna = s;
    }
    
    public void setMerk(String m) {
        merk = m;
    }

    public void setKecepatan(int k) {
        kecepatan = k;
    }
    
    public void setjaraktempuh(double jt) {
        jaraktempuh = jt;
    }
       // method penghitung jarak tempuh 
    public double hitungJarakTempuh(double waktu) {
        // Rumus: jarak = kecepatan * waktu
        return kecepatan * waktu;
    }
       // method Konversi ke m/s
    public double getKecepatanMps() {
        return kecepatan * 1000.0 / 3600.0;
    }

    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memililki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
         System.out.println("dengan jarak tempuh " + jaraktempuh + " km");
    }

}