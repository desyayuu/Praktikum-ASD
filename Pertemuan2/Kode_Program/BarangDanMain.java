class Barang{
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang(){
    }
    Barang(String nm, String jn, int st, int hs){
        namaBarang=nm;
        jenisBarang=jn;
        stok=st;
        hargaSatuan=hs;
    }
    void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga Satuan = " + hargaSatuan);
    }

    void tambahStok(int n) {
        stok = stok+n;
    }

    void kurangiStok(int n) {
        if(stok>0){
            stok = stok-n;

        }else{
            System.out.println("Stok Kosong");
        }

    }

    int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
public class BarangDanMain{
    public static void main(String[] args) {
        Barang b1 = new Barang (); // instance objek

        //akses atribut
        b1.namaBarang = "Corsair 2GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 0 ;

        //akses method

        //b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal=b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = "+hargaTotal);
        System.out.println("=============================================================");
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
        System.out.println("=============================================================");
        Barang b3 = new Barang("MacBook Air", "Apple MacBook", 10, 12000000);
        b3.tampilBarang();
    }
}
