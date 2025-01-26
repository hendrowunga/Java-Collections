package Java.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayListExample {
     public static void main(String[] args) throws InterruptedException {
          // Membuat ArrayList yang tidak aman untuk akses multi-threaded
          List<Integer> unsafeArrayList = new ArrayList<>();

          // Menambahkan elemen awal ke dalam ArrayList
          unsafeArrayList.add(1); // Menambahkan elemen 1
          unsafeArrayList.add(2); // Menambahkan elemen 2
          unsafeArrayList.add(3); // Menambahkan elemen 3

          // Membuat ExecutorService dengan 10 thread dalam thread pool
          ExecutorService executorService = Executors.newFixedThreadPool(10);

          // Membuat tugas (task) berupa operasi untuk menambahkan 1 ke setiap elemen ArrayList
          Runnable task = () -> {
               incrementArrayList(unsafeArrayList); // Memanggil method untuk increment elemen ArrayList
          };

          // Mengirimkan 100 tugas ke thread pool untuk dijalankan secara paralel
          for (int i = 0; i < 100; i++) {
               executorService.submit(task); // Menambahkan task ke antrian eksekusi
          }

          // Menghentikan ExecutorService setelah semua tugas selesai
          executorService.shutdown(); // Tidak menerima task baru
          executorService.awaitTermination(60, TimeUnit.SECONDS); // Menunggu hingga semua task selesai atau timeout

          // Menampilkan isi ArrayList setelah eksekusi paralel
          System.out.println(unsafeArrayList); // Output bisa salah karena ArrayList tidak aman untuk akses multi-thread
     }

     // Method untuk meng-increment setiap elemen di ArrayList
     private static void incrementArrayList(List<Integer> unsafeArrayList) {
          for (int i = 0; i < unsafeArrayList.size(); i++) { // Iterasi melalui elemen ArrayList
               Integer value = unsafeArrayList.get(i); // Membaca elemen di indeks i
               unsafeArrayList.set(i, value + 1); // Meng-update elemen dengan nilai yang telah di-increment
          }
     }
}
