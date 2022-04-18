import java.util.Scanner;
class pengurutan{
    int array;

    pengurutan(int arr){
        array=arr;
    }
    void tampil(){
        System.out.println(array);
    }
}
class cari{
    pengurutan []p = new pengurutan[10];
    int idx;
    int max;
    int jum;
    void tambah(pengurutan data){
        if(idx< p.length){
            p[idx]=data;
            idx++;
        }else{
            System.out.println("Data sudah penuh !");
        }
    }
    void tampil(){
        for(pengurutan data : p){
            data.tampil();
        }
    }
    int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if(cari==p[mid].array){
                return (mid);
            }else if(p[mid].array>cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{

                return FindBinarySearch(cari, mid+1, right);
            }

        }
        return -1;
    }
    void tampilPosisi(int x, int pos){
        if(pos!= -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nilai yang dicari : " + x);
        } else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    void bubleSort() {
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 1; j < p.length - i; j++) {
                if (p[j].array < p[j - 1].array) {
                    pengurutan tmp = p[j];
                    p[j] = p[j-1];
                    p[j-1] = tmp;
                }

            }
        }
    }
    void arrayMax(){
        for(int i =0; i<p.length; i++){
            max = p[0].array;
            if(p[i].array>p[0].array){
                max = p[i].array;
            }
        }
        System.out.println("Nilai terbesar: " + max );
    }
    void hitungMax(){
        for(int i=0; i<p.length; i++){
            if(max==p[i].array){
                jum++;
            }
        }
        System.out.println("Jumlah nilai " + max + " ada: "+jum);
    }
    void tampilMax(){
        int pos =0;
        int pos2=0;
        for(int i =0; i<p.length; i++){
            pos= FindBinarySearch(max, 0, p.length-1);

        }
        System.out.print("Nilai " + max + " ada di indeks " + pos);
        if(jum>1){
            for(int j=0; j<p.length; j++){
                pos2 =FindBinarySearch(max, pos+1, p.length-1);
            }

        }
        System.out.print(" dan pada indeks " + pos2);
    }
}

public class LatihanNo3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        cari data = new cari();
        int jumlahData=10;

        for(int i=0;i<jumlahData; i++){
            System.out.print("Masukkan nilai pada indeks ke-" + i +": ");
            int array = c.nextInt();

            pengurutan u = new pengurutan(array);
            data.tambah(u);

        }
        System.out.println("===========================================");
        System.out.println("List Data Setelah pengurutan");
        System.out.println("===========================================");
        data.bubleSort();
        data.tampil();

        System.out.println("===========================================");
        System.out.println("Masukkan data yang ingin dicari: ");
        System.out.print("Nilai: ");
        int cari = c.nextInt();
        System.out.println("Menggunkan binary search");
        int posisi = data.FindBinarySearch(cari, 0, jumlahData-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("==========================================");
        data.arrayMax();
        data.hitungMax();
        data.tampilMax();

    }
}
