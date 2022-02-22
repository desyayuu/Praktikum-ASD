import java.util.Scanner;
public class Tugas2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		menu();
	}
	static void menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("===============================================================");
		System.out.println("\tPROGRAM MENGHITUNG KECEPATAN, JARAK, DAN WAKTU");
		System.out.println("===============================================================");
		System.out.println("Pilih menu rumus yang akan dihitung ");
		System.out.println("1. Menghitung Kecepatan ");
		System.out.println("2. Menghitung Jarak ");
		System.out.println("3. Menghitung Waktu ");
		System.out.println("4. Keluar ");
		System.out.print("Masukkan pilihan menu dengan angka 1-3: ");
		int pilihMenu = sc.nextInt();
		if(pilihMenu==1){
			kecepatan();
		}else if(pilihMenu==2){
			jarak();
		}else if(pilihMenu==3){
			waktu();
		}else if(pilihMenu==4){
			
		}else{
			System.out.println("Maaf angka yang anda inputkan salah");
			menu();
		}
	}
	static void kecepatan(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("PROGRAM MENGHITUNG KECEPATAN");
		System.out.println("===============================================================");
		System.out.print("Masukkan jarak(m): ");
		double s = sc.nextDouble();
		System.out.print("Masukkan waktu(s): ");
		double t = sc.nextDouble();
		double hasilKecepatan= s/t;
		System.out.println("===============================================================");
		System.out.println("Kecepatan: "+hasilKecepatan + " m/s");
		menu();
		System.out.println("");
	}
	static void jarak(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("PROGRAM MENGHITUNG JARAK");
		System.out.println("===============================================================");
		System.out.print("Masukkan kecepatan(m/s): ");
		double v = sc.nextDouble();
		System.out.print("Masukkan waktu(s): ");
		double t = sc.nextDouble();
		double hasilJarak= v*t;
		System.out.println("===============================================================");
		System.out.println("Jarak: "+hasilJarak+ " m");
		menu();
		System.out.println("");
	}
	static void waktu(){
		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("PROGRAM MENGHITUNG WAKTU");
		System.out.println("===============================================================");
		System.out.print("Masukkan jarak(m): ");
		double s = sc.nextDouble();
		System.out.print("Masukkan kecepatan(m/s): ");
		double v = sc.nextDouble();
		double hasilWaktu= s/v;
		System.out.println("===============================================================");
		System.out.println("Waktu: "+hasilWaktu + " s");
		menu();
		System.out.println("");
	}
}
