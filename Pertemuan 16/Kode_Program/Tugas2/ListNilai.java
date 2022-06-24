package Tugas2;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListNilai{
    List<Mahasiswa> mahasiswas = new ArrayList<>();
    List<MataKuliah> mataKuliah = new ArrayList<>();
    List<Nilai> nilais = new ArrayList<>();

    public void add(Nilai nilai){
        nilais.add(nilai);
    }

    public void tampil(){
        nilais.stream().forEach(n -> {
            System.out.println("" + n.toString());
        });
    }

    public void get(String nim){
        for(Iterator<Nilai> it = nilais.iterator(); it.hasNext();){
            Nilai nilai = it.next();
            if (nim.equals(nilai.nim)) {
                System.out.println("NIM\t\t\tNama\t\tMata Kuliah\t\t\t\t\t\t\t\t\t\t\tSKS\tNilai");
                nilai.print();
                System.out.println("Total SKS " + nilai.sks + " telah diambil.");
            }
        }
    }

    public void sort(){
        Double[] urut = new Double[nilais.size()];
        int a=0;
        for (Nilai nilai : nilais) {
            urut[a] = nilai.nilai;
            a++;
        }
        for (int i = 0; i < urut.length-1; i++) {
            for (int j = 1; j < urut.length-i; j++) {
                if(urut[j-1] > urut[j]){
                    Double temp = urut[j-1];
                    urut[j-1] = urut[j];
                    urut[j] = temp;
                }
            }
        }
        for(int i=0; i<urut.length; i++){
            for (Nilai nilai : nilais) {
                if(nilai.nilai==urut[i]){
                    nilai.print();
                }
            }
        }
    }
}