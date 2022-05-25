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
