package ContohList;

import java.util.ArrayList; // cz gak pake queue
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // Kasus tidak menspesifikkan tipe data
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        // get(0): ambil elemen data pertama
        // l.size()-1 : karena eemen gak ditemu, maka elemen terakhir ditenukan dari size-1;
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size()-1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(),l.get(l.size()-1));

        //Modifikasi Pertanyaan 2
        /*List <Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size()-1));*/

        LinkedList<String> names = new LinkedList<>();
        names.push("Mei-Mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.getFirst(),
                names.size(), names.getLast());
        System.out.println("Names: " + names.toString());

        //Kasus dengan mengspesifikkan tipe data
        /*List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0),
                names.size(), names.get(names.size()-1));

        //set, spesifik mau diset di idx berapa(digeser)
        names.set(0, "My Kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size()-1));
        System.out.printf("Names: " +names.toString());*/
    }

}
