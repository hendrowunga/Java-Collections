package Java.ArrayList;

// Urutkan ArrayList menggunakan metode Collections.sort()


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSortExample {
     public static void main(String[] args) {
          // Membuat sebuah ArrayList yang menggunakan tipe data Integer untuk menyimpan bilangan bulat
          List<Integer> numbers = new ArrayList<>();

          // Menambahkan elemen-elemen ke dalam ArrayList menggunakan metode add()
          numbers.add(5); // Menambahkan angka 5 ke daftar
          numbers.add(2); // Menambahkan angka 2 ke daftar
          numbers.add(8); // Menambahkan angka 8 ke daftar
          numbers.add(1); // Menambahkan angka 1 ke daftar

          // Menampilkan daftar sebelum dilakukan pengurutan
          System.out.println("Before: " + numbers); // Output: [5, 2, 8, 1]

          // Mengurutkan elemen dalam ArrayList dalam urutan menaik (ascending order)
          // Metode Collections.sort() bekerja dengan algoritma pengurutan efisien
          Collections.sort(numbers); // Mengatur ulang elemen dalam daftar sesuai urutan menaik

          // Menampilkan daftar setelah pengurutan dilakukan
          System.out.println("After: " + numbers); // Output: [1, 2, 5, 8]
     }
}
