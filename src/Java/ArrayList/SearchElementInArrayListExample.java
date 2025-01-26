package Java.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayListExample {
     public static void main(String[] args) {
          // Membuat ArrayList baru untuk menyimpan elemen berupa nama
          List<String> names = new ArrayList<>();

          // Menambahkan elemen nama ke dalam ArrayList
          names.add("John"); // Menambahkan elemen "John" di indeks 0
          names.add("Alice"); // Menambahkan elemen "Alice" di indeks 1
          names.add("Bob"); // Menambahkan elemen "Bob" di indeks 2
          names.add("Eve"); // Menambahkan elemen "Eve" di indeks 3
          names.add("Charlie"); // Menambahkan elemen "Charlie" di indeks 4
          names.add("Frank"); // Menambahkan elemen "Frank" di indeks 5
          names.add("Grace"); // Menambahkan elemen "Grace" di indeks 6
          names.add("Hank"); // Menambahkan elemen "Hank" di indeks 7
          names.add("Ivy"); // Menambahkan elemen "Ivy" di indeks 8

          // Memeriksa apakah elemen "Bob" ada dalam ArrayList menggunakan metode contains()
          System.out.println("Does names Array contain \"Bob\"?: " + names.contains("Bob"));
          // contains() mengembalikan nilai true jika elemen ditemukan, sebaliknya false jika tidak ditemukan

          // Mencari indeks pertama kemunculan elemen "Eve" menggunakan indexOf()
          System.out.println("indexOf \"Eve\" : " + names.indexOf("Eve"));
          // Jika elemen ditemukan, indexOf() mengembalikan indeks pertama elemen. Jika tidak ditemukan, akan mengembalikan -1.

          // Mencari indeks pertama kemunculan elemen "Hendro" yang tidak ada di ArrayList
          System.out.println("indexOf \"Hendro\" : " + names.indexOf("Hendro"));
          // Karena "Hendro" tidak ada, indexOf() akan mengembalikan -1

          // Mencari indeks terakhir kemunculan elemen "Hank" menggunakan lastIndexOf()
          System.out.println("lastIndexOf \"Hank\" : " + names.lastIndexOf("Hank"));
          // lastIndexOf() berguna jika elemen ditemukan di beberapa tempat, akan memberikan indeks terakhir

          // Mencari indeks terakhir kemunculan elemen "Ivy"
          System.out.println("lastIndexOf \"Figo\" : " + names.lastIndexOf("Figo"));
          // Karena "Ivy" hanya muncul satu kali, indeks yang dikembalikan sama seperti indexOf()
     }
}
