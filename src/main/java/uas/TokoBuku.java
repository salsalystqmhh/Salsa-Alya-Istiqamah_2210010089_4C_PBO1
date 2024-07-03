
package uas;
// src/TokoBuku.java
import java.util.Scanner;
import java.util.ArrayList;

public class TokoBuku {
    private static final ArrayList<Buku> daftarBuku = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tambahkan beberapa buku default
        initData();

        while (true) {
            System.out.println("\nMenu Toko Buku:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Novel");
            System.out.println("3. Tampilkan Semua Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            int opsi;

            try {
                opsi = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, coba lagi.");
                continue;
            }

            switch (opsi) {
                case 1:
                    tambahBuku(scanner);
                    break;
                case 2:
                    tambahNovel(scanner);
                    break;
                case 3:
                    tampilkanSemuaBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        }
    }

    private static void initData() {
        // Buku-buku default
        daftarBuku.add(new Buku("Pemrograman Java", "Budi Raharjo", 150000));
        daftarBuku.add(new Buku("Pemrograman Python", "Fajar Setiawan", 120000));
        daftarBuku.add(new Novel("Harry Potter dan Batu Bertuah", "J.K. Rowling", 180000, "Fantasi"));
        daftarBuku.add(new Novel("Lord of the Rings", "J.R.R. Tolkien", 200000, "Fantasi"));
        daftarBuku.add(new Novel("Laskar Pelangi", "Andrea Hirata", 95000, "Drama"));
    }

    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String penulis = scanner.nextLine();
        double harga;

        try {
            System.out.print("Masukkan harga buku: ");
            harga = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid, coba lagi.");
            return;
        }

        Buku buku = new Buku(judul, penulis, harga);
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void tambahNovel(Scanner scanner) {
        System.out.print("Masukkan judul novel: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis novel: ");
        String penulis = scanner.nextLine();
        double harga;

        try {
            System.out.print("Masukkan harga novel: ");
            harga = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid, coba lagi.");
            return;
        }

        System.out.print("Masukkan genre novel: ");
        String genre = scanner.nextLine();
        Novel novel = new Novel(judul, penulis, harga, genre);
        daftarBuku.add(novel);
        System.out.println("Novel berhasil ditambahkan.");
    }

    private static void tampilkanSemuaBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku yang tersedia.");
        } else {
            System.out.println("Daftar Buku:");
            for (Buku b : daftarBuku) {
                System.out.println(b);
            }
        }
    }
}
