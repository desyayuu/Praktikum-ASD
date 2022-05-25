import java.util.Scanner;
class Node1{
    String dataNama;
    int dataAntrian;
    Node1 prev, next;

    Node1(Node1 prev, int dataAntrian, String dataNama, Node1 next){
        this.prev=prev;
        this.dataAntrian=dataAntrian;
        this.dataNama=dataNama;
        this.next=next;
    }
}
class DLList{
    Node1 head;
    int size;

    public DLList(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head ==null;
    }
    public void addFirst(int noAntri, String nama){
        if(isEmpty()){
            head =new Node1(null, noAntri, nama, null);
        }else{
            Node1 newNode = new Node1(null, noAntri, nama, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void addLast(int noAntri, String nama){
        if(isEmpty()){
            addFirst(noAntri, nama);
        }else{
            Node1 current = head;
            while (current.next !=null){
                current=current.next;
            }
            Node1 newNode = new Node1(current, noAntri, nama, null);
            current.next=newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kodsong, tidak dapat dihapus");
        }else if(size==1){
            removeLast();
        }else{
            System.out.println(head.dataNama + " telah selesai divaksinasi");
            head=head.next;
            head.prev=null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node1 current = head;
        while(current.next.next !=null){
            current=current.next;
        }
        current.next=null;
        size--;
    }
    public void remove(int index) throws Exception{
        if(isEmpty() || index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index==0){
            removeFirst();
        }else{
            Node1 current = head;
            int i =0;
            while (i<index){
                current=current.next;
                i++;
            }
            if(current.next==null){
                current.prev.next=null;
            }else if(current.prev==null){
                current=current.next;
                current.prev=null;
                head=current;
            }else{
                current.prev.next=current.next;
                current.next.prev=current.prev;
            }
            System.out.println(current.dataNama + " telah selesai divaksinasi");
            size--;
        }
    }
    public void print(){
        if(!isEmpty()){
            Node1 tmp = head;
            System.out.println("|No.\t|Nama\t|");
            while (tmp!=null){
                System.out.println("|"+ tmp.dataAntrian +"\t|"+ tmp.dataNama+"\t|");
                tmp=tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }
    public int size(){
        return size;
    }
}
public class TugasNo1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLList DLLVaksin= new DLList();

        for(;;){
            menu();
            int pilih = sc.nextInt();
            if(pilih==1){
                System.out.println("--------------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("--------------------------------");
                System.out.print("Nomor Antrian: ");
                int no = sc.nextInt();
                System.out.print("Nama Penerima: ");
                String nama= sc.next();
                DLLVaksin.addLast(no, nama);
            }else if(pilih==2){
                System.out.println("--------------------------------");
                System.out.println("Masukkan Index Antrian yang ingin dihapus");
                System.out.println("--------------------------------");
                int no = sc.nextInt();
                DLLVaksin.remove(no);
            }else if(pilih==3){
                System.out.println("--------------------------------");
                System.out.println("Daftar Pengantri Vakin");
                System.out.println("--------------------------------");
                DLLVaksin.print();
                DLLVaksin.size();
                System.out.println("Sisa antrian: " + DLLVaksin.size);
            }else if(pilih==4){
                System.out.println("Terimakasih");
                break;
            }else{
                System.out.println("Input salah!");
            }
        }
    }
    public static void menu(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tPENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
    }

}

