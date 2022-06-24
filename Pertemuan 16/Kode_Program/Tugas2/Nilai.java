package Tugas2;
import java.util.Scanner;
public class Nilai {
    String nim, nama, mataKuliah, sks;
    Double nilai;

    Nilai(String nim, String nama, String mataKuliah, String sks, Double nilai){
        this.nim=nim;
        this.nama=nama;
        this.mataKuliah=mataKuliah;
        this.sks=sks;
        this.nilai=nilai;
    }

    public String toString(){
        return nim + "\t\t" + nama + "\t\t" + mataKuliah + "\t\t\t" + sks + "\t" + nilai;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+mataKuliah+"\t\t\t"+sks+"\t"+nilai);
    }

    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[6];
        MataKuliah[] mk = new MataKuliah[5];
        ListNilai ln = new ListNilai();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        mhs[0] = new Mahasiswa("20001", "Thalhah", "\t\t\t021xxx");
        mhs[1] = new Mahasiswa("20002", "Zubair", "\t\t\t021xxx");
        mhs[2] = new Mahasiswa("20003", "Abdur-Rahman", "\t021xxx");
        mhs[3] = new Mahasiswa("20004", "Sa'ad", "\t\t\t021xxx");
        mhs[4] = new Mahasiswa("20005", "Sa'id", "\t\t\t021xxx");
        mhs[5] = new Mahasiswa("20006", "Ubaidah", "\t\t\t021xxx");

        mk[0] = new MataKuliah("00001", "Internet Of Things", "\t\t\t\t\t\t3");
        mk[1] = new MataKuliah("00002", "Algoritma dan Struktur Data", "\t\t\t\t3");
        mk[2] = new MataKuliah("00003", "Algoritma dan Pemrograman", "\t\t\t\t2");
        mk[3] = new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "\t3");
        mk[4] = new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", "\t\t3");

        int i=0;
        while(i<1){
            System.out.println("**************************************");
            System.out.println("SISTEM PEMGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("**************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("**************************************");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                System.out.println("Masukkan Data :");
                System.out.print("Kode: ");
                int kodee = input.nextInt();
                System.out.print("Nilai : ");
                double nilai = input.nextDouble();
                input.nextLine();

                System.out.println("DAFTAR MAHASISWA");
                System.out.println("***********************************");
                System.out.println("NIM\t\t\tNama\t\t\t\t\tTelp");
                for (int j=0; j<mhs.length; j++) {
                    mhs[j].print();
                }
                System.out.print("Pilih Mahasiswa By NIM : ");
                String nim = input.nextLine();
                Mahasiswa x = null;
                for(int j=0; j<mhs.length; j++){
                    if(nim.equals(mhs[j].nim)){
                        x = mhs[j];
                    }
                }

                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("Kode\t\tMata Kuliah\t\t\t\t\t\t\t\t\t\t\t\tSKS");
                for (int j=0; j<mk.length; j++) {
                    mk[j].print();
                }
                System.out.print("Pilih Mata Kuliah By Kode : ");
                String kode = input.nextLine();
                MataKuliah y = null;
                for(int j=0; j<mk.length; j++){
                    if(kode.equals(mk[j].kode)){
                        y = mk[j];
                    }
                }


                Nilai nilaiobj = new Nilai(x.nim, x.nama, y.mataKuliah, y.sks, nilai);
                ln.add(nilaiobj);

            } else if (pilih==2) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\t\tNama\t\tMata Kuliah\t\t\t\t\t\t\t\t\t\t\tSKS\tNilai");
                ln.tampil();

            } else if (pilih==3) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\t\tNama\t\tMata Kuliah\t\t\t\t\t\t\t\t\t\t\tSKS\tNilai");
                ln.tampil();

                System.out.print("Masukkan Data Mahasiswa[NIM] : ");
                String nim = input.nextLine();
                ln.get(nim);

            } else if (pilih==4) {
                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("***********************************");
                System.out.println("NIM\t\t\tNama\t\tMata Kuliah\t\t\t\t\t\t\t\t\t\t\tSKS\tNilai");
                ln.sort();

            } else {
                i++;
            }
        }
    }
}





