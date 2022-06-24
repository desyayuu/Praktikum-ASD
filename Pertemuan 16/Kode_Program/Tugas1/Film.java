package Tugas1;

public class Film {
    String idFilm, judulFilm, tahunTayang, director;

    Film(String idFilm, String judulFilm, String tahunTayang, String director){
        this.idFilm=idFilm;
        this.judulFilm=judulFilm;
        this.tahunTayang=tahunTayang;
        this.director=director;
    }

    @Override
    public String toString(){
        return "Film{" + "ID Film=" + idFilm + ", Judul Film=" +judulFilm+", Tahun Tayang="+tahunTayang+", Director=" +director+'}';
    }

}
