public class fungsi{
	public static void main(String []args){
		String cabangToko[]= {"RoyalGarden1","RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
		String namaBunga[] ={"Aglonema", "Keladi", "Alocasia", "Mawar"};
		int stock[][] ={{10, 5, 15, 7},
						{6, 11, 9, 12},
						{2, 10, 10, 5},
						{5, 7, 12, 9},
		};
		tampilArray(cabangToko, namaBunga, stock);
		hitungStock(cabangToko, namaBunga, stock);
	}
	static void tampilArray(String[]arrToko, String[]arrBunga, int[][]arrStock){
		System.out.println("");
		System.out.println("\t\t\t\t\tA. ARRAY STOCK BUNGA");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.print("             ");
		for(int j=0; j<arrBunga.length; j++){
			System.out.print("\t|\t"+arrBunga[j]+ "  ");
		}
		System.out.println("\t\t|\t");
		System.out.print("-----------------------------------------------------------------------------------------------------------------");
		for(int i=0; i<4; i++){
			System.out.println("");
			System.out.println(arrToko[i] +"\t|\t" + arrStock[i][0]+ "\t\t|\t" + arrStock[i][1] + "\t\t|\t" + arrStock[i][2] +  "\t\t|\t" + arrStock[i][3] + "\t\t|\t");
			System.out.print("-----------------------------------------------------------------------------------------------------------------");
		}
		System.out.println("");
	}
	static void hitungStock(String[]arrNato, String[]arrNabu, int[][]arrJum){
		System.out.println("");
		System.out.println("\t\t\t\tB. JUMLAH STOCK SESUAI JENIS BUNGA SELURUH CABANG ");
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.print("             ");
		for(int j=0; j<arrNabu.length; j++){
			System.out.print("\t|\t"+arrNabu[j]+ "  ");
		}
		System.out.println("\t\t|\t");
		System.out.print("");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		for(int i=0; i<4; i++){
			if (i==0){
			arrJum[0][0]-=1;
			arrJum[0][1]-=2;
			arrJum[0][2]-=0;
			arrJum[0][3]-=5;
			}
			System.out.print(" ");
			System.out.println(arrNato[i] +"\t|\t" + arrJum[i][0]+ "\t\t|\t" + arrJum[i][1] + "\t\t|\t" + arrJum[i][2] +  "\t\t|\t" + arrJum[i][3] + "\t\t|\t");
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
		}
		int jum1=0, jum2=0, jum3=0, jum4=0;
		for(int i =0; i<arrJum.length; i++){
			for(int j =0; j<arrJum[0].length; j++){
				if(j==0){
					jum1+=arrJum[i][j];
				}else if(j==1){
					jum2+=arrJum[i][j];
				}else if(j==2){
					jum3+=arrJum[i][j];
				}else if(j==3){
					jum4+=arrJum[i][j];
				}	
			}
		}
		System.out.println(" Jumlah " + "\t|\t" + jum1+ "\t\t|\t" + jum2 + "\t\t|\t" + jum3 +  "\t\t|\t" + jum4 + "\t\t|\t");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
	}
}