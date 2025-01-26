package Java.ArrayList;

// Program untuk mengurutkan elemen ArrayList menggunakan metode sort()

import java.util.ArrayList;
import java.util.Comparator; // Import Comparator untuk membandingkan elemen
import java.util.List;

public class ArrayListSortExample {
     public static void main(String[] args) {
          // Membuat ArrayList untuk menyimpan elemen bertipe String
          List<String> names = new ArrayList<>();

          // Menambahkan elemen ke dalam ArrayList
          names.add("John"); // Menambahkan elemen "John"
          names.add("Alice"); // Menambahkan elemen "Alice"
          names.add("Bob"); // Menambahkan elemen "Bob"
          names.add("Eve"); // Menambahkan elemen "Eve"

          // Menampilkan daftar nama sebelum diurutkan
          System.out.println("Names : " + names); // Cetak elemen dalam urutan awal

          // Mengurutkan elemen menggunakan metode sort() dengan Comparator anonimus
          names.sort(new Comparator<String>() {
               @Override
               public int compare(String name1, String name2) {
                    return name1.compareTo(name2); // Bandingkan dua elemen secara alfabetis
               }
          });

          // Mengurutkan elemen menggunakan lambda expression (versi ringkas dari Comparator)
          names.sort((name1, name2) -> name1.compareTo(name2)); // Sama seperti Comparator di atas, tetapi ditulis lebih singkat

          // Mengurutkan elemen menggunakan Comparator bawaan Java (natural order)
          names.sort(Comparator.naturalOrder()); // Metode bawaan untuk mengurutkan elemen dalam urutan alami (alfabetis)

          // Menampilkan daftar nama setelah diurutkan
          System.out.println("Sorted Names : " + names); // Cetak elemen yang telah diurutkan
     }
}
