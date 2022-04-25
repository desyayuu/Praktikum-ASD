import java.util.Scanner;

class Struk{
    int noTransaksi;
    int tglPembelian;
    int jumBarang;
    int totalHarga;

    Struk(int no, int tgl, int jum, int totHarga){
        this.noTransaksi=no;
        this.tglPembelian=tgl;
        this.jumBarang=jum;
        this.totalHarga=totHarga;
    }
}
class StackStruk{
    int size,top;
    Struk [] dataStruk;

    public StackStruk(int size){
        this.size=size;
        dataStruk = new Struk[size];
        top=-1;
    }
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }else {
            return false;
        }
    }
    public boolean IsEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(Struk stk){
        if(!IsFull()){
            top++;
            dataStruk[top]=stk;
        }else{
            System.out.println("Isi stack penuh! ");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            Struk x = dataStruk[top];
            top--;
            System.out.println("Data yang keluar: ");
            System.out.println("No Transaksi: " + x.noTransaksi);
            System.out.println("Tanggal Pembelian: " +x.totalHarga);
            System.out.println("Jumlah Barang yang dibeli: " +x.jumBarang);
            System.out.println("Total Harga Bayar: " +x.totalHarga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: " + dataStruk[top].noTransaksi + " " + " " +
                dataStruk[top].tglPembelian + " " + dataStruk[top].jumBarang + " " + dataStruk[top].totalHarga);
    }
    public void print(){
        System.out.println("Isi Stack: ");
        for(int i = top; i>=0; i--){
            System.out.println("No Transaksi: " + dataStruk[i].noTransaksi);
            System.out.println("Tanggal Pembelian: " + dataStruk[i].tglPembelian);
            System.out.println("Jumlah Barang yang dibeli: " +dataStruk[i].jumBarang);
            System.out.println("Total Harga Bayar: " +dataStruk[i].totalHarga);
        }
        System.out.println(" ");
    }
    public void clear(){
        if(!IsEmpty()){
            for(int i= top; i>=0; i++){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }

}
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackStruk sst = new StackStruk(8);

        boolean back=false;
        do{
            System.out.println("====Pilih Fitur====");
            System.out.println("1. Masukkan Struk");
            System.out.println("2. Ambil Struk");
            System.out.println("3. Periksa struk");
            System.out.println("4. Print Struk");
            System.out.println("5. Hapus semua Struk");
            System.out.println("6. Exit");
            System.out.print("Masukkan angka 1-5 untuk memilih fitur: ");
            int choose =sc.nextInt();
            if(choose==1){
                char pilih;
                sc.nextLine();
                do{
                    System.out.print("No Transaksi: ");
                    int no = sc.nextInt();
                    System.out.print("Tanggal Pembelian: ");
                    int tgl = sc.nextInt();
                    System.out.print("Jumlah barang yang dibeli: ");
                    int jum = sc.nextInt();
                    System.out.print("Total Harga Bayar: ");
                    int tot = sc.nextInt();

                    Struk s = new Struk(no, tgl, jum, tot);
                    System.out.print("Apakah Anda akan menambahkan struk baru ke stack (y/n) ? ");
                    pilih =sc.next().charAt(0);
                    sc.nextLine();
                    sst.push(s);

                }while(pilih=='y');

            }else if(choose==2){
                System.out.println("Masukkan jumlah struk yang ingin diambil: ");
                int ambil = sc.nextInt();
                System.out.println("======Data yang Keluar=====");
                for(int i=0; i<ambil; i++){
                    sst.pop();
                }
            }else if(choose==3){
                sst.peek();
            }else if(choose==4) {
                sst.print();
            }else if(choose==5){
                sst.clear();
            } else if(choose==6){
                System.out.println("Terimakasih");
                break;
            }else{
                System.out.println("Inputan salah");
                back=true;
            }
            System.out.println();
            System.out.println("Apakan ingin kembali ke menu fitur (y/n) ?");
            String choose2 = sc.next();
            if(choose2.equalsIgnoreCase("y")){
                back=true;
            }else if(choose2.equalsIgnoreCase("n")){
                back=false;
            }
        }while(back);

    }
}
