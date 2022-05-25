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
