package Tugas2;

public class MataKuliah {
    String kode, mataKuliah, sks;

    MataKuliah(String kode, String mataKuliah, String sks){
        this.kode=kode;
        this.mataKuliah=mataKuliah;
        this.sks=sks;
    }

    public String toString(){
        return kode + "\t\t" + mataKuliah + "\t\t\t\t" + sks;
    }

    public void print(){
        System.out.println(kode+"\t\t"+mataKuliah+"\t\t\t\t"+sks);
    }
}