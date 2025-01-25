package Java.ArrayList;
/*
1. Cara menghapus elemen pada indeks tertentu di ArrayList | hapus(indeks int)
2. Cara menghapus elemen dari ArrayList | hapus(Objek o)
3. Cara menghapus semua elemen dari ArrayList yang ada dalam koleksi tertentu | hapus Semua ()
4. Cara menghapus semua elemen yang cocok dengan predikat tertentu | hapus Jika ()
5. Cara menghapus ArrayList | jelas()
*/


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveElementsFromArrayListExample {

     public static void main(String[] args) {
          // Membuat sebuah ArrayList untuk menyimpan bahasa pemrograman
          List<String> programmingLanguages = new ArrayList<>();
          programmingLanguages.add("C"); // Menambahkan elemen "C"
          programmingLanguages.add("C++"); // Menambahkan elemen "C++"
          programmingLanguages.add("Java"); // Menambahkan elemen "Java"
          programmingLanguages.add("Kotlin"); // Menambahkan elemen "Kotlin"
          programmingLanguages.add("Python"); // Menambahkan elemen "Python"
          programmingLanguages.add("Perl"); // Menambahkan elemen "Perl"
          programmingLanguages.add("Ruby"); // Menambahkan elemen "Ruby"

          // Menampilkan daftar awal
          System.out.println("Initial List : " + programmingLanguages);

          // Menghapus elemen pada indeks ke-5 ("Perl")
          programmingLanguages.remove(5);
          System.out.println("After remove(5): " + programmingLanguages);

          // Menghapus elemen "Kotlin" dari daftar
          // Metode remove() akan mengembalikan `false` jika elemen tidak ditemukan
          boolean isRemoved = programmingLanguages.remove("Kotlin");
          System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

          // Menghapus semua elemen yang ada di koleksi scriptingLanguages dari daftar utama
          List<String> scriptingLanguages = new ArrayList<>();
          scriptingLanguages.add("Perl"); // Menambahkan elemen "Perl"
          scriptingLanguages.add("Ruby"); // Menambahkan elemen "Ruby"
          scriptingLanguages.add("Python"); // Menambahkan elemen "Python"

          programmingLanguages.removeAll(scriptingLanguages);
          System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

          // Menghapus semua elemen yang memenuhi kondisi tertentu (dengan Predicate)
          // Di sini, elemen yang dimulai dengan huruf "C" akan dihapus
          programmingLanguages.removeIf(new Predicate<String>() {
               @Override
               public boolean test(String s) {
                    return s.startsWith("C");
               }
          });

          /*
              Contoh di atas juga bisa ditulis menggunakan ekspresi lambda seperti ini:
              programmingLanguages.removeIf(s -> s.startsWith("C"))
          */

          System.out.println("After Removing all elements that start with \"C\": " + programmingLanguages);

          // Menghapus semua elemen dari daftar
          programmingLanguages.clear();
          System.out.println("After clear(): " + programmingLanguages);
     }
}
