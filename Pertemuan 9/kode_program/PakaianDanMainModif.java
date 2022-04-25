import java.util.Scanner;
class PakaianModif{
    String jenis, warna, merk, ukuran;
    double harga;

    PakaianModif(String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis=jenis;
        this.warna=warna;
        this.merk=merk;
        this.ukuran=ukuran;
        this.harga=harga;
    }
}
class StackModif{
    int size, top;
    PakaianModif[] data;

    public StackModif(int size){
        this.size=size;
        data= new PakaianModif[size];
        top=-1;
    }
    public boolean IsEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(top==size-1){
            return true;
        }else {
            return false;
        }
    }
    public void push(PakaianModif pkn){
        if(!IsFull()){
            top++;
            data[top]=pkn;
        }else{
            System.out.println("Isi stack penuh! ");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            PakaianModif x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " +x.ukuran +" "+ x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " "+ data[top].harga);
    }
    public void print(){
        System.out.println("Isi Stack: ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " "+ data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
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
public class PakaianDanMainModif {
    public static void main(String[] args) {
        StackModif stk = new StackModif(5);
        Scanner sc = new Scanner(System.in);

        boolean back=false;
        do{
            System.out.println("====Pilih Fitur====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("6. Exit");
            System.out.print("Masukkan angka 1-5 untuk memilih fitur: ");
            int choose =sc.nextInt();
            if(choose==1){
                char pilih;
                sc.nextLine();
                do{
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();

                    PakaianModif p = new PakaianModif(jenis, warna, merk, ukuran, harga);
                    System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
                    pilih =sc.next().charAt(0);
                    sc.nextLine();
                    stk.push(p);

                }while(pilih=='y');

            }else if(choose==2){
                stk.pop();
            }else if(choose==3){
                stk.peek();
            }else if(choose==4) {
                stk.print();
            } else if(choose==5){
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

