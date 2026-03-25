public class SchoolApp {
    public static void main(String[] args) {
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");

        System.out.println("Grade " + miki.getNama() + " ");
        System.out.println("Grade " + mini.getNama() + " ");

        mini.ubahNama("Mono");

        miki.setSkor(85);

        System.out.println("Grade " + miki.getNama() + " ");
        System.out.println("Grade " + mini.getNama() + " ");
        System.out.println(mini.getNama());
        System.out.println(miki.getSkor());

        mini.ubahNama("Mono");
    }
}