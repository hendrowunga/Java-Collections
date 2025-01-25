package Java.ArrayList;
// Cara memeriksa apakah ArrayList kosong menggunakan metode isEmpty().
// Cara menemukan ukuran ArrayList menggunakan metode size().
// Cara mengakses elemen pada indeks tertentu dalam ArrayList menggunakan metode get().
// Cara memodifikasi elemen pada indeks tertentu dalam ArrayList menggunakan metode set().


import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
     public static void main(String[] args) {
          List<String> topCompanies = new ArrayList<>(); // Membuat sebuah ArrayList bernama topCompanies untuk menyimpan elemen String

          // Memeriksa apakah ArrayList kosong menggunakan isEmpty()
          System.out.println("Is the top companies list empty? " + topCompanies.isEmpty()); // Mengembalikan true jika ArrayList kosong

          // Menambahkan elemen ke dalam ArrayList menggunakan add()
          topCompanies.add("Google"); // Menambahkan "Google" ke dalam ArrayList
          topCompanies.add("Amazon"); // Menambahkan "Amazon"
          topCompanies.add("Facebook"); // Menambahkan "Facebook"
          topCompanies.add("Apple"); // Menambahkan "Apple"
          topCompanies.add("Microsoft"); // Menambahkan "Microsoft"

          // Menemukan ukuran dari ArrayList menggunakan size()
          System.out.println("Here are the top " + topCompanies.size() + " companies in the world"); // Menampilkan jumlah elemen dalam ArrayList
          System.out.println(topCompanies); // Menampilkan seluruh elemen ArrayList

          // Mengakses elemen pada indeks tertentu menggunakan get()
          String bestCompany = topCompanies.get(0); // Mengambil elemen pada indeks 0, yaitu "Google"
          String secondBestCompany = topCompanies.get(1); // Mengambil elemen pada indeks 1, yaitu "Amazon"
          String lastCompany = topCompanies.get(topCompanies.size() - 1); // Mengambil elemen terakhir dalam ArrayList

          System.out.println("Best Company : " + bestCompany); // Menampilkan elemen terbaik (indeks 0)
          System.out.println("Second Best Company: " + secondBestCompany); // Menampilkan elemen kedua (indeks 1)
          System.out.println("Last Company in the list: " + lastCompany); // Menampilkan elemen terakhir

          // Memodifikasi elemen pada indeks tertentu menggunakan set()
          topCompanies.set(4, "Oracle"); // Mengubah elemen pada indeks ke-4 dari "Microsoft" menjadi "Oracle"
          System.out.println("Modified top companies list: " + topCompanies); // Menampilkan daftar ArrayList setelah modifikasi
     }
}
