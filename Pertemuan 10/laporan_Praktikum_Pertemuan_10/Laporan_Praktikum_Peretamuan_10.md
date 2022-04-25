# Laporan Praktikum Pertemuan 10 
oleh Desy Ayurianti - 1G D4 TI - 10 - 2141720119 

## SubBab 8.2.3
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
   bernilai 0?
   
**Nilai awal atribut front dan rear bernilai -1 dan size bernilai 0 karena kondisi tersebut merupakan kondisi awal saat queue dalam keadaan kosong. Jika masih kosong, maka nilai front dan rearnya pasti -1, sedangkan size masih 0 karena belum ada data yang masuk** 
2. ada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (rear == max - 1) {
    rear = 0;
}
```
**Maksud method enqueue tersebut adalah apabila posisi rear berada di posisi max-1 artinya rear sudah di indeks terakhir array maka jika ada data baru, rearnya menjadi ada di indeks 0 lagi. Jadi nilai rear tersebut tidak melebihi batas maksimal dari indeks arraynya**
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
```java
if (front == max - 1) {
    front = 0;
}
```
**Maksud dari method dequeue tersebut adalah apabila posisi front sudah mencapai indeks terakhir array (max-1) maka jika ada data yg keluar, posisi frontnya menjadi di indeks 0 lagi dan tidak melebihi batas dari indeks arraynya**
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari
   0(int i =0), melainkan int i =front?

**Proses perulangan variabel i tidak dimulai dari 0 karena tidak selamanya data terdepan ada di indeks 0, data teredepan bisa saja tidak di indeks 0, jadi variable i dimulai dari posisi indeks pada frontnya**
5. Pada method print, jelaskan maksud dari potongan kode berikut!
```java
i = (i + 1) % max;
```
**Potongan kode tersebut diekskusi ketika posisi variabel i tidak sama dengan posisi indeks rearnya. nilai i dalam kode tersebut ditambah dengan 1 kemudian di modkan sesuai dengan nilai maxnya. kode mod ini dimaksudkan agar dapat melanjutkan iterasi ke data selanjutnya**
6. Tunjukkan potongan kode program yang merupakan queue overflow!
```java
   if(IsFull()){
     System.out.println("Queue sudah penuh");
   ```
   dan 
```java
    System.out.print("Masukkan data baru: ");
    int dataMasuk = sc.nextInt();
    Q.Enqueue(dataMasuk);
    break;
```
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
   dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
   queue overflow dan queue underflow, program dihentikan!
**Pada method dequeue tidak perlu dimodifikasi, sedangkan methos enqueue dimodif menjadi:" 
```java
public int Enqueue(int dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
            return 0;
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
        return 1;
    }
```
**dan untuk di main ada perubahan di case 1 dan 2 sbb:**
```java
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    pilih =Q.Enqueue(dataMasuk);
                    break;
                case 2 :
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar !=0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }else{
                        pilih=dataKeluar;
                        break;
                    }
```
   
## SubBab 8.3.3
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
```java
if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
            && data.saldo != 0) {
        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " "
                + data.alamat + " " + data.umur + " " + data.saldo);
        break;
    }
```  
**Kode program diatas digunakan untuk mengecek jika memilih menu deque, jika ada data dari norek, nama, alamat, umur, dan saldo maka ketika ada yang didequeue, akan diprint data antrian yang keluar. Jika salah satu dari data-data tersebut kosng, maka tidak akan diprint data antrian yang keluar**
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
   Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
   daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
   dapat dipanggil!
```java
   public void peekRear(){ 
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang: "+data[rear].norek + " " + data[rear].nama +" "+data[rear].alamat + " " +data[rear].umur + " " + data[rear].saldo + " ");
        }else{
            System.out.println("Queu sudah kosonng!");
        }

    }
   ```

## SubBab 8.4
1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:
   a. Method peekPosition(data: int) : void
      Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan
      data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa
   b. Method peekAt(position: int) : void
      Untuk menampilkan data yang berada pada posisi (indeks) tertentu
      Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut
      dapat dipanggil!

a. 
```java
   public void peekPosition(int data){
        for(int i=0; i<max; i++){
            int peekPosisi=this.data[i];
                if(peekPosisi==data){
                System.out.println("Data " + data + " ada di posisi indeks ke- " + i);
            }
        }
   }

