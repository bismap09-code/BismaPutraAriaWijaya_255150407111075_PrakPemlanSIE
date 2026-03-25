public class Student {
    private String nama;
    private int skor;

    public Student(String nama) {
        this.nama = nama;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    public void ubahNama(String namaBaru) {
        setNama(namaBaru);
    }

    public int getSkor() {
        return this.skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public String getNama() {
        return this.nama;
    }
}