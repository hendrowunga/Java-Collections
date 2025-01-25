package Java.ArrayList.ArrayListObject;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDefinedObjectExample {
     public static void main(String[] args) {
          List<User> users = new ArrayList<>(); // Membuat objek ArrayList dengan tipe data User
          users.add(new User("John", 25)); // Menambahkan objek User ke dalam ArrayList
          users.add(new User("Alice", 30)); // Menambahkan objek User ke dalam ArrayList
          users.add(new User("Bob", 35)); // Menambahkan objek User ke dalam ArrayList

          users.forEach(user->{
               System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
          });
     }
}
