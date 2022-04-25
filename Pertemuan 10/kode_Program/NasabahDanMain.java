import java.util.Scanner;

class Nasabah{
    String norek, nama, alamat;
    int umur;
    double saldo;
    Nasabah(){

    }

    Nasabah(String norek, String nama, String alamat, int umur, double saldo){
        this.norek=norek;
        this.nama=nama;
        this.alamat=alamat;
        this.umur=umur;
        this.saldo=saldo;

    }
}

class NasabahQueue{
    Nasabah[]data;
    int front;
    int rear;
    int size;
    int max;

    public NasabahQueue(int n){
        max =n;
        data = new Nasabah[max];
        size=0;
        front=rear=-1;
    }

    public boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }

    public void Enqueue(Nasabah dt){
        if(IsFull()){
            System.out.println("Queu sudah penuh!");
        }else{
            if(IsEmpty()){
                front =rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
        }
    }

    public Nasabah Dequeu(){
        Nasabah dt = new Nasabah();
        if(IsEmpty()){
            System.out.println("Queu sudah penuh!");
        }else{
            dt= data[front];
            size--;
            if(IsEmpty()){
                front =rear =-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }

    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: "+data[front].norek + " " + data[front].nama +" "+data[front].alamat + " " +data[front].umur + " " + data[front].saldo + " ");
        }else{
            System.out.println("Queu sudah kosonng!");
        }

    }


    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i =front;
            while (i !=rear){
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " +data[i].saldo);
                i = (i+1)%max;
            }
            System.out.println(data[i].norek + " " +data[i].nama + " " +data[i].alamat + " " +data[i].umur + " " +data[i].saldo);
            System.out.println("Jumlah elemen = " +size);

        }
    }

    public void clear(){
        if(!IsEmpty()){
            front = rear=-1;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang: "+data[rear].norek + " " + data[rear].nama +" "+data[rear].alamat + " " +data[rear].umur + " " + data[rear].saldo + " ");
        }else{
            System.out.println("Queue sudah kosonng!");
        }

    }


}
public class NasabahDanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        NasabahQueue antri = new NasabahQueue(jumlah);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("No Rekekning: ");
                    String norek = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.println("Umur: ");
                    int umur = sc.nextInt();
                    System.out.println("Saldo: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeu();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4) ;
    }
    public static void menu(){

        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("-------------------------------");

    }
}
