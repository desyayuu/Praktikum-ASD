package Tugas3;

public class GraphMain{
    public static void main(String[] args) throws Exception {
            //Tugas No 4
            Graph graph = new Graph(6);

            //0 = Madura
            //1 = Surabaya
            //2 = Gresik
            //3 = Sidoarjo
            //4 = Malang


            graph.addEdge(0, 1, "Madura", "Surabaya");
            graph.addEdge(0, 4, "Madura", "Malang");
            graph.addEdge(1, 2, "Surabaya", "Gresik");
            graph.addEdge(1, 3, "Surabaya", "Sidoarjo");
            graph.addEdge(1, 4, "Surabya", "Malang");
            graph.addEdge(2, 3, "Gresik", "Sidoarjo");
            graph.addEdge(3, 4, "Sidoarjo", "Malang");
            graph.addEdge(3, 0, "Sidoarjo", "Madura");

            graph.printGraph();
            graph.degree(2);
            graph.removeEdge(1, "Sidoarjo");
            graph.printGraph();
        }
    }

