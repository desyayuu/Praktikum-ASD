
class BinaryTreeArray{
    int[]data;
    int idxLast;

    public BinaryTreeArray(){

        data= new int [10];
    }
    void populateData(int data[], int idxLast){
        this.data=data;
        this.idxLast=idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }
    void add(int key){
        idxLast++;
        data[idxLast]=key;
    }
    void traversePreOrder(int idxStart){
        if(idxStart<=idxLast){
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
        }

    }
    void traversePostOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            traverseInOrder(2*idxStart+2);
            System.out.print(data[idxStart] + " ");
        }

    }
}

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data ={6,4,8,3,5,7,9,0,0,0};
        int idxLast=6;
        bta.populateData(data, idxLast);
        System.out.println("INORDER");
        bta.traverseInOrder(0);
        System.out.println("");

        //Tugas No5
        System.out.println("Tugas No 5");
        bta.add(10);
        bta.add(15);
        bta.add(11);
        System.out.println("INORDER");
        bta.traverseInOrder(0);
        System.out.println("");

        System.out.println("PREORDER");
        bta.traversePreOrder(0);
        System.out.println("");

        System.out.println("POSTORDER");
        bta.traversePostOrder(0);
    }
}
