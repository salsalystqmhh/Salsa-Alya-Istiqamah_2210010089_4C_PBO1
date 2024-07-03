
package uas;

public class Novel extends Buku {
     private String genre;

    // Constructor
    public Novel(String judul, String penulis, double harga, String genre) {
        super(judul, penulis, harga);
        this.genre = genre;
    }

    // Accessor (getter)
    public String getGenre() {
        return genre;
    }

    // Mutator (setter)
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genre: " + genre;
    }
}

