package Java.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
     public static void main(String[] args) {
          // Membuat objek LinkedList untuk menyimpan nama-nama teman
          LinkedList<String> friends = new LinkedList<>();

          // Menambahkan elemen ke akhir LinkedList menggunakan metode add()
          friends.add("Rajeev"); // Menambahkan "Rajeev" sebagai elemen pertama
          friends.add("John");   // Menambahkan "John" sebagai elemen kedua
          friends.add("David");  // Menambahkan "David" sebagai elemen ketiga
          friends.add("Chris");  // Menambahkan "Chris" sebagai elemen keempat
          System.out.println("Initial LinkedList : " + friends); // Menampilkan LinkedList awal

          // Menambahkan elemen "Lisa" pada indeks ke-3 (posisi keempat)
          friends.add(3, "Lisa"); // Elemen lain setelah indeks 3 akan digeser ke kanan
          System.out.println("After add(3, \"Lisa\") : " + friends); // Menampilkan LinkedList setelah penambahan

          // Menambahkan elemen di awal LinkedList menggunakan addFirst()
          friends.addFirst("Steve"); // "Steve" menjadi elemen pertama, semua elemen lain digeser
          System.out.println("After addFirst(\"Steve\") : " + friends); // Menampilkan LinkedList setelah penambahan di awal

          // Menambahkan elemen di akhir LinkedList menggunakan addLast()
          friends.addLast("Jennifer"); // "Jennifer" ditambahkan sebagai elemen terakhir
          System.out.println("After addLast(\"Jennifer\") : " + friends); // Menampilkan LinkedList setelah penambahan di akhir

          // Membuat koleksi baru berupa ArrayList untuk menyimpan teman keluarga
          List<String> familyFriends = new ArrayList<>();
          familyFriends.add("Jesse"); // Menambahkan elemen "Jesse" ke ArrayList
          familyFriends.add("Walt");  // Menambahkan elemen "Walt" ke ArrayList

          // Menambahkan semua elemen dari ArrayList ke LinkedList menggunakan addAll()
          friends.addAll(familyFriends); // Semua elemen ArrayList ditambahkan ke akhir LinkedList
          System.out.println("After addAll(familyFriends) : " + friends); // Menampilkan LinkedList setelah penggabungan
     }
}
