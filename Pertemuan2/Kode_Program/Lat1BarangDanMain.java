class BarangLat1{
    String nama;
    int hargaSatuan, jumlah;

    int hitungHargaTotal(int hs, int jum){
        int hasil = hs*jum;
        return hasil;
    }

    int hitungDiskon(int htot){
        int diskon=0;
        if(htot>10000){
            diskon=htot*10/100;
        }else if(htot>=50000&&htot<=100000){
            diskon=htot*5/100;
        }else{
            diskon=0;
        }
        return diskon;
    }

    int hitungHargaBayar(int htot2, int hd){
        int hb= htot2-hd;
        return hb;
    }
}
public class Lat1BarangDanMain{
    public static void main(String[] args) {
        BarangLat1 b1= new BarangLat1();//instance objek

        b1.nama="Tripod";
        b1.hargaSatuan=150000;
        b1.jumlah=2;

        System.out.println("\t\t\t\tSTRUK PEMBAYARAN");
        System.out.println("===========================================");
        System.out.println("Nama\t" + "\t\tqty" + "\t\tHarga" + "\t\tTotal");
        System.out.println("===========================================");
        System.out.println(b1.nama + "\t\t\t" + b1.jumlah + "\t\t" + b1.hargaSatuan + "\t\t" + b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah));
        System.out.println("");
        System.out.println("===========================================  ");
        System.out.println("Total Diskon\t: " + b1.hitungDiskon(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah)));
        System.out.println("Total Bayar\t: "+ b1.hitungHargaBayar(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah), b1.hitungDiskon(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah))));
    }

}
