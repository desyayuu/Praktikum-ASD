package GraphArray;

public class graphArray {
    private final int vertices;
    private final int [][] twoD_array;

    graphArray(int v) {
        vertices=v;
        twoD_array=new int[vertices+1][vertices+1];
        //vertices + 1 cz array index 0, array -1, supaya sama dg nilai vertieces
    }
    void makeEdge(int to, int from, int edge){
        try{
            twoD_array[to][from]=edge;
            //to : vertikal, from: horizontal
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
    }
    int getEdge(int to, int  from){//cek nilai dari vertek satu ke vertek satunya lagi itu berapa
        try{
            return twoD_array[to][from];
        }catch (ArrayIndexOutOfBoundsException index){
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }
}
