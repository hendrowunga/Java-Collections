package Java.LinkedList;
/*
Java 8 dan ekspresi lambda.forEach()
iterator()
iterator() dan Java 8 forEachRemaining() metode
menurunIterator()
daftarIterator()
loop for-each sederhana.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedListExample {
     public static void main(String[] args) {
          // Membuat objek LinkedList untuk menyimpan nama-nama spesies manusia
          LinkedList<String> humanSpecies = new LinkedList<>();

          // Menambahkan elemen ke LinkedList
          humanSpecies.add("Homo Sapiens"); // Elemen pertama ditambahkan
          humanSpecies.add("Homo Neanderthalensis"); // Elemen kedua ditambahkan
          humanSpecies.add("Homo Erectus"); // Elemen ketiga ditambahkan
          humanSpecies.add("Home Habilis"); // Elemen keempat ditambahkan

          // Menggunakan Java 8 forEach dengan ekspresi lambda
          System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
          humanSpecies.forEach(name -> { // Ekspresi lambda akan dipanggil untuk setiap elemen
               System.out.println(name); // Mencetak elemen satu per satu
          });

          // Menggunakan iterator() untuk iterasi manual
          System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
          Iterator<String> humanSpeciesIterator = humanSpecies.iterator(); // Membuat iterator
          while (humanSpeciesIterator.hasNext()) { // Mengecek apakah masih ada elemen berikutnya
               String speciesName = humanSpeciesIterator.next(); // Mendapatkan elemen berikutnya
               System.out.println(speciesName); // Mencetak elemen
          }

          // Menggunakan iterator() dan metode forEachRemaining() untuk mencetak sisa elemen
          System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
          humanSpeciesIterator = humanSpecies.iterator(); // Membuat iterator baru
          humanSpeciesIterator.forEachRemaining(speciesName -> { // Mencetak semua elemen yang tersisa
               System.out.println(speciesName);
          });

          // Menggunakan descendingIterator() untuk iterasi dari akhir ke awal
          System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
          Iterator<String> descendingHumanSpeciesIterator = humanSpecies.descendingIterator(); // Membuat iterator mundur
          while (descendingHumanSpeciesIterator.hasNext()) { // Mengecek elemen dari akhir ke awal
               String speciesName = descendingHumanSpeciesIterator.next(); // Mendapatkan elemen berikutnya secara mundur
               System.out.println(speciesName); // Mencetak elemen
          }

          // Menggunakan listIterator() untuk iterasi dua arah
          System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
          ListIterator<String> humanSpeciesListIterator = humanSpecies.listIterator(humanSpecies.size()); // Memulai iterasi dari akhir
          while (humanSpeciesListIterator.hasPrevious()) { // Mengecek elemen sebelumnya
               String speciesName = humanSpeciesListIterator.previous(); // Mendapatkan elemen sebelumnya
               System.out.println(speciesName); // Mencetak elemen
          }

          // Menggunakan for-each loop sederhana untuk iterasi LinkedList
          System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
          for (String speciesName : humanSpecies) { // Perulangan untuk setiap elemen dalam LinkedList
               System.out.println(speciesName); // Mencetak elemen
          }
     }
}