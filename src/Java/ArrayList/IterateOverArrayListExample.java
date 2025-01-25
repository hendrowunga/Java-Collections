package Java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
     * Java 8 forEach dan ekspresi lambda.
     * iterator().
     * iterator() dan Java 8 forEachRemaining() metode.
     * listIterator().
     * Loop for-each sederhana.
     * Loop for dengan index.
 */
public class IterateOverArrayListExample {

     public static void main(String[] args) {
          // Membuat objek ArrayList yang dapat menampung elemen bertipe String
          // Di sini, kita menggunakan List interface untuk menyimpan tipe data ArrayList
          List<String> tvShows = new ArrayList<>();

          // Menambahkan elemen-elemen ke dalam ArrayList
          // ArrayList akan secara otomatis menambah ukuran jika jumlah elemen bertambah
          tvShows.add("Breaking Bad"); // Menambahkan acara TV pertama
          tvShows.add("Game Of Thrones"); // Menambahkan acara TV kedua
          tvShows.add("Friends"); // Menambahkan acara TV ketiga
          tvShows.add("Prison break"); // Menambahkan acara TV keempat

          // Menampilkan informasi tentang iterasi dengan Java 8 forEach dan lambda expression
          System.out.println("=== Iterate using Java 8 forEach and lambda ===");
          // Menggunakan metode forEach yang merupakan fitur dari Java 8 untuk iterasi lebih efisien
          // Lambda expression digunakan di sini untuk mengurangi boilerplate code
          // Untuk setiap elemen dalam list 'tvShows', blok kode di dalam lambda akan dieksekusi
          tvShows.forEach(tvShow -> {  // Iterasi setiap elemen tvShows
               System.out.println(tvShow);  // Menampilkan nama acara TV satu per satu
          });

          System.out.println("\n=== Iterate using an iterator() ===");
          // Menunjukkan iterasi menggunakan Iterator, yang memberi kontrol manual atas iterasi
          // Iterator ini memungkinkan kita untuk melakukan iterasi satu per satu dan juga memungkinkan penghapusan elemen
          Iterator<String> tvShowIterator = tvShows.iterator(); // Mendapatkan iterator untuk tvShows
          while (tvShowIterator.hasNext()) {  // Mengecek apakah masih ada elemen yang tersisa
               String tvShow = tvShowIterator.next(); // Mengambil elemen berikutnya dari iterator
               System.out.println(tvShow);  // Menampilkan elemen yang diambil
          }

          System.out.println("\n=== Iterate using an iterator() and Java 8 forEachRemaining() method ===");
          // Menampilkan iterasi menggunakan iterator dengan memanfaatkan metode Java 8 forEachRemaining
          // forEachRemaining adalah metode baru yang memperbolehkan kita melakukan iterasi sisa elemen
          tvShowIterator = tvShows.iterator();  // Reset iterator untuk iterasi ulang
          tvShowIterator.forEachRemaining(tvShow -> {  // Iterasi setiap elemen yang tersisa di iterator
               System.out.println(tvShow);  // Menampilkan elemen satu per satu
          });

          System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
          // ListIterator memberikan kemampuan untuk menavigasi list baik maju (forward) maupun mundur (backward)
          // Kita mulai dengan posisi akhir dari list dan melakukan iterasi mundur untuk menampilkan elemen dari belakang ke depan
          ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size()); // Membuat ListIterator dari posisi akhir list
          while (tvShowListIterator.hasPrevious()) {  // Mengecek apakah ada elemen sebelumnya
               String tvShow = tvShowListIterator.previous();  // Mengambil elemen sebelumnya (mundur)
               System.out.println(tvShow);  // Menampilkan acara TV dalam urutan mundur
          }

          System.out.println("\n=== Iterate using simple for-each loop ===");
          // Iterasi menggunakan for-each loop yang lebih sederhana
          // Dalam hal ini, kita hanya perlu menyebutkan tipe data dan variabel yang digunakan dalam iterasi
          // Loop ini akan mengeksekusi blok kode untuk setiap elemen dalam tvShows
          for (String tvShow : tvShows) {  // Iterasi setiap elemen dalam tvShows menggunakan for-each
               System.out.println(tvShow);  // Menampilkan acara TV satu per satu
          }

          System.out.println("\n=== Iterate using for loop with index ===");
          // Menggunakan for loop klasik dengan indeks untuk iterasi
          // Di sini kita mengeksekusi perulangan berdasarkan indeks mulai dari 0 hingga ukuran list dikurangi satu
          // Kita mengambil elemen dengan menggunakan metode get() berdasarkan indeks yang ada
          for (int i = 0; i < tvShows.size(); i++) {  // Iterasi berdasarkan indeks
               System.out.println(tvShows.get(i));  // Mengambil dan menampilkan elemen berdasarkan indeks
          }
     }
}
