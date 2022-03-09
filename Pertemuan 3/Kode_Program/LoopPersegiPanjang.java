import java.util.Scanner;
class LoopPP{
    public int panjang;
    public int lebar;
}
public class LoopPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah Array of Objects: ");
        int n = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];

        for(int i=0; i<n;i++){
            ppArray[i]=new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: "+ppArray[i].panjang + ", lebar: "+ppArray[i].lebar);
        }
    }


}
