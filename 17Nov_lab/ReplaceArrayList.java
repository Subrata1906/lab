/*Q6Write a Java program to replace an element in a linked list.*/
import java.util.LinkedList;
import java.util.Collections;
  public class ReplaceArrayList {
  public static void main(String[] args) {
          LinkedList<String> c1= new LinkedList<String>();
          c1.add("C++");
          c1.add("JavaScript");
          c1.add("PHP");
          c1.add("Java");
          c1.add("Python");
          System.out.println("Original linked list: " + c1);
          // Replacing 2nd element with new value
          c1.set(1, "SQL");
          System.out.println("The value of second element changed.");
          System.out.println("New linked list: " + c1);
   }
}