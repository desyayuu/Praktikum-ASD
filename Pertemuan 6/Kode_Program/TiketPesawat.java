class Tiket {
    String maskapai, asal, tujuan;
    int harga;

    Tiket(String m, int h, String a, String t) {
            maskapai = m;
            harga = h;
            asal = a;
            tujuan = t;

    }
    void tampil(){
        System.out.println("Maskapai\t: " +maskapai);
        System.out.println("Harga Tiket\t: " +harga);
        System.out.println("Asal\t\t: " + asal);
        System.out.println("Tujuan\t\t: " +tujuan);
    }
}
class TiketService {
    Tiket [] tikets = new Tiket[5];
    int idx;

    void tambah(Tiket t) {
        if (idx < tikets.length) {
            tikets[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll() {
        for (Tiket t : tikets) {
            t.tampil();
            System.out.println("------------------------------------------------");
        }
    }

    void bubleSort() {
        for (int i = 0; i < tikets.length - 1; i++) {
            for (int j = 1; j < tikets.length - i; j++) {
                if (tikets[j].harga < tikets[j - 1].harga) {
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }

            }
        }
    }
    void selectionSort(){
        for(int i=0; i< tikets.length-1;i++){
            int idxMin=i;
            for(int j=i+1; j< tikets.length;j++){
                if(tikets[j].harga< tikets[idxMin].harga){
                    idxMin=j;
                }
            }
            //swap
            Tiket tmp =tikets[idxMin];
            tikets[idxMin]=tikets[i];
            tikets[i]=tmp;
        }
    }
}

public class TiketPesawat {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        Tiket t1 = new Tiket("Garuda Indonesia", 2500000, "Surabaya", "Malang");
        Tiket t2 = new Tiket("Lion Air", 2200000, "Surabaya", "Malang");
        Tiket t3 = new Tiket("Garuda Indonesia", 3000000, "Jakarta", "Surabya");
        Tiket t4 = new Tiket("Sriwijaya Air", 1700000, "Jakarta", "Bandung");
        Tiket t5 = new Tiket("Lion Air", 2100000, "Jogjakarta", "Surabaya");


        list.tambah(t1);
        list.tambah(t2);
        list.tambah(t3);
        list.tambah(t4);
        list.tambah(t5);

        System.out.println("==========================================================================");
        System.out.println("\t\t\t\t\tData Tiket Pesawat sebelum sorting  ");
        System.out.println("==========================================================================");
        list.tampilAll();

        System.out.println();
        System.out.println("==========================================================================");
        System.out.println("Data Tiket Pesawat setelah sorting ascending Bubble Sort berdasarkan harga");
        System.out.println("==========================================================================");
        list.bubleSort();
        list.tampilAll();


        System.out.println();
        System.out.println("=============================================================================");
        System.out.println("Data Tiket Pesawat setelah sorting ascending Selection Sort berdasarkan harga");
        System.out.println("=============================================================================");
        list.selectionSort();
        list.tampilAll();
    }

}