```
b. 
```java
public void peekAt(int position){
    for(int i=0;i<max; i++){
        if(position==i){
        System.out.println("Data yang ada di indeks ke-"+i+" adalah "+this.data[i]);}
        }
    }
}
```

Screenshot seluruh Kode Program

<img src = jobs8T1.1.jpg>
<img src = jobs8T1.2.jpg>
<img src = jobs8T1.3.jpg>
<img src = jobs8T1.4.jpg>
<img src = jobs8T1.5.jpg>
<img src = jobs8T1.6.jpg>
<img src = jobs8T1.7.jpg>
<img src = jobs8T1.8.jpg>

Output

<img src = jobs8T1.9.jpg>
<img src = jobs8T1.10.jpg>

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan
   KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus
   menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class
   diagram 
```java
import java.util.Scanner;

class Mahasiswa{
    String nim, nama;
    int absen;
    double ipk;

    Mahasiswa(){

    }
    Mahasiswa(String nim, String nama, int absen, double ipk){
        this.nim=nim;
        this.nama=nama;
        this.absen=absen;
        this.ipk=ipk;
    }
}
class MahasiwaQueue{
    Mahasiswa[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public MahasiwaQueue(int n){
        max=n;
        antrian=new Mahasiswa[max];
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
    public void Enqueue(Mahasiswa antri){
        if(IsFull()){
            System.out.println("Queue sudah penuh!");
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
            antrian[rear]=antri;
            size++;
        }
    }

    public Mahasiswa Dequeu(){
        Mahasiswa antri = new Mahasiswa();
        if(IsEmpty()){
            System.out.println("Queue sudah penuh!");
        }else{
            antri= antrian[front];
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
        return antri;
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i=front;
            while(i !=rear){
                System.out.println(antrian[i] + " ");
                i=(i+1)%max;
            }
            System.out.println(antrian[i] + " ");
            System.out.println("Jumlah elemen = " +size);
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: " +antrian[front]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang: " +antrian[rear]);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekPosition(String nim){
        int i = front;
        int posisi = 1;
        System.out.print("data " + nim + " ada pada posisi : ");
        while(i != rear) {
            if (antrian[i].nim.equals(nim)){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (antrian[i].nim.equals(nim)){
            System.out.print(posisi + " ");
        }
        System.out.println();

    }
    public void printMahasiswa(int posisi){
        for(int i=0; i< max; i++){
            if(i==posisi){
                System.out.println("Data pada antrian ke- " +i + " adalah " + antrian[i].nim + " " + antrian[i].nama +
                        " " + antrian[i].absen + " " + antrian[i].ipk);

            }
        }
    }
}
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        MahasiwaQueue antri = new MahasiwaQueue(jumlah);
        int pilih;

        do {
            menuMahasiswa();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Absen: ");
                    int absen = sc.nextInt();
                    System.out.println("IPK: ");
                    double ipk = sc.nextDouble();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    antri.Enqueue(mhs);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeu();
                    if (!"".equals(data.nim) && !"".equals(data.nama) && data.absen !=0 && data.ipk !=0 ) {
                        System.out.println("Antrian yang keluar: " + data.nim + " " + data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan NIM: ");
                    String findNim = sc.next();
                    antri.peekPosition(findNim);
                    break;
                case 7:
                    System.out.println("Masukkan posisi antrian mahasiswa: ");
                    int findPos= sc.nextInt();
                    antri.printMahasiswa(findPos);
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4) ;
    }
    public static void menuMahasiswa(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek semua antrian");
        System.out.println("4. Cek Antrian terdepan");
        System.out.println("5. Cek Antrian terbelakang");
        System.out.println("6. Cek posisi antrian melalui nim ");
        System.out.println("7. Tampil Data di Antrian tertentu");
        System.out.println("-------------------------------");
    }
}
```

Screenshoot Output: 
1. Screenshoot cek posisi antrian melalui NIM

<img src = jobs8T2.1.jpg>
<img src = jobs8T2.2.jpg>
<img src = jobs8T2.3.jpg>

2. Screenshoot menu tampil data melalui posisi antrian tertentu

<img src = jobs8T2.4.jpg>
<img src = jobs8T2.5.jpg>
<img src = jobs8T2.6.jpg>
