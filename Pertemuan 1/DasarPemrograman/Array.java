import java.util.Scanner;
public class Array{
	public static void main(String []args){
		int jumAglonema=0, jumAlocasia=0, jumKeladi=0, jumMawar=0;
		int stock[][] ={{10, 5, 15, 7},
						{6, 11, 9, 12},
						{2, 10, 10, 5},
						{5, 7, 12, 9},
		};
		//mencari jumlah stock bunga
		for(int i =0; i<stock.length; i++){
			for(int j =0; j<stock[0].length; j++){
				if(j==0){
					jumAglonema+=stock[i][j];
				}else if(j==1){
					jumKeladi+=stock[i][j];
				}else if(j==2){
					jumAlocasia+=stock[i][j];
				}else if(j==3){
					jumMawar+=stock[i][j];
				}	
			}
		}
		System.out.println("Jumlah Stock Aglonema: "+jumAglonema);
		System.out.println("Jumlah Stock Keladi: "+jumKeladi);
		System.out.println("Jumlah Stock Alocasia: "+jumAlocasia);
		System.out.println("Jumlah Stock Mawar: "+jumMawar);
		
		//menghitung pendapatan
		int totalPendapatan=+75000*(stock[0][0]-1) + 50000*(stock[0][1]-2)+ 60000*(stock[0][2]-0) + 10000*(stock[0][3]-5);
		System.out.println("=============================");
		System.out.println("Pendapatan RoyalGarden 1");
		System.out.println("=============================");
		System.out.println("Total pendapatan: "+totalPendapatan);
	}
}