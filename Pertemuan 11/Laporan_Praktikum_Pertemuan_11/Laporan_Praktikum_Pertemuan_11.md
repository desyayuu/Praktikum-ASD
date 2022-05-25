# Laporan Praktikum Pertemuan 11
oleh Desy Ayurianti - TI 1G - 10 - 2141720119 

## SubBab 2.1.2
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?

    **Hal ini karena list belum ada data. Dalam class SLLMain langsung memanggil method print yang saat itu masih belum ada data, jika list masih kosong maka dalam method print akan mencetak "Linked List Kosong""**
2. Pada step 10, jelaskan kegunaan kode berikut
```java
ndInput.next=temp.next;
temp.next=ndInput;
```
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut 
```java
if(temp.next.next==null) tail=temp.next;
```

## SubBab2.2.3
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
**Untuk menghentikan proses penghapusan agar prosesnya berjalan 1 kali** 
2. Jelaskan kegunaan kode dibawah pada method remove
```java
else if(temp.next.data==key){
    temp.next=temp.next.next;
        }
```
**Jika memenuhi kondisi dimana data sama dengan inputan key, maka posisi temp.next berada di posisi setelah posisi yang awal(temp.next.next)**
3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud
   masing-masing kembalian tersebut!
**Nilai kembalian -1 dan index. Nilai kembalian -1 jika tidak ada data / data kosong. Sedangkan nilai kembalian index jika ada data dan untuk mengoutputkan letak data yang dicari(key)** 

## Tugas 
1. Sintaks Modifikasi insert before 
```java
 public void insertBefore(int key, int input){
        int index = indexOf(key);
        insertAt(index,input);
    }
```
Sintaks modifikasi di main: 
```java
SingleLinkedListT1 singLLT1 = new SingleLinkedListT1();

        System.out.println("Modifikasi InsertBefore");
        singLLT1.print();
        singLLT1.addFirst(123);
        singLLT1.print();
        singLLT1.addLast(126);
        singLLT1.print();
        singLLT1.insertAfter(123, 124);
        singLLT1.print();
        singLLT1.insertBefore(126,125);
        singLLT1.print();
```

Output: 
<img src = "TugasNo1.1.jpg">


2. Syntax
```java
class NodeT2{
    char data;
    NodeT2 next;

    public NodeT2(char nilai, NodeT2 berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}
class SingleLinkedListT2{
    NodeT2 head;
    NodeT2 tail;

    public boolean isEmpty() {

         return head == null;
    }

    public void print(){
        if (!isEmpty()) {
            NodeT2 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    public void addFirst(char input){
        NodeT2 ndInput = new NodeT2(input, null);
        if(isEmpty()){
            head=ndInput;
            tail=ndInput;
        }else{
            ndInput.next=head;
            head=ndInput;
        }
    }

    public void addLast(char input) {
        NodeT2 ndInput = new NodeT2(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(char key, char input) {
        NodeT2 ndInput = new NodeT2(input, null);
        NodeT2 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);

    }
    public void insertAt(int index, char input){
        if(index<0){
            System.out.println("indeks salah");
        }else if(index==0) {
            addFirst(input);
        }else{
            NodeT2 temp =head;
            for(int i=0; i<index-1; i++){
                temp=temp.next;
            }
            temp.next=new NodeT2(input, temp.next);
            if(temp.next.next==null) tail=temp.next;
        }
    }
    public void insertBefore(char key, char input){
        int index = indexOf(key);
        insertAt(index, input);
    }

    public int indexOf(int key){
        NodeT2 tmp=head;
        int index=0;
        while(tmp!=null&& tmp.data!=key){
            tmp=tmp.next;
            index++;
        }
        if(tmp==null){
            return -1;
        }else {
            return index;
        }
    }
}

public class TugasNo2 {
    public static void main(String[] args) {
        SingleLinkedListT2 SLLT2 = new SingleLinkedListT2();

        SLLT2.print();
        SLLT2.addFirst('a');
        SLLT2.print();
        SLLT2.insertAt(1, 'c');
        SLLT2.print();
        SLLT2.insertBefore('c', 'b');
        SLLT2.print();
        SLLT2.insertAfter('c', 'd');
        SLLT2.print();
        SLLT2.addLast('e');
        SLLT2.print();
    }

}
```
output:
<img src = "TugasNo2.1.jpg">

3. Syntax
```java
class NodeT3{
    String data;
    NodeT3 next;

    public NodeT3(String  nilai, NodeT3 berikutnya){
        this.data=nilai;
        this.next=berikutnya;
    }
}
class SingleLinkedListT3{
    NodeT3 head;
    NodeT3 tail;

    public boolean isEmpty() {

        return head == null;
    }

    public void print(){
        NodeT3 tmp = head;
        System.out.println("Isi Linked List: \n");
        while(tmp !=null){
            System.out.println(tmp.data + "\t");
            tmp=tmp.next;
        }
        System.out.println();
    }
    public void push(String input){
        NodeT3 ndInput = new NodeT3(input, null);
        ndInput.data=input;
        ndInput.next=head;
        head=ndInput;

    }
    public String peek(){
        return head.data;
    }


}

public class TugasNo3 {
    public static void main(String[] args) {
        SingleLinkedListT3 SLLT3 = new SingleLinkedListT3();
        SLLT3.push("Bahasa");
        SLLT3.print();
        SLLT3.push("Android");
        SLLT3.print();
        SLLT3.push("Komputer");
        SLLT3.print();
        SLLT3.push("Basis Data");
        SLLT3.print();
        SLLT3.push("Matematika");
        SLLT3.print();
        SLLT3.push("Algoritma");
        SLLT3.print();
        SLLT3.push("Statistika");
        SLLT3.print();
        SLLT3.push("Multimedia");


        SLLT3.print();

        System.out.println("Data Paling Atas : " + SLLT3.peek() );
    }
}

```

