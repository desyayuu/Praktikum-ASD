import java.util.Scanner;
class Faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {    //perulangan for
            fakto = fakto * i;
        }
        return fakto;

        //int i=1;
        //while(i<=n){                    //perulangan while
        //    fakto=fakto*i;
        //    i++;
        //}
        //return fakto;

        //int i=1;                        //perulangan do while
        //do{
        //   fakto=fakto*i;
        //    i++;
        //}
        //while (i<=n);
        //return fakto;

    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }

    }
}

public class FaktorialMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk= new Faktorial[elemen];
        for(int i=0; i< elemen; i++){
            fk[i]=new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1)+ " : ");
            fk[i].nilai=sc.nextInt();
        }
        long start =System.currentTimeMillis();
        System.out.println("==========================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + "adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.currentTimeMillis();
        long elapsedtime1 = end -start;
        System.out.println("Waktu " +String.valueOf(elapsedtime1 + " ms"));
        long start2= System.currentTimeMillis();
        System.out.println("==========================================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("==========================================================");
        long end2= System.currentTimeMillis();
        long elapsedtime2 = end2- start2;
        System.out.println("Waktu " +String.valueOf(elapsedtime2 + " ms"));
        System.out.println("=============================================");
    }
}