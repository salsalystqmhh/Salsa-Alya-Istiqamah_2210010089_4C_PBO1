
package uas;

public class Buku {
    private String judul;
    private String penulis;
    private double harga;

    // Constructor
    public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Accessor (getter)
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public double getHarga() {
        return harga;
    }

    // Mutator (setter)
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Harga: " + harga;
    }
}

