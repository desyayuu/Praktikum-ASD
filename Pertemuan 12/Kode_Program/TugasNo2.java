import java.util.Scanner;
class NodeFilm{
    int dataId;
    String dataJudul;
    float dataRating;
    NodeFilm prev, next;

    NodeFilm(NodeFilm prev, int id, String judul, float rating, NodeFilm next){
        this.prev=prev;
        this.dataId=id;
        this.dataJudul=judul;
        this.dataRating=rating;
        this.next=next;
    }
}
class DLLFilm{
    NodeFilm head;
    int size;

    public DLLFilm(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){

        return head ==null;
    }
    public void addFirst(int id, String judul, float rating){
        if(isEmpty()){
            head =new NodeFilm(null, id, judul, rating, null);
        }else{
            NodeFilm newNode = new NodeFilm(null, id, judul, rating, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }
    public void addLast(int id, String judul, float rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else{
            NodeFilm current = head;
            while (current.next !=null){
                current=current.next;
            }
            NodeFilm newNode = new NodeFilm(current, id, judul, rating, null);
            current.next=newNode;
            size++;
        }
    }
    public void add(int id, String judul, float rating, int index ) throws Exception{
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else if (index<0 || index>size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            NodeFilm current = head;
            int i=0;
            while(i<index){
                current = current.next;
                i++;
            }
            if(current.prev==null){
                NodeFilm newNode = new NodeFilm(null, id, judul, rating, current);
                current.prev=newNode;
                head=newNode;
            }else{
                NodeFilm newNode = new NodeFilm(current, id, judul, rating, current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head=null;
        size=0;
    }
    public void print(){
        if(!isEmpty()){
            NodeFilm tmp = head;
            while (tmp!=null){
                System.out.println("ID:\t"+ tmp.dataId );
                System.out.println("Judul Film:\t" +tmp.dataJudul);
                System.out.println("Rating:\t" +tmp.dataRating);
                System.out.println("----------------------------------");
                tmp=tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong");
        }else if(size==1){
            removeLast();
            System.out.println("Data berhasil dihapus");
        }else{
            head=head.next;
            head.prev=null;
            size--;
            System.out.println("Data Pertama berhasil dihapus");
            //System.out.println("Data Id: " + head.dataId + "\nData Judul: " + head.dataJudul +"\nData Rating: "+ head.prev.dataRating + "\nberhasil dihapus");
        }
    }
    public void removeLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List masih kosong");
        }else if(head.next==null){
            head=null;
            size--;
            return;
        }
        NodeFilm current = head;
        while(current.next.next !=null){
            current=current.next;
        }
        current.next=null;
        size--;
        System.out.println("Data Terakhir berhasil dihapus");

    }
    public void remove(int index) throws Exception{
        index-=1;
        if(isEmpty() || index>=size){
            throw new Exception("Nilai indeks di luar batas");
        }else if(index==0){
            removeFirst();
        }else{
            NodeFilm current = head;
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
            size--;
            System.out.println("Data urutan ke-" +(index+1) + " berhasil dihapus");
        }
    }
    public int get(int index) throws Exception{
        /*if(isEmpty() || index >=size){
            throw new Exception("Nilai indeks di luar batas");
        }*/
        NodeFilm tmp = head;
        for(int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.dataId;
    }

    int getId(int p){
        NodeFilm index = head;
        int tmp = 0;
        for(int i=0; i<size; i++){
            if(p == index.dataId){
                tmp = tmp;
            } else{
                index = index.next;
                tmp++;
            }
        }
        /*index = head;
        for(int i=0;i<tmp;i++){
            index=index.next;
        }*/
        tmp++;
        System.out.println("Data id film: " + p + " berada di node ke-" + tmp);
        System.out.println("IDENTITAS: ");
        System.out.println("ID Film: " +index.dataId);
        System.out.println("Judul: " +index.dataJudul);
        System.out.println("Rating: " +index.dataRating);
        return tmp;
    }
    void bubbleSort(){
        int x;
        NodeFilm tmp;
        NodeFilm tmp1 = null;
        if(head==null){
            return;
        }
        do{
            x=0;
            tmp=head;
            while(tmp.next!=tmp1){
                if(tmp.dataRating<tmp.next.dataRating){
                    float y = tmp.dataRating;
                    tmp.dataRating=tmp.next.dataRating;
                    tmp.next.dataRating=y;
                    x=1;
                }
                tmp=tmp.next;
            }
            tmp1=tmp;
        }while (x!=0);
    }


}

public class TugasNo2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DLLFilm DLLFm = new DLLFilm();
        int id;
        String judul;
        float rating;
        for(;;){
            menuFilm();
            int pilih = sc.nextInt();
            if(pilih==1){
                System.out.println("Masukkan Data Film Posisi Awal");
                System.out.print("ID Film: ");
                id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.addFirst(id, judul,rating);
            }else if(pilih==2){
                System.out.println("Masukkan Data Film Posisi Akhir");
                System.out.print("ID Film: ");
                 id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.addLast(id, judul,rating);
            }else if(pilih==3){
                System.out.println("Masukkan index: ");
                int urutan = sc.nextInt();
                System.out.println("Masukkan Data Film index  " + urutan);
                System.out.print("ID Film: ");
                id = sc.nextInt();
                System.out.print("Judul Film: ");
                judul =sc.next();
                System.out.print("Rating Film: ");
                rating= sc.nextFloat();
                DLLFm.add(id, judul, rating, urutan);

            }else if(pilih==4){
                DLLFm.removeFirst();
            }else if(pilih==5){
                DLLFm.removeLast();
            }else if(pilih==6){
                System.out.println("Masukkan urutan yang akan dihapus");
                int urutan = sc.nextInt();
                DLLFm.remove(urutan);

            }else if(pilih==7){
                System.out.println("Cetak Data");
                System.out.println("----------------------------------");
                DLLFm.print();

            }else if(pilih==8){
                System.out.println("Masukkan ID Film: ");
                id = sc.nextInt();
                DLLFm.getId(id);

            }else if(pilih==9){
                DLLFm.bubbleSort();
                DLLFm.print();

            }else if(pilih==10){
                System.out.println("Terimakasih");
                break;
            }else{
                System.out.println("Inputan salah!");
            }

        }
    }
    public static void menuFilm(){
        System.out.println("==============================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("==============================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("==============================");
    }

}
