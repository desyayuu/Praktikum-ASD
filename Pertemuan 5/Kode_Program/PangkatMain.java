import java.util.Scanner;
class Pangkat{
    public int nilai, pangkat;

    public Pangkat(int n, int p){
        nilai=n;
        pangkat=p;
    }

    public int pangkatBF(int a, int n){
      int hasil =1;
      for(int i=0; i<n; i++){
          hasil = hasil*a;
      }
      return hasil;
    }
    public int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        }else{
            if(n%2==1){//bil ganjil
                return (pangkatDC(a, n/2)*pangkatDC(a,n/2)*a);
            }else {//bil genap
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Pangkat [] png = new Pangkat[elemen];
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" +(i+1)+" : ");
            int nilai= sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" +(i+1)+" : ");
            int pangkat= sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        for(;;){
            System.out.println("==========================================================");
            System.out.print("Menu Method \n1.BruteForce \n2.Divide Conquer \n3.Exit \nKetik angka 1 atau 2 untuk memilih:");
            int pilih =sc.nextInt();
            System.out.println("==========================================================");
            if (pilih==1){
                System.out.println("==========================================================");
                System.out.println("Hasil Pangkat dengan Brute Force");
                for(int i=0; i<elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
            }
            else if (pilih==2){
                System.out.println("==========================================================");
                System.out.println("Hasil Pangkat dengan Divide Conquer");
                for(int i=0; i<elemen; i++){
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                System.out.println("==========================================================");
            }else if (pilih==3){
                break;
            }else{
                System.out.println("inputan anda salah !");
            }

        }


    }
}
