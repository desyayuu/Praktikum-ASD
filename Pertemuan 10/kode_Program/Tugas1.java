import java.util.Scanner;

class QueueTugas1{
    int []data;
    int front;
    int rear;
    int size;
    int max;

    public QueueTugas1(int n){
        max=n;
        data=new int[max];
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
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: " +data[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i=front;
            while(i !=rear){
                System.out.println(data[i] + " ");
                i=(i+1)%max;
            }
            System.out.println(data[i] + " ");
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
    public void Enqueue(int dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }

            }
        }
        data[rear]=dt;
        size++;
    }
    public int Dequeue(){
        int dt=0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt=data[front];
            size--;
            if(IsEmpty()){
                front = rear =-1;
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
    public void peekPosition(int data){
        for(int i=0; i<max; i++){
            int peekPosisi=this.data[i];
            if(peekPosisi==data){
                System.out.println("Data " + data + " ada di posisi indeks ke- " + i);
            }
        }

    }
    public void peekAt(int position){
        for(int i=0; i<max; i++){
            if(position==i){
                System.out.println("Data yang ada di indeks ke-" +i + " adalah " + this.data[i]);
            }
        }
    }
}
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        QueueTugas1 Q = new QueueTugas1(n);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2 :
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar !=0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    System.out.print("Masukkan data yang ingin dicari: ");
                    int data=sc.nextInt();
                    Q.peekPosition(data);
                    break;
                case 6:
                    System.out.print("Masukkan posisi indeks yang dicari: ");
                    int posisi=sc.nextInt();
                    Q.peekAt(posisi);
                    break;
                case 7:
                    Q.clear();
                    break;
            }


        }while(pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5);

    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Position");
        System.out.println("6. Peek At");
        System.out.println("7. Clear");
        System.out.println("---------------------------------");

    }
}
