package Java.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {

     public static void main(String[] args) {
          // Membuat objek ArrayList dengan tipe data Integer
          List<Integer> numbers = new ArrayList<>();

          // Menambahkan elemen-elemen ke dalam ArrayList
          numbers.add(1); // Elemen pertama adalah angka 1
          numbers.add(2); // Elemen kedua adalah angka 2
          numbers.add(3); // Elemen ketiga adalah angka 3
          numbers.add(4); // Elemen keempat adalah angka 4
          numbers.add(5); // Elemen kelima adalah angka 5

          // Mendapatkan iterator untuk ArrayList
          Iterator<Integer> numbersIterator = numbers.iterator();

          // Menggunakan iterator untuk melakukan iterasi dan memodifikasi ArrayList
          while (numbersIterator.hasNext()) { // Mengecek apakah masih ada elemen berikutnya
               Integer num = numbersIterator.next(); // Mengambil elemen berikutnya dalam ArrayList
               if (num % 2 != 0) { // Mengecek apakah elemen tersebut adalah bilangan ganjil
                    numbersIterator.remove(); // Menghapus elemen jika bilangan tersebut ganjil
               }
          }

          // Menampilkan ArrayList setelah elemen ganjil dihapus
          System.out.println(numbers); // Outputnya adalah [2, 4] karena elemen ganjil sudah dihapus
     }
}
