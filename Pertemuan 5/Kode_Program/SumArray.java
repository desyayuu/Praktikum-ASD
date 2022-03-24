import java.util.Scanner;
class Array {
    public int elemen[];
    public double keuntungan[];
    public double total;
    public int perusahaan[];

    Array(int elemen, int jmlh_peru){
        this.elemen=new int [elemen];
        this.keuntungan=new double[elemen];
        this.perusahaan=new int[jmlh_peru];
        this.total=0;
    }
    double totalBF(double arr[]){
        for(int i=0; i < elemen.length; i++){
            total =total+arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        }else if(l<r){
            int mid =(l+r)/2;
            double lsum = totalDC(arr, l, mid-1);
            double rsum = totalDC(arr, mid+1, r);
            return lsum + rsum +arr[mid];
        }
        return 0;
    }
}
public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e1=0;
        System.out.println("=========================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. MIsal 5.9)");

        System.out.print("Masukkan jumlah perusahaan: ");
        int jmlh_peru= sc.nextInt();
        for(int i=0; i<jmlh_peru; i++){
            System.out.print("Masukkan jumlah bulan perusahaan ke-" +(i+1)+ " : ");
            int elm= sc.nextInt();
            e1= elm;
        }
        Array sm = new Array(e1,jmlh_peru);
        System.out.println("=========================================================");
        for(int i=0; i<jmlh_peru; i++){
            System.out.println("Keuntungan Perusahaan " +(i+1));
            for(int j=0; j<e1; j++){
                System.out.print("Masukkan keuntungan perusahaan bulan ke -" +(j+1)+" = ");
                sm.keuntungan[j]= sc.nextDouble();
            }
        }

        for(int i=0; i<jmlh_peru;i++){
            System.out.println("==========================================================");
            System.out.println("Keuntungan Perusahaan " + (i+1));
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungan perusahaan ke-" + (i+1) + " adalah = " +sm.totalBF(sm.keuntungan));
            System.out.println("\n==========================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan ke-" + (i+1)  + " adalah = " +sm.totalDC(sm.keuntungan, 0, sm.elemen[i]-1));
        }

    }
}

