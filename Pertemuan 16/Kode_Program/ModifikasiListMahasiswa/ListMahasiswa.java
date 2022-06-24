package ModifikasiListMahasiswa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa {

    List<Mahasiswa> mahasiswas = new ArrayList<>();
    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index,Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    int linearSearch(String nim){
        for(int i=0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    int BinarySearch(String nim){
        for(int i=0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
    void ascendingSort(){
        this.mahasiswas.sort((Mahasiswa dl, Mahasiswa d2) -> dl.nim.compareTo(d2.nim));
    }
    void descendingSort(){
        this.mahasiswas.sort((Mahasiswa dl, Mahasiswa d2) -> d2.nim.compareTo(dl.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");
        Mahasiswa m3 = new Mahasiswa("201237", "Desy", "021xx4");
        Mahasiswa m4 = new Mahasiswa("201238", "Ayu", "021xx5");
        Mahasiswa m5 = new Mahasiswa("201232", "Rian", "021xx7");

        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2, m3, m4, m5);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.BinarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        lm.hapus(1);
        System.out.println("");
        lm.tampil();
        System.out.println("");
        System.out.println("Sorting Ascending");
        lm.ascendingSort();
        lm.tampil();
        System.out.println("");
        System.out.println("Sorting Descending");
        lm.descendingSort();
        lm.tampil();

    }

}
