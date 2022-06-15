package GraphLinkedList;

import java.util.Scanner;
public class GraphLinkedListMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Percobaan 1
        /*Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,0);
        graph.printGraph();
        graph.degree(2);

        graph.removeEdge(1,3);
        graph.printGraph();*/


        //Tugas No 1
        /*int jumGraph, s, d;
        System.out.println("Masukkan jumlah vertex: ");
        jumGraph = sc.nextInt();

        Graph graph = new Graph(jumGraph);
        System.out.println("Masukkan edges: <source> <destination>");
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);
        int i=0;
        while (i<jumGraph){
            s = sc.nextInt();
            d = sc.nextInt();

            graph.addEdge(s,d);
            i++;
        }
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1,2);
        graph.printGraph();*/

        // Tugas No2
        /*int pilihGraph;
        boolean pilih;
        int jumGraph, s, d;
        System.out.println("Pilih jenis graph");
        System.out.println("1. Directed");
        System.out.println("2. Undirected");
        System.out.print("Pilih 1-2: ");
        pilihGraph= sc.nextInt();

        if(pilihGraph==1){
            System.out.println("DIRECTED GRAPH");
            pilih=true;
        }else if(pilihGraph==2){
            System.out.println("UNDIRECTED GRAPH");
            pilih=false;
        }else{
            System.out.println("Inputan Salah!");
            pilih=false;
        }

        System.out.println("Masukkan jumlah vertex: ");
        jumGraph = sc.nextInt();
        Graph graph = new Graph(jumGraph, pilih);
        System.out.println("Masukkan edges: <source> <destination>");
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);
        int i=0;
        while (i<jumGraph){
            s = sc.nextInt();
            d = sc.nextInt();

            graph.addEdge(s,d);
            i++;
        }
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1,2);
        graph.printGraph();*/


        //Tugas No 4
        /*Graph graph = new Graph(6);
        graph.addEdge(0, 1, "Surabaya", "Malang");
        graph.addEdge(0,4,"Surabaya", "Sidoarjo");
        graph.addEdge(1,2, "Malang", "Gresik");
        graph.addEdge(1,3,"Malang", "Blitar");
        graph.addEdge(1,4, "Malang", "Sidoarjo");
        graph.addEdge(2,3,"Gresik", "Blitar");
        graph.addEdge(3,4,"Blitar", "Sidoarjo");
        graph.addEdge(3,0, "Blitar", "Surabaya");

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1,"Gresik");
        graph.printGraph();*/

        //Tugas No3
        int jumGraph, s, d;
        System.out.println("Masukkan jumlah vertex: ");
        jumGraph = sc.nextInt();

        Graph graph = new Graph(jumGraph);
        System.out.println("Masukkan edges: <source> <destination>");
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);
        int i=0;
        while (i<jumGraph){
            s = sc.nextInt();
            d = sc.nextInt();

            graph.addEdge(s,d);
            i++;
        }
        s = sc.nextInt();
        d = sc.nextInt();
        graph.addEdge(s,d);

        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1,3);
        graph.printGraph();


    }

}