Output 

<img src = "TugasNo3.1.jpg">
<img src = "TugasNo3.2.jpg">
<img src = "TugasNo3.3.jpg">


4. Syntax 
```java
import java.util.Scanner;

class NodeMahasiswa{
    String nama, nim;
    int absen;
    double ipk;
    NodeMahasiswa next;

    public NodeMahasiswa(String  nim, String nama, int absen, double ipk, NodeMahasiswa berikutnya){
        this.nim=nim;
        this.nama=nama;
        this.absen=absen;
        this.ipk=ipk;
        this.next=berikutnya;
    }
}
class SLLMahasiswa {
    NodeMahasiswa head;
    NodeMahasiswa tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void peek() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            System.out.println("Mahaiswa Terdepan");
            System.out.println("NIM: " + tmp.nim);
            System.out.println("Nama: " + tmp.nama);
            System.out.println("No Asen: " + tmp.absen);
            System.out.println("IPK: " + tmp.ipk);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Mahaiswa Terbelakang");
                    System.out.println("NIM: " + tmp.nim);
                    System.out.println("Nama: " + tmp.nama);
                    System.out.println("No Asen: " + tmp.absen);
                    System.out.println("IPK: " + tmp.ipk);
                }
                tmp=tmp.next;
            }
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void peekPosition(int index) {
        if (isEmpty()) {
            System.out.println("Antian kosong");
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Mahasiswa pada index ke-" + index + ": ");
            System.out.println("NIM: " + tmp.nim);
            System.out.println("Nama: " + tmp.nama);
            System.out.println("No Asen: " + tmp.absen);
            System.out.println("IPK: " + tmp.ipk);
        }
    }

    public void tambahData(String nim, String nama, int absen, double ipk) {
        NodeMahasiswa ndInput = new NodeMahasiswa(nim, nama, absen, ipk, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }

    }

    public void hapusData() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
            System.out.println("Data berhasil dihapus");
        }
    }


    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            NodeMahasiswa tmp = head;
            int urut = 0;
            while (tmp != null) {
                System.out.println("Mahaiswa ke-" + urut + " :");
                System.out.println("NIM: " + tmp.nim);
                System.out.println("Nama: " + tmp.nama);
                System.out.println("No Asen: " + tmp.absen);
                System.out.println("IPK: " + tmp.ipk);
                tmp = tmp.next;
                urut++;
            }
        }
    }
    public void clear(){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            head=tail=null;
            System.out.println("Data Antrian berhasil dikosongkan");
        }
    }

}

public abstract class TugasNo4 {
    public static void main(String[] args) {
        SLLMahasiswa sllM = new SLLMahasiswa();
        Scanner sc = new Scanner(System.in);
        int pilih;
        String nim, nama;
        int absen;
        double ipk;

        do{
            menu();
            System.out.println("Pilih menu: ");
            pilih = sc.nextInt();
            if(pilih==1){
                System.out.println("Masukkan Data Antrian: ");
                System.out.print("NIM: ");
                nim=sc.next();
                System.out.print("Nama: ");
                nama=sc.next();
                System.out.print("No Absen: ");
                absen=sc.nextInt();
                System.out.print("IPK: ");
                ipk=sc.nextDouble();
                sllM.tambahData(nim, nama, absen, ipk);
            }else if(pilih==2){
                sllM.hapusData();
            }
            else if(pilih==3){
                sllM.peek();

            }else if(pilih==4){
                sllM.peekRear();

            }else if(pilih==5){
                System.out.print("Masukkan index yang akan ditampilkan: ");
                int idx= sc.nextInt();
                sllM.peekPosition(idx);

            }else if(pilih==6){
                sllM.print();

            }else if(pilih==7){
                sllM.clear();

            }else if(pilih==8){
                System.out.println("Terimakasih");
                break;
            }
            else{
                System.out.println("Inputan salah!");
            }
        }while (pilih==1 || pilih==2 || pilih==3|| pilih==4|| pilih==5|| pilih==6|| pilih==7 || pilih==8);


    }
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Antrian baru");
        System.out.println("2. Hapus Antrian terakhir");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Cek posisi antrian melalui index ");
        System.out.println("6. Tampil Data");
        System.out.println("7. Hapus semua data Antrian");
        System.out.println("8. Keluar");
        System.out.println("-------------------------------");

    }
}

```


Output


<img src = "TugasNo4.1.jpg">
<img src = "TugasNo4.2.jpg">
<img src = "TugasNo4.3.jpg">
<img src = "TugasNo4.4.jpg">
<img src = "TugasNo4.5.jpg">
<img src = "TugasNo4.6.jpg">