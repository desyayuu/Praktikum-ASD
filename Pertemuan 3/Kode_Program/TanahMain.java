import java.util.Scanner;
class Tanah{
    public int panjang, lebar;
    public int Luas(){
        return panjang*lebar;
    }
}
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============PROGRAM LUAS TANAH==============");
        System.out.print("Masukkan jumlah tanah yang ingin dihitung: ");
        int n= sc.nextInt();
        Tanah[] ppTanah = new Tanah[n];

        for(int i=0; i<n; i++){
            ppTanah[i]=new Tanah();
            System.out.println("\nTanah ke-" + (i+1));
            System.out.print("Masukkan Panjang Tanah: ");
            ppTanah[i].panjang=sc.nextInt();
            System.out.print("Masukkan Lebar Tanah: ");
            ppTanah[i].lebar=sc.nextInt();
        }
        System.out.println("=====================================");
        System.out.println("Jumlah tanah: " +n);
        for(int i=0; i<n; i++){
            System.out.println("\nTanah " + (i+1));
            System.out.println("Panjang: " + ppTanah[i].panjang);
            System.out.println("Lebar: " + ppTanah[i].lebar);
        }
        System.out.println("=====================================");
        for(int i=0; i<n; i++){
            System.out.println("Luas Tanah " +(i+1)+ ": " + ppTanah[i].Luas());

        }
        System.out.println("=====================================");
        int max =0;
        int idxMax=0;
            for(int i=0; i<n; i++){
                if(ppTanah[i].Luas()>max){
                max = ppTanah[i].Luas();
                idxMax=i+1;
                }
            }
            System.out.println("Tanah terluas: Tanah " + idxMax);
        }
    }

