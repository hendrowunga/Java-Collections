package Java.LinkedList;

/*
Cara menghapus elemen pertama di LinkedList.
Cara menghapus elemen terakhir di LinkedList.
Cara menghapus kemunculan pertama elemen tertentu di LinkedList.
Cara menghapus semua elemen yang memenuhi predikat tertentu dari LinkedList.
Cara menghapus LinkedList sepenuhnya.
 */
import java.util.LinkedList;

public class RemoveElementsFromLinkedListExample {
     public static void main(String[] args) {
          // Membuat objek LinkedList baru yang menyimpan nama-nama bahasa pemrograman
          LinkedList<String> programmingLanguages = new LinkedList<>();

          // Menambahkan elemen ke LinkedList (digunakan metode add() untuk menambahkan ke akhir daftar)
          programmingLanguages.add("Assembly");  // Menambahkan "Assembly" ke LinkedList
          programmingLanguages.add("Fortran");   // Menambahkan "Fortran"
          programmingLanguages.add("Pascal");    // Menambahkan "Pascal"
          programmingLanguages.add("C");         // Menambahkan "C"
          programmingLanguages.add("C++");       // Menambahkan "C++"
          programmingLanguages.add("Java");      // Menambahkan "Java"
          programmingLanguages.add("C#");        // Menambahkan "C#"
          programmingLanguages.add("Kotlin");    // Menambahkan "Kotlin"

          // Menampilkan LinkedList awal
          System.out.println("Initial LinkedList = " + programmingLanguages);

          // Menghapus elemen pertama dalam LinkedList menggunakan removeFirst()
          // Metode ini akan membuang elemen pertama ("Assembly") dan mengembalikannya
          String element = programmingLanguages.removeFirst();  // Jika kosong, akan melempar NoSuchElementException
          System.out.println("Removed the first element " + element + " => " + programmingLanguages);

          // Menghapus elemen terakhir dalam LinkedList menggunakan removeLast()
          // Menghapus elemen terakhir ("Kotlin") dan mengembalikannya
          element = programmingLanguages.removeLast();   // Jika kosong, akan melempar NoSuchElementException
          System.out.println("Removed the last element " + element + " => " + programmingLanguages);

          // Menghapus elemen pertama yang sesuai dengan nilai yang diberikan
          // Dalam hal ini, kita menghapus "C#" jika elemen tersebut ditemukan
          boolean isRemoved = programmingLanguages.remove("C#");  // Mengembalikan true jika berhasil dihapus
          if(isRemoved) {
               System.out.println("Removed C# => " + programmingLanguages);
          }

          // Menghapus semua elemen yang memenuhi kondisi tertentu menggunakan removeIf()
          // Kondisi: nama bahasa pemrograman yang diawali huruf "C"
          programmingLanguages.removeIf(programmingLanguage -> programmingLanguage.startsWith("C"));
          System.out.println("Removed elements starting with C => " + programmingLanguages);

          // Menghapus semua elemen dalam LinkedList menggunakan clear()
          // Setelah clear(), LinkedList akan kosong
          programmingLanguages.clear();
          System.out.println("Cleared the LinkedList => " + programmingLanguages);
     }
}
