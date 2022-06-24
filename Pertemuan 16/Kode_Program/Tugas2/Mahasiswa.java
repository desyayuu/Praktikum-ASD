package Tugas2;

public class Mahasiswa {
    String nim, nama, telp;

    Mahasiswa(String nim, String nama, String telp){
        this.nim=nim;
        this.nama=nama;
        this.telp=telp;
    }

    public String toString(){
        return nim + "\t\t" + nama + "\t\t" + telp;
    }

    public void print(){
        System.out.println(nim+"\t\t"+nama+"\t\t"+telp);
    }
}
