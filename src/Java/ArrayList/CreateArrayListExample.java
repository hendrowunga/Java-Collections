package Java.ArrayList;

// Cara membuat ArrayList menggunakan konstruktor ArrayList().
// Tambahkan elemen baru ke ArrayList menggunakan metode add().

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {

     public static void main(String[] args) {
          // Membuat ArrayList untuk menyimpan elemen-elemen bertipe String
          List<String> animals = new ArrayList<>();

          // Menambahkan elemen baru ke dalam ArrayList menggunakan method add()
          animals.add("Lion");      // Menambahkan elemen pertama: "Lion"
          animals.add("Tiger");     // Menambahkan elemen kedua: "Tiger"
          animals.add("Elephant");  // Menambahkan elemen ketiga: "Elephant"
          animals.add("Giraffe");   // Menambahkan elemen keempat: "Giraffe"
          animals.add("Zebra");     // Menambahkan elemen kelima: "Zebra"

          // Menampilkan isi ArrayList setelah semua elemen ditambahkan
          System.out.println(animals);
          // Output: [Lion, Tiger, Elephant, Giraffe, Zebra]

          // Menambahkan elemen baru "Cat" pada indeks ke-2
          // Indeks ke-2 sebelumnya berisi "Elephant", dan semua elemen setelahnya akan digeser
          animals.add(2, "Cat");

          // Menampilkan isi ArrayList setelah menambahkan "Cat"
          System.out.println(animals);
          // Output: [Lion, Tiger, Cat, Elephant, Giraffe, Zebra]
     }
}
