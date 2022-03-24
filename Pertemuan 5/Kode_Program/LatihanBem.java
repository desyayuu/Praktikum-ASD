import java.util.Scanner;
class Bem{
    int suara, jumlahSuara=0, jumlahKandidat=4;
    String kandidat;
    static int control=0, nilai=1, accept=0, accept2=0;
    static int array[] = new int[10000];

    static int hitung(int js, int k1, int k2, int k3, int k4){
        if(nilai==5){
            nilai = 1;
        }
        if(nilai==1&&k1>0){
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(js,k1-1, k2, k3, k4);
        } else if(nilai==2 && k2 >0){
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(js,k1, k2-1, k3, k4);
        } else if(nilai==3 && k3>0){
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(js,k1, k2, k3-1, k4);
        } else if(nilai==4 && k4>0){
            array[control] = nilai;
            control++;
            nilai++;
            return hitung(js,k1, k2, k3, k4-1);
        } else if (k1==0 && k2==0 && k3==0 && k4==0){
            if (array[accept] == array[accept +1] && accept+1 <js){
                return array[accept];

            } else if (accept+2 <js){
                accept +=2;
                return hitung(js, k1, k2, k3, k4);
            } else{
                return 0;
            }
        } else {
            nilai++;
            return hitung(js, k1, k2, k3, k4);
        }
    }
}
public class LatihanBem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Pemilihan suara Ketua BEM POLINEMA");
        System.out.println("============================================");
        Bem b = new Bem();
        Bem[] arr = new Bem[b.jumlahKandidat];
        String namaKandidat = new String("kosong");
        for (int i = 0; i < b.jumlahKandidat; i++) {
            arr[i] = new Bem();
            System.out.print("Nama kandidat ke-" + (i + 1) + " : ");
            arr[i].kandidat = sc.next();
            namaKandidat=arr[i].kandidat;
        }
        System.out.println("================================");
        for (int i = 0; i < b.jumlahKandidat; i++) {
            arr[i] = new Bem();
            System.out.print("jumlah suara kandidat ke-" + (i + 1) + " : ");
            arr[i].suara = sc.nextInt();
            b.jumlahSuara += arr[i].suara;
        }
        System.out.println("================================");

        int hasil = b.hitung(b.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
        if (hasil == 0) {
            System.out.println("Hasil suara kandidat sama");

        } else {
            System.out.println("Suara terbanyak: " +arr[hasil-1].suara);
            System.out.println("Kandidat Terpilih : " + arr[hasil-1].kandidat);
        }
    }
}