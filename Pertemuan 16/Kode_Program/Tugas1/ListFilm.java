package Tugas1;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListFilm{
    List<Film> film = new Stack<>();

    public void push(Film films){
        film.add(films);
    }

    public void pop(){
        for(Iterator<Film> it = film.iterator(); it.hasNext();){
            Film films = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+films.idFilm+", Judul Film="+films.judulFilm+", Tahun Tayang="+films.tahunTayang+", Director="+films.director+"}");
            }
        }
        film.remove(film.size()-1);
    }

    public void peek(){
        for(Iterator<Film> it = film.iterator(); it.hasNext();){
            Film films = it.next();
            if (!it.hasNext()) {
                System.out.println("Film{ID Film="+films.idFilm+", Judul Film="+films.judulFilm+", " + "Tahun Tayang="+films.tahunTayang+", Director="+films.director+"}");
            }
        }
    }

    public void tampil(){
        film.stream().forEach(f -> {
            System.out.println("" + f.toString());
        });
    }

    public static void main(String[] args) {
        ListFilm df = new ListFilm();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        String tambah;

        int i=0;
        while(i<1){
            System.out.println("============================");
            System.out.println("Daftar Film Layar Lebar");
            System.out.println("============================");
            System.out.println("1. Input Data Film");
            System.out.println("2. Hapus Data Film Teratas");
            System.out.println("3. Cek Data Film Teratas");
            System.out.println("4. Info Semua Data Film");
            System.out.println("5. Keluar");
            System.out.println("============================");
            System.out.print("Pilih : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih==1) {
                do{
                    System.out.print("ID Film : ");
                    String idFilm = input.nextLine();
                    System.out.print("Judul Film : ");
                    String judulFilm = input.nextLine();
                    System.out.print("Tahun Tayang : ");
                    String tahunTayang = input.nextLine();
                    System.out.print("Director : ");
                    String director = input.nextLine();
                    Film film = new Film(idFilm, judulFilm, tahunTayang, director);
                    df.push(film);
                    System.out.println("Ingin menambah data film lagi? (y/n)");
                    tambah = sc.next();
                }while (tambah.equalsIgnoreCase("y"));
            } else if (pilih==2) {
                df.pop();
            } else if (pilih==3) {
                df.peek();
            } else if (pilih==4) {
                df.tampil();
            } else {
                i++;
            }
        }
    }
}
