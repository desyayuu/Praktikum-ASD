class Mahasiswa{
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama=n;
        thnMasuk=t;
        umur=u;
        ipk=i;
    }
    void tampil(){
        System.out.println("Nama = " +nama);
        System.out.println("Tahun Masuk = " +thnMasuk);
        System.out.println("Umur = " +umur);
        System.out.println("IPK = " +ipk);
    }
}
class DaftarMahasiswaBerprestasi{
    Mahasiswa listMhs[]=new Mahasiswa[5];
    int idx;
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("---------------------------------------");
        }
    }
    void bubbleSort(){
        for(int i=0; i< listMhs.length-1; i++){
            for(int j=1;j< listMhs.length-i;j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa tmp=listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort(){
        for(int i=0; i< listMhs.length-1;i++){
            int idxMin=i;
            for(int j=i+1; j< listMhs.length;j++){
                if(listMhs[j].ipk< listMhs[idxMin].ipk){
                    idxMin=j;
                }
            }
            //swap
            Mahasiswa tmp= listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(boolean asc){
        for(int i =1; i< listMhs.length;i++){
            //Modifikasi Praktikum SubBab 5.4.3
            Mahasiswa temp = listMhs[i];
            int j =i;
            if(asc){
                while(j>0 && listMhs[j-1].ipk >temp.ipk){
                    listMhs[j]=listMhs[j-1];
                    j--;
                }
            }else{
                while(j>0 && listMhs[j-1].ipk >temp.ipk){
                    listMhs[j]=listMhs[j-1];
                    j--;
                }
            }
            listMhs[j]=temp;

            //Mahasiswa temp = listMhs[i];
            //int j =i;
            //while (j>0 && listMhs[j-1].ipk> temp.ipk){
            //listMhs[j]=listMhs[j-1];
            //j--;
            //}
            //listMhs[j]=temp;
        }
    }


}
public class MahasiswaDanMain{
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();

        Mahasiswa m1= new Mahasiswa("Nusa", 2017, 25,3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012,29,4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23,2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019,21,3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);



        System.out.println("\nData Mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("\nData mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort(true);
        list.tampil();


    }
}
