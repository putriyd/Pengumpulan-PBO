public class Student {
    public String nama;
    public int kredit;
    public double IPK;
    public int poinKualitas;

    public Student(String nama, int kredit, double IPK, int poinKualitas) {
        this.nama = nama;
        this.kredit = kredit;
        this.IPK = IPK;
        this.poinKualitas = poinKualitas;
    }

    // hitungRataRata menggunakan double karena IPK memiliki nilai desimal 
    public double hitungRataRata() {
             return (double) poinKualitas / kredit;
    }

    public void tambahKredit(int tambahanKredit, int tambahanPoinKualitas) {
           kredit += tambahanKredit;
            poinKualitas += tambahanPoinKualitas;
            IPK = poinKualitas / kredit;
           }
           
    public static void main(String[] args) {
      // Contoh penggunaan kelas Student
      Student student1 = new Student("Putri Yuslita", 80, 4, 200);
      System.out.println("Nama: " + student1.nama);
      System.out.println("Kredit: " + student1.kredit);
      System.out.println("IPK: " + student1.IPK);
      System.out.println("Poin Kualitas: " + student1.poinKualitas);
      System.out.println("Rata-rata Poin Nilai: " + student1.hitungRataRata());
  

    // Menambahkan kredit dan poin kualitas
    student1.tambahKredit(12, 100);
    System.out.println("\nSetelah menambah kredit:");
    System.out.println("Kredit: " + student1.kredit);
    System.out.println("IPK: " + student1.IPK);
    System.out.println("Poin Kualitas: " + student1.poinKualitas);
    System.out.println("Rata-rata Poin Nilai: " + student1.hitungRataRata());
 }
}
