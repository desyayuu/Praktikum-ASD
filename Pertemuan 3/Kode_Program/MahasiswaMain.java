import java.util.Scanner;
class Mahasiswa{
    String nama, jenisKelamin;
    int nim;
    double ipk;
}
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========PROGRAM INFORMASI MAHASISWA===========");
        Mahasiswa [] ppMahasiswa = new Mahasiswa[3];
        for(int i=0; i< ppMahasiswa.length; i++){
            ppMahasiswa[i]=new Mahasiswa();
            System.out.println("\nMasukkan data mahasiswa ke-" +(i+1));
            System.out.print("Masukkan nama\t\t\t: ");
            ppMahasiswa[i].nama = sc.next();
            System.out.print("Masukkan NIM\t\t\t: ");
            ppMahasiswa[i].nim= sc.nextInt();
            System.out.print("Masukkan jenis Kelamin\t: ");
            ppMahasiswa[i].jenisKelamin= sc.next();
            System.out.print("Masukkan IPK\t\t\t: ");
            ppMahasiswa[i].ipk= sc.nextDouble();
        }
        for(int i=0; i< ppMahasiswa.length; i++){
            System.out.println("\nData mahasiswa ke-" +(i+1));
            System.out.println("Nama\t\t\t: " + ppMahasiswa[i].nama);
            System.out.println("NIM\t\t\t\t: " + ppMahasiswa[i].nim);
            System.out.println("Jenis Kelamin\t: " +ppMahasiswa[i].jenisKelamin);
            System.out.println("IPK\t\t\t\t: " + ppMahasiswa[i].ipk);
        }
    }
}
