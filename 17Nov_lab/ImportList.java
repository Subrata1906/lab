/*Q5Write a Java program to insert the specified element at the front of a linked list.*/
import java.util.*;
  public class ImportList{
  public static void main(String[] args) {
   // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("Four Wheeler");
          l_list.add("Bus");
          l_list.add("Train");
     System.out.println("Original linked list:" + l_list);    
  // Add an element to front of LinkedList
     l_list.offerFirst("Two Wheeler");
     System.out.println("Final linked list:" + l_list);   }}