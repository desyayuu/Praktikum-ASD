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
