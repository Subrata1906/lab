import java.util.*;
  /*Q4 Write a Java program to compare two array lists.*/
  public class CompareTwoArrayList {
  public static void main(String[] args) {
   ArrayList<String> Stringslist1= new ArrayList<String>();
 
        Stringslist1.add("Red");
        Stringslist1.add("Green");    
        Stringslist1.add("Black");
        Stringslist1.add("White");
        Stringslist1.add("Pink");
 
        ArrayList<String> Stringslist2= new ArrayList<String>();
        Stringslist2.add("Red");
        Stringslist2.add("Green");    
        Stringslist2.add("Black");
        Stringslist2.add("Pink");      
 
          //Storing the comparison output in ArrayList
          ArrayList<String> Stringslist3 = new ArrayList<String>();
          for (String e : Stringslist1)
             Stringslist3.add(Stringslist2.contains(e) ? "Yes" : "No");
          System.out.println(Stringslist3);
      }}