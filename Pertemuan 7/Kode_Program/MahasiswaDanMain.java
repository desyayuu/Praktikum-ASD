import java.util.Scanner;
class Mahasiswa{
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
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
class PencarianMhs{
    Mahasiswa[] listMHS;
    int idx;

    PencarianMhs(int length){

        this.listMHS=new Mahasiswa[length];
    }

    void tambah(Mahasiswa m){
        if(idx < listMHS.length){
            listMHS[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMHS){
            m.tampil();
            System.out.println("----------------------------------");
        }
    }
    int FindSeqSearch(int cari){
        int posisi=-1;
        for(int j=0; j< listMHS.length;j++){
            if(listMHS[j].nim==cari){
                posisi=j;
            }
        }
        return posisi;
    }
    void Tampilposisi(int x, int pos){
        if(pos!=-1){
            System.out.println("data: " + x + " ditemukan pada indeks "+ pos);
        }else{
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
    void TampilData(int x, int pos){
        if(pos!=-1){
            System.out.println("NIM\t : "+x);
            System.out.println("Nama\t : "+listMHS[pos].nama);
            System.out.println("Umur\t : "+listMHS[pos].umur);
            System.out.println("IPK\t : "+listMHS[pos].ipk);
        }else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari==listMHS[mid].nim){
                return (mid);
            }else if(listMHS[mid].nim>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{

                return FindBinarySearch(cari, mid+1, right);
            }

        }
        return -1;
        //Modifikasi Pertanyaan No 4 SubBab 6.3.3 --> memasukkan nim dari yan terbesar ke terkecil
        //if(right>=left){
            //mid = (left+right)/2;
            //if(cari==listMHS[mid].nim){
                //return (mid);
            //}else if(listMHS[mid].nim>cari){
                //return FindBinarySearch(cari, mid+1, right);
            //}else{
                //return FindBinarySearch(cari, left, mid-1);
            //}

        //}
        //return -1;
    }

}

public class MahasiswaDanMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        System.out.println("Masukkan jumlah Mahasiswaa: ");
        int jum = s.nextInt();

        PencarianMhs data = new PencarianMhs(jum);

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

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("===========================================");
        System.out.println("Menggunkan binary search");
        posisi= data.FindBinarySearch(cari, 0, jum-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
