# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data buku menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa opsi memilih(1-4) , dan memberikan output berupa informasi detail dari opsi yang dipilih tersebut seperti judul, penulis, harga, dan genre.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `Novel`, dan `TokoBuku` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class Novel extends Buku {
    ...
}

public class TokoBuku {
    ...
}
```

2. **Object** adalah instance dari class. 
```bash
Buku buku = new Buku(judul, penulis, harga);
Novel novel = new Novel(judul, penulis, harga, genre);

```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `judul`, `penulis`, 'harga', dan 'genre' adalah contoh atribut.

```bash
String judul;
String penulis;
double harga;
String genre;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
public Buku(String judul, String penulis, double harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
}

public Novel(String judul, String penulis, double harga, String genre) {
        super(judul, penulis, harga); 
        this.genre = genre;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNpm` adalah contoh method mutator.

```bash
Mutator pada class Buku
public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

Mutator pada class Novel
    public void setGenre(String genre) {
        this.genre = genre;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getPenulis`, `getHarga`,dan `getGenre` adalah contoh method accessor.

```bash
Accessor pada class Buku
 public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public double getHarga() {
        return harga;
    }
Accessor pada class Novel
    public String getGenre() {
        return genre;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `judul`, `penulis`,'harga', dan ' genre' dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
Encapsulation pada class Buku
private String judul;
private String penulis;
private double harga;

Encapsulation pada class novel
private String genre;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Novel` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class Novel extends Buku{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
pada class Buku
@Override
public String toString() {
    return "Judul: " + judul + ", Penulis: " + penulis + ", Harga: " + harga;
}

pada class Novel
@Override
public String toString() {
    return super.toString() + ", Genre: " + genre;
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dan seleksi `switch` dalam method pemilihan opsi.

```bash

if (opsi == 1) {
    tambahBuku(scanner);
} else if (opsi == 2) {
    tambahNovel(scanner);
} else if (opsi == 3) {
    tampilkanSemuaBuku();
} else if (opsi == 4) {
    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
    scanner.close();
    return;
} else {
    System.out.println("Opsi tidak valid, coba lagi.");
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

if (daftarBuku.isEmpty()) {
    System.out.println("Tidak ada buku yang tersedia.");
} else {
    System.out.println("Daftar Buku:");
    for (Buku b : daftarBuku) {
        System.out.println(b);
    }
}



```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while (true)` untuk meminta input dan menampilkan data.

```bash
while (true) {
    System.out.println("\nMenu Toko Buku:");
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan judul buku: ");
String judul = scanner.nextLine();

```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
private static ArrayList<Buku> daftarBuku = new ArrayList<>();

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    opsi = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid, coba lagi.");
    continue;
}

try {
    harga = Double.parseDouble(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Harga tidak valid, coba lagi.");
    return;
}
try {
    pilihan = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input tidak valid, coba lagi.");
    return;
}

```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Salsa Alya Istiqamah
NPM: 2210010089
