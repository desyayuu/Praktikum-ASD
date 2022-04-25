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
