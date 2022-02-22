import java.util.Scanner; 
public class Tugas1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPendapatan Smile Laundry");
		System.out.print("===============================================");
		double totPemasukan=0;
		for(int i=0; i<4; i++){
			System.out.println("");
			System.out.print("Nama Customer " + (i+1) +"\t\t\t:");
			String nama = sc.next();
			System.out.print("Berat pakaian (kg)\t\t:");
			int beratLaundry = sc.nextInt();
		
			double hasilDiskon= hargaDiskon(beratLaundry);
			System.out.println("Biaya Laundry Customer "+ (i+1)+ "\t:"+hasilDiskon);
			totPemasukan+=hasilDiskon;
		}
		System.out.println("===============================================");
		System.out.println("Total Pendapatan\t\t:"+totPemasukan);
		System.out.println("===============================================");
	}
	
	static double hargaDiskon(int a){
		double diskon=0; 
		if(a>10){
			diskon=0.05;
		}
		double hasil= (4500*a)-(diskon*4500*a);
		return hasil;
	}
}