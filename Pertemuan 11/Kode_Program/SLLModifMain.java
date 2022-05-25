class Node2{
    int data;
    Node2 next;
    int prev;


    public Node2(int nilai, Node2 berikutnya){
        this.data=nilai;
        this.next=berikutnya;

    }
    public Node2(int nilai, int sebelumnya){
        this.data=nilai;
        this.prev=sebelumnya;
    }

}
class SingleLinkedList2 {
    Node2 head;
    Node2 tail;
    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
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
    public void addFirst(int input){
        Node2 ndInput = new Node2(input, null);
        if(isEmpty()){
            head=ndInput;
            tail=ndInput;
        }else{
            ndInput.next=head;
            head=ndInput;
        }
    }

    public void addLast(int input) {
        Node2 ndInput = new Node2(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        Node2 ndInput = new Node2(input, null);
        Node2 temp = head;
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
    public void insertAt(int index, int input){
        if(index<0){
            System.out.println("indeks salah");
        }else if(index==0) {
            addFirst(input);
        }else{
            Node2 temp =head;
            for(int i=0; i<index-1; i++){
                temp=temp.next;
            }
            temp.next=new Node2(input, temp.next);
            if(temp.next.next==null) tail=temp.next;
        }
    }
    public int getData(int index){
        Node2 tmp=head;
        for(int i =0; i< index; i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        Node2 tmp=head;
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
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head==tail){
            head=tail=null;
        }else{
            head=head.next;
        }
    }
    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        }else if(head==tail){
            head=tail= null;
        }else{
            Node2 temp = head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List masih kososng, tidak dapat dihapus!");
        }else{
            Node2 temp=head;
            while (temp!=null){
                if((temp.data==key) && (temp==head)){
                    this.removeFirst();
                    break;
                }else if(temp.next.data==key){
                    temp.next=temp.next.next;
                    if(temp.next==null){
                        tail=temp;
                    }
                    break;
                }
                temp=temp.next;
            }
        }
    }
    public void removeAt(int index){
        if(index==0){
            removeFirst();
        }else{
            Node2 temp=head;
            for(int i=0; i<index-1; i++){
                temp =temp.next;
            }
            temp.next=temp.next.next;
            if(temp.next==null){
                tail=temp;
            }
        }

    }
    public void insertBefore(int key, int input){
        Node2 newNode = new Node2(input, key-1);
        Node2 previous = head;
        int count =1;
        while(count<key-1){
            previous = previous.next;
            count++;
        }
        Node2 current = previous.next;
        newNode.next=current;
        previous.next=newNode;

    }
}

public class SLLModifMain {
    public static void main(String[] args) {
        SingleLinkedList2 singLLM = new SingleLinkedList2();

        singLLM.print();
        singLLM.addFirst(890);
        singLLM.print();
        singLLM.addLast(760);
        singLLM.print();
        singLLM.addFirst(700);
        singLLM.print();
        singLLM.insertAfter(700, 999);
        singLLM.print();
        singLLM.insertAt(3, 833);
        singLLM.print();

        //Modifikasi Linked List
        System.out.println("Data pada indeks ke-1= " +singLLM.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLLM.indexOf(760));

        singLLM.remove(999);
        singLLM.print();
        singLLM.removeAt(0);
        singLLM.print();
        singLLM.removeFirst();
        singLLM.print();
        singLLM.removeLast();
        singLLM.print();

        //Tugas1
        /*System.out.println("\nModifikasi InsertBefore");
        singLLM.addFirst(123);
        singLLM.print();
        singLLM.addLast(126);
        singLLM.print();
        singLLM.insertAfter(0, 124);
        singLLM.print();
        singLLM.insertBefore(2,125);
        singLLM.print();*/




    }
}

