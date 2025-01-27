package Java.LinkedList;
/*
Cara mendapatkan elemen pertama di LinkedList.
Cara mendapatkan elemen terakhir di LinkedList.
Cara mendapatkan elemen pada indeks tertentu di LinkedList.
 */
import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {
     public static void main(String[] args) {
          // Membuat LinkedList yang menyimpan harga saham selama 6 hari terakhir
          LinkedList<Double> stockPrices = new LinkedList<>();

          // Menambahkan elemen ke dalam LinkedList, setiap elemen merepresentasikan harga saham harian
          stockPrices.add(45.00); // Harga saham pada hari pertama
          stockPrices.add(51.00); // Harga saham pada hari kedua
          stockPrices.add(62.50); // Harga saham pada hari ketiga
          stockPrices.add(42.75); // Harga saham pada hari keempat
          stockPrices.add(36.80); // Harga saham pada hari kelima
          stockPrices.add(68.40); // Harga saham pada hari keenam

          // Mengambil elemen pertama dalam LinkedList menggunakan getFirst()
          // getFirst() digunakan untuk mendapatkan elemen pertama, yaitu harga saham pada hari pertama
          // Jika LinkedList kosong, metode ini akan melempar NoSuchElementException
          Double firstElement = stockPrices.getFirst();
          System.out.println("Initial Stock Price : " + firstElement); // Menampilkan harga saham awal

          // Mengambil elemen terakhir dalam LinkedList menggunakan getLast()
          // getLast() digunakan untuk mendapatkan elemen terakhir, yaitu harga saham terkini pada hari keenam
          // Jika LinkedList kosong, metode ini juga akan melempar NoSuchElementException
          Double lastElement = stockPrices.getLast();
          System.out.println("Current Stock Price : " + lastElement); // Menampilkan harga saham terkini

          // Mengambil elemen berdasarkan indeks tertentu dalam LinkedList
          // Metode get() mengambil elemen di indeks tertentu (berbasis 0), di sini indeks 2 berarti hari ketiga
          Double stockPriceOn3rdDay = stockPrices.get(2);
          System.out.println("Stock Price on 3rd Day : " + stockPriceOn3rdDay); // Menampilkan harga saham hari ketiga
     }
}
