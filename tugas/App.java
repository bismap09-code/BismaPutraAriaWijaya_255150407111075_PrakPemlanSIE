import java.util.Scanner;

public class App{
    public static void main(String[] args) {
     //instansiasi objek bernama m1
        
    Scanner input = new Scanner(System.in);

     Mobil m1 = new Mobil();

             //proses input mobil m1
        System.out.print("Masukkan Merk Mobil 1: ");   
        String merk1 = input.nextLine();               
        m1.setMerk(merk1);                              
        
        System.out.print("Masukkan Nomor Polisi Mobil 1: "); 
        String nopol1 = input.nextLine();                     
        m1.setNopol(nopol1);                                   
        
        m1.setKecepatan(50);
        m1.setWarna("Merah");
        
        m1.display();
     
     System.out.println("---------------");

    //instansiasi objek bernama m2
    Mobil m2 = new Mobil();

        //proses input m2
        System.out.print("Masukkan Merk Mobil 2: ");   
        String merk2 = input.nextLine();               
        m2.setMerk(merk2);                              
        
        System.out.print("Masukkan Nomor Polisi Mobil 2: "); 
        String nopol2 = input.nextLine();                     
        m2.setNopol(nopol2);                                   

        m2.setKecepatan(100);
        m2.setWarna("Biru");
        
        m2.display();

    System.out.println("---------------");
    System.out.println("Atribut pada objek m1 diubah.");

    //mengubah warna dari objek m1
    m1.setWarna("Hijau");

    //menampilkan hasil perubahan
    m1.display();
   
    }
}
