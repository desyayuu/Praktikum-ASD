import java.util.Scanner;
class kubus{
    public int sisi;

    public kubus(int s){
        sisi = s;
    }
    public int lpKubus(){
        return 6*sisi*sisi;
    }
    public int vKubus(){
        return sisi*sisi*sisi;
    }
}
class bola{
    public double jariJari;
    public double phi=3.14;

    public bola(double r){
        jariJari=r;
    }
    public double lpBola(){
        return 4*phi*jariJari*jariJari;
    }
    public double vBola(){
        return (4*phi *jariJari*jariJari*jariJari)/3;
    }
}
class kerucut {
    public double jariKerucut, tinggi, garisPelukis;
    public double phi = 3.14;

    public kerucut(double j, double t, double s){
        jariKerucut=j;
        tinggi=t;
        garisPelukis=s;
    }
    public double lpKerucut() {

        return phi * jariKerucut * (jariKerucut + garisPelukis);
    }
    public double vKerucut() {

        return  (phi * jariKerucut * jariKerucut * tinggi)/3;
    }
}
public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;){
            System.out.println("\n=============================================================");
            System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN DAN VOLUME BANGUN RUANG");
            System.out.println("=============================================================");
            System.out.println("\n1.Kubus \n2.Bola \n3.Kerucut \n4.Exit");
            System.out.print("Ketik 1-3 untuk memilih bangun ruang: ");
            int pilih =sc.nextInt();
            if (pilih==1){
                System.out.print("Berapa banyak bangun Kubus  yang ingin dihitung? ");
                int nKubus= sc.nextInt();

                kubus [] arrKubus = new kubus[nKubus];
                for(int i=0; i<nKubus; i++){
                    System.out.print("Masukkan sisi Kubus ke" +(i+1)+": ");
                    int si = sc.nextInt();
                    arrKubus[i]= new kubus(si);
                }
                for(int i=0; i<nKubus; i++){
                    System.out.println("Luas Permukaan Kubus" +(i+1)+": " + arrKubus[i].lpKubus());
                    System.out.println("Volume Kubus"+(i+1)+": " + arrKubus[i].vKubus());
                }
            }if(pilih==2){
                System.out.print("Berapa banyak bangun Bola yang ingin dihitung? ");
                int nBola=sc.nextInt();

                bola[] arrBola = new bola[nBola];
                for(int j=0; j<nBola; j++){
                    System.out.print("Masukkan jari-jari Bola ke "+(j+1)+": ");
                    double jr= sc.nextDouble();
                    arrBola[j]=new bola(jr);
                }
                for(int j=0; j<nBola; j++){
                    System.out.println("Luas Permukaan Bola" +(j+1)+": " + arrBola[j].lpBola());
                    System.out.println("Volume Bola"+(j+1)+": " + arrBola[j].vBola());
                }
            }if(pilih==3){
                System.out.print("Berapa banyak bangun Kerucut yang ingin dihitung? ");
                int nKerucut= sc.nextInt();
                kerucut[] arrKerucut = new kerucut[nKerucut];
                for(int k=0; k<nKerucut; k++){
                    System.out.print("Masukkan jari-jari Kerucut ke "+(k+1)+": ");
                    double j = sc.nextDouble();
                    System.out.print("Masukkan tinggi Kerucut ke "+(k+1)+": ");
                    double t = sc.nextDouble();
                    System.out.print("Masukkan garis pelukis Kerucut ke "+(k+1)+": ");
                    double g = sc.nextDouble();
                    arrKerucut[k]=new kerucut(j, t, g);
                }
                for(int k=0; k<nKerucut; k++){
                    System.out.println("Luas Permukaan Kerucut" +(k+1)+": " + arrKerucut[k].lpKerucut());
                    System.out.println( "Volume Kerucut"+(k+1)+": " + arrKerucut[k].vKerucut());
                }
            }if(pilih==4){
                System.out.println("Terimakasih");
                break;
            }
        }
    }
}

