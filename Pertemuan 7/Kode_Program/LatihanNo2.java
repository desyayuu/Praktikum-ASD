import java.util.Scanner;
class MahasiswaNo2{
    int nim;
    String nama;
    int umur;
    double ipk;

    MahasiswaNo2( int ni, String n, int u, double i){
        nim=ni;
        nama=n;
        umur=u;
        ipk=i;
    }
    void tampil(){
        System.out.println("NIM= "+nim);
        System.out.println("Nama= "+nama);
        System.out.println("Umur= "+umur);
        System.out.println("IPK= "+ipk);
    }
}
class PencarianMhs2 {
    MahasiswaNo2 [] listMHS;

    PencarianMhs2(int jum){
        this.listMHS=new MahasiswaNo2[jum];
    }
    int idx;

    void tambah(MahasiswaNo2 m){
        if(idx< listMHS.length){
            listMHS[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !");
        }
    }
    void tampil(){
        for(MahasiswaNo2 m : listMHS){
            m.tampil();
            System.out.println("----------------------------------");
        }
    }
    int FindSeqSearch(String cari) {
        int posisi =-1;
        for (int j = 0; j < listMHS.length; j++) {
            if (listMHS[j].nama.equalsIgnoreCase(cari) && j>0) {
                posisi=j;
            }
        }
        return posisi;
    }
    void Tampilposisi(String x, int pos){
        if(pos!=-1){
            System.out.println("data: " + x + " ditemukan pada indeks "+ pos );
        }else{
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
    void TampilData(String x, int pos){
        if(pos!=-1){
            System.out.println("NIM\t : "+listMHS[pos].nim);
            System.out.println("Nama\t : "+x);
            System.out.println("Umur\t : "+listMHS[pos].umur);
            System.out.println("IPK\t : "+listMHS[pos].ipk);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
}
public class LatihanNo2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);

        System.out.println("Masukkan jumlah Mahasiswa: ");
        int jum= s.nextInt();
        PencarianMhs2 data = new PencarianMhs2(jum);

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari NIM terkecil");
        for(int i=0; i<jum; i++){
            System.out.println("---------------------");
            System.out.print("NIM\t : ");
            int nim= s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s1.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            MahasiswaNo2 m = new MahasiswaNo2(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = s1.next();
        System.out.println("Menggunakan Sequential Search");
        int posisi= data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
