class Node{
    int data;
    Node left;
    Node right;

    public Node(){

    }
    public Node(int data){//default root
        this.left=null;
        this.data=data;
        this.right=null;
    }
}
class BinaryTree{
    Node root;

    public BinaryTree(){
        root=null; //cz pertama dibuat pasti kosong
    }
    boolean isEmpty(){

        return root==null;
    }
    /*boolean isLeaf(){
        Node current=root;
        int total=0;
        while(true){
            if(current.left==null || current.right==null){
                total++;
            }else{
                current=current.left;
            }
        }
    }*/

    void add(int data){
        if(isEmpty()){
            root= new Node(data); //new root
        }else{
            Node current = root;
            while (true){
                if(data< current.data){
                    if(current.left!=null){
                        current=current.left;
                    }else{
                        current.left=new Node(data);//node baru sbg leftchild root
                        break;
                    }
                }else if(data> current.data){
                    if(current.right!=null){
                        current=current.right;
                    }else{
                        current.right=new Node(data);
                        break;
                    }
                }else {
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil=false;
        Node current = root;
        while (current!=null){
            if(current.data==data){
                hasil = true;
                break;
            }else if(data< current.data){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node){ //menelusuri, node=mengacu dari mana, acuan nood root
        if(node !=null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);//rekursif
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node){
        if(node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node!=null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){ //hapus node yg punya 2 child, know siapa yang jadi succesor dr noede
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left!=null){
            successorParent=successor;//parent baru
            successor=successor.left;
        }
        if(successor!=del.right){
            successorParent.left=successor.right;
            successor.right=del.right; //bagian node pengganti node yang dihapus
        }
        return successor;
    }

    void delete (int data){
        if(isEmpty()){
            System.out.println("Tree is Empty!");
            return;
        }

        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        //mindahin parent dan current sesuai data
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent=current;
                current=current.left;
                isLeftChild=true;
            }else if(data>current.data){
                parent=current;
                current=current.right;
                isLeftChild=false;
            }
        }
        //hapus data
        if(current==null){
            System.out.println("couldn't find data!");
            return;
        }else{
            if(current.left==null && current.right==null){//data yang dihapus = data leaf
                if(current==root){
                    root=null;
                }else{
                    if(isLeftChild){
                        parent.left=null;
                    }else{
                        parent.right=null;
                    }
                }
            }else if(current.left==null){
                if(current==root){
                    root=current.right;
                }else{
                    if(isLeftChild){
                        parent.left=current.right;
                    }else {
                        parent.right=current.right;
                    }
                }
            }else if(current.right==null){
                if(current==root){
                    root=current.left;
                }else {
                    if(isLeftChild){
                        parent.left=current.left;
                    }else{
                        parent.right=current.left;
                    }
                }
            }else{
                Node successor = getSuccessor(current);
                if(current==root){
                    root=successor;
                }else{
                    if(isLeftChild){
                        parent.left=successor;
                    }else{
                        if(isLeftChild){
                            root=successor;
                        }else{
                            if(isLeftChild){
                                parent.left=successor;
                            }else{
                                parent.right=successor;
                            }
                            successor.left=current.left;// ganti sama yg dihapus, ganti sc diaatas
                        }
                    }
                }
            }
        }
    }
    void addRekursif(int key) {

        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    int Min() {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;

    }

    int Max(){
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }


    void printLeaves(Node node) {
        if (node == null) {
            return ;
        }
        if (node.left ==null && node.right==null){
            System.out.print(" " + node.data);
        }
        printLeaves(node.left);
        printLeaves(node.right);

    }
    int countLeaves(Node node){
        if (node == null) {
            return 0;
        }
        if(node.left ==null && node.right==null){
            return 1;
        }
        int count =0;
        count+=countLeaves(node.left);
        count+=countLeaves(node.right);
        return count;
    }

}

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        //Percobaan 1
        /*bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        System.out.println("PREORDER");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("INORDER");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("POSTORDER");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");*/

        //Tugas No 1
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.addRekursif(20);
        bt.addRekursif(25);
        bt.addRekursif(14);

        System.out.println("PREORDER");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.println("INORDER");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.println("POSTORDER");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        //Tugas 2
        System.out.println("Nilai paling kecil: "+ bt.Min());
        System.out.println("Nilai paling besar: "+ bt.Max());

        //Tugas 3
        System.out.print("LEAF: ");
        bt.printLeaves(bt.root);

        //Tugas4
        System.out.println();
        System.out.print("TOTAL LEAF: " +bt.countLeaves(bt.root));







    }
}
