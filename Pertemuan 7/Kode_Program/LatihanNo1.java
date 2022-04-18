import java.util.Scanner;
class MahasiswaNo1{
    int nim;
    String nama;
    int umur;
    double ipk;

    MahasiswaNo1(int ni, String n, int u, double i){
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
class PencarianMhsNo1{
    MahasiswaNo1[] listMHS;
    int idx;

    PencarianMhsNo1(int length) {
        this.listMHS = new MahasiswaNo1[length];
    }
    void tambah(MahasiswaNo1 m1) {
        if (idx < listMHS.length) {
            listMHS[idx] = m1;
            idx++;
        } else {
            System.out.println("Data sudah penuh !");
        }
    }
    void tampil() {
        for (MahasiswaNo1 m1 : listMHS) {
            m1.tampil();
            System.out.println("----------------------------------");
        }
    }
    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMHS[pos].nama);
            System.out.println("Umur\t : " + listMHS[pos].umur);
            System.out.println("IPK\t : " + listMHS[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMHS[mid].nim) {
                return (mid);
            } else if (listMHS[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {

                return FindBinarySearch(cari, mid + 1, right);
            }

        }
        return -1;
    }
    void bubleSort() {
        for (int i = 0; i < listMHS.length - 1; i++) {
            for (int j = 1; j < listMHS.length - i; j++) {
                if (listMHS[j].nim < listMHS[j - 1].nim) {
                    MahasiswaNo1 tmp1 = listMHS[j];
                    listMHS[j] = listMHS[j-1];
                    listMHS[j-1] = tmp1;
                }
            }
        }
    }

}
public class LatihanNo1{
    public static void main(String[] args) {Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        System.out.println("Masukkan jumlah Mahasiswaa: ");
        int jum = s.nextInt();

        PencarianMhsNo1 data = new PencarianMhsNo1(jum);

        System.out.println("----------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
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

            MahasiswaNo1 m1 = new MahasiswaNo1(nim, nama, umur, ipk);
            data.tambah(m1);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();


        System.out.println("Data Keseluruhan Mahasiswa setelah diurut: ");
        System.out.println("-------------------------------------------");
        data.bubleSort();
        data.tampil();


        System.out.println("Pencarian Data : ");
        System.out.println("___________________________________________");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("===========================================");
        System.out.println("Menggunkan binary search");

        int posisi = data.FindBinarySearch(cari, 0, jum-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}