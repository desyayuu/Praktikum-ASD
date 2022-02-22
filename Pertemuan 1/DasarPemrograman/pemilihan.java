import java.util.Scanner;
public class pemilihan{
	public static void main(String []args){
		Scanner sc = new Scanner (System.in);
		System.out.println("PROGRAM MENGHITUNG NILAI AKHIR MAHASISWA");
		System.out.println("========================================");
		System.out.print("Masukkan nilai tugas: ");
		int tugas = sc.nextInt();
		System.out.print("Masukkan nilai UTS: ");
		int uts = sc.nextInt();
		System.out.print("Masukkan nilai UAS: ");
		int uas = sc.nextInt();
		System.out.println("========================================");
		System.out.println("========================================");
		double nilaiAkhir = 0.2*tugas + 0.45*uas + 0.35*uts;
		System.out.println("Nilai Akhir mahasiswa: "+ nilaiAkhir);
		String nilaiHuruf= new String();
		if(nilaiAkhir>80 && nilaiAkhir<=100){
			nilaiHuruf= "A";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir>73 && nilaiAkhir<=80){
			nilaiHuruf= "B+";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir>65 && nilaiAkhir<=73){
			nilaiHuruf= "B";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir>60 && nilaiAkhir<=65){
			nilaiHuruf= "C+";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir>50 && nilaiAkhir<=60){
			nilaiHuruf= "C";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir>39 && nilaiAkhir<=50){
			nilaiHuruf= "D";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}else if(nilaiAkhir<=39){
			nilaiHuruf= "E";
			System.out.println("Nilai Huruf: "+ nilaiHuruf);
		}
		System.out.println("========================================");
		if(nilaiHuruf.equals("D")||nilaiHuruf.equals("E")){
			System.out.println("Maaf Tidak Lulus");
		}else{
			System.out.println("SELAMAT LULUS");
		}
	}
}