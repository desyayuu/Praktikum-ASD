class NodeT1{
    int data;
    NodeT1 next;
    int prev;


    public NodeT1(int nilai, NodeT1 berikutnya){
        this.data=nilai;
        this.next=berikutnya;

    }
    public NodeT1(int nilai, int sebelumnya){
        this.data=nilai;
        this.prev=sebelumnya;
    }

}
class SingleLinkedListT1{
    NodeT1 head;
    NodeT1 tail;
    public boolean isEmpty() {

        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            NodeT1 tmp = head;
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
        NodeT1 ndInput = new NodeT1(input, null);
        if(isEmpty()){
            head=ndInput;
            tail=ndInput;
        }else{
            ndInput.next=head;
            head=ndInput;
        }
    }

    public void addLast(int input) {
        NodeT1 ndInput = new NodeT1(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input) {
        NodeT1 ndInput = new NodeT1(input, null);
        NodeT1 temp = head;
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
            NodeT1 temp =head;
            for(int i=0; i<index-1; i++){
                temp=temp.next;
            }
            temp.next=new NodeT1(input, temp.next);
            if(temp.next.next==null) tail=temp.next;
        }
    }
    public int getData(int index){
        NodeT1 tmp=head;
        for(int i =0; i< index; i++){
            tmp=tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        NodeT1 tmp=head;
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
            NodeT1 temp = head;
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
            NodeT1 temp=head;
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
            NodeT1 temp=head;
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
        int index = indexOf(key);
        insertAt(index,input);
    }

}

public class TugasNo1{
    public static void main(String[] args) {
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


    }
}

