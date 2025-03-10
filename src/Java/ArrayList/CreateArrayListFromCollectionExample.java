package Java.ArrayList;

// Cara membuat ArrayList dari koleksi lain menggunakan konstruktor ArrayList(Collection c).
// Cara menambahkan semua elemen dari koleksi yang ada ke ArrayList baru menggunakan metode addAll().

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
     public static void main(String[] args) {
          // Membuat ArrayList untuk lima bilangan prima pertama
          List<Integer> firstFivePrimeNumbers = new ArrayList<>();
          firstFivePrimeNumbers.add(2); // Menambahkan angka 2
          firstFivePrimeNumbers.add(3); // Menambahkan angka 3
          firstFivePrimeNumbers.add(5); // Menambahkan angka 5
          firstFivePrimeNumbers.add(7); // Menambahkan angka 7
          firstFivePrimeNumbers.add(11); // Menambahkan angka 11

          // Membuat ArrayList baru dari koleksi ArrayList sebelumnya
          List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

          // Membuat ArrayList untuk lima bilangan prima berikutnya
          List<Integer> nextFivePrimeNumbers = new ArrayList<>();
          nextFivePrimeNumbers.add(13); // Menambahkan angka 13
          nextFivePrimeNumbers.add(17); // Menambahkan angka 17
          nextFivePrimeNumbers.add(19); // Menambahkan angka 19
          nextFivePrimeNumbers.add(23); // Menambahkan angka 23
          nextFivePrimeNumbers.add(29); // Menambahkan angka 29

          // Menambahkan semua elemen dari nextFivePrimeNumbers ke firstTenPrimeNumbers
          firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
          System.out.println(firstTenPrimeNumbers); // Menampilkan seluruh bilangan prima
     }
}
