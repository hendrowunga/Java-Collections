package Java.ArrayList.ArrrayListObjectSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSortExample {
     public static void main(String[] args) {
          // Membuat list dari objek 'Person'
          List<Person> people = new ArrayList<>();

          // Menambahkan objek 'Person' ke dalam list
          people.add(new Person("John", 25)); // Menambahkan John dengan usia 25
          people.add(new Person("Alice", 30)); // Menambahkan Alice dengan usia 30
          people.add(new Person("Bob", 35)); // Menambahkan Bob dengan usia 35
          people.add(new Person("Eve", 40)); // Menambahkan Eve dengan usia 40

          // Menampilkan list asli sebelum diurutkan
          System.out.println("Person list: " + people); // Menampilkan list lengkap dengan elemen-elemen sebelum sorting

          // Mengurutkan list berdasarkan usia menggunakan lambda expression
          people.sort((person1, person2) -> {
               return person1.getAge() - person2.getAge(); // Menghitung perbedaan usia untuk menentukan urutan
          });

          // Alternatif: Menggunakan Comparator.comparingInt untuk menyederhanakan sintaks sorting berdasarkan usia
          people.sort(Comparator.comparingInt(Person::getAge)); // Mengurutkan berdasarkan usia menggunakan method reference

          // Menampilkan hasil list setelah diurutkan berdasarkan usia
          System.out.println("Sorted Person List by Age: " + people);

          // Mengurutkan list berdasarkan nama menggunakan Collections.sort() dan Comparator.comparing
          Collections.sort(people, Comparator.comparing(Person::getName)); // Mengurutkan berdasarkan nama (alfabetis)

          // Menampilkan hasil list setelah diurutkan berdasarkan nama
          System.out.println("Sorted Person List By Name: " + people);
     }
}
