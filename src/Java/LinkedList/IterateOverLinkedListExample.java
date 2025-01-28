package Java.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateOverLinkedListExample {
     public static void main(String[] args) {
          LinkedList<String> humansSpecies=new LinkedList<>();
          humansSpecies.add("Homo Sapiens");
          humansSpecies.add("Homo Erectus");
          humansSpecies.add("Homo Neanderthalensis");
          humansSpecies.add("Homo Neanderthalensis");
          humansSpecies.add("Homo Erectus");


          System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
          humansSpecies.forEach(name->{
               System.out.println(name);
          });
          System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
          Iterator<String> humansSpeciesIterator=humansSpecies.iterator();
          while (humansSpeciesIterator.hasNext()){
               String speciesName=humansSpeciesIterator.next();
               System.out.println(speciesName);
          }

          System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
          humansSpeciesIterator=humansSpecies.iterator();
          humansSpeciesIterator.forEachRemaining(speciesName->{
               System.out.println(speciesName);
          });
     }
}
