import java.util.Scanner;
public class perulangan{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Masukkan NIM: ");
		String hari;
		int x=1;
		int nim = sc.nextInt();
		System.out.println("=======================");
		System.out.print("Nilai n (2 digit terakhir NIM Anda): ");
		int n = sc.nextInt();
		if (n<10){
			n+=10;
		}
		
		for(int i=1;i<=n;i++){
			if(x==1){
				hari = "Senin";
				System.out.print(" "+hari);
				x++;
			}else if(x==2){
				hari = "Selasa";
				System.out.print(" "+hari);
				x++;
			}else if(x==3){
				hari = "Rabu";
				System.out.print(" "+hari);
				x++;
			}else if(x==4){
				hari = "Kamis";
				System.out.print(" "+hari);
				x++;
			}else if(x==5){
				hari = "Jumat";
				System.out.print(" "+hari);
				x++;
			}else if(x==6){
				hari = "Sabtu";
				System.out.print(" "+hari);
				x++;
			}else{
				hari = "Minggu";
				System.out.print(" " +hari);
				x = 1;
			}
		}
	}
}