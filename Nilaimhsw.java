import java.util.Scanner;

public class Nilaimhsw {
    public static void main(String[] args){
        // membuat objek input untuk user 
        Scanner input = new Scanner(System.in);
        // meminta memasukkan nama dan NIM
        System.out.print("Masukkan Nama: ");
        String nama= input.nextLine();

        System.out.print("Masukkan NIM: ");
        Integer nim = input.nextInt();

        // meminta memasukkan nilai - nilai 
        System.out.print("Masukkan Nilai Tubes: ");
        double nialiTubes = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiQuiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        // menghitung nilai akhir
        Nilai Nilai = new Nilai();
        double nilaiAkhir = Nilai.nilaiAkhir(nialiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        
        // menampilkan nama, nim dan nilai akhir
        System.out.println("\nNama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek :" + nilaiAkhir);

        // menutup scanner
        input.close();
    }   
}
