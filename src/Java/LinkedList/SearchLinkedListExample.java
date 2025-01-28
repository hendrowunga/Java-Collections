package Java.LinkedList;

/*
Cara memeriksa apakah elemen ada di LinkedList.
Cara menemukan indeks kemunculan pertama elemen di LinkedList.
Cara menemukan indeks kemunculan terakhir elemen di LinkedList.
 */

import java.util.LinkedList;

public class SearchLinkedListExample {
     public static void main(String[] args) {
          // Membuat LinkedList baru untuk menyimpan nama-nama karyawan
          LinkedList<String> employees = new LinkedList<>();

          // Menambahkan elemen ke LinkedList menggunakan metode add()
          employees.add("Jhon"); // Menambahkan "Jhon" ke LinkedList
          employees.add("Rajeev"); // Menambahkan "Rajeev" ke LinkedList
          employees.add("Deepak"); // Menambahkan "Deepak" ke LinkedList
          employees.add("Raj"); // Menambahkan "Raj" ke LinkedList
          employees.add("Rajeev"); // Menambahkan "Rajeev" sekali lagi (duplikasi elemen diperbolehkan dalam LinkedList)

          // Mengecek apakah LinkedList berisi elemen "Lara"
          System.out.println("Does Employees LinkedList contain \"Lara\"? "
                  + employees.contains("Lara")); // contains() mengembalikan true jika elemen ada, false jika tidak

          // Mencari indeks pertama dari elemen "Steve" di LinkedList
          System.out.println("indexOf \"Steve\" : "
                  + employees.indexOf("Steve")); // indexOf() mengembalikan -1 jika elemen tidak ditemukan

          // Mencari indeks pertama dari elemen "Mark" di LinkedList
          System.out.println("indexOf \"Mark\" : "
                  + employees.indexOf("Mark")); // Sama seperti "Steve", -1 menunjukkan elemen tidak ada

          // Mencari indeks terakhir dari elemen "Deepak" di LinkedList
          System.out.println("lastIndexOf \"Deepak\" : "
                  + employees.lastIndexOf("Deepak")); // lastIndexOf() mengembalikan indeks terakhir dari elemen jika ditemukan

          // Mencari indeks terakhir dari elemen "Raj" di LinkedList
          System.out.println("lastIndexOf \"Raj\" : "
                  + employees.lastIndexOf("Raj")); // lastIndexOf() penting untuk elemen duplikat atau untuk traversal spesifik
     }
}

