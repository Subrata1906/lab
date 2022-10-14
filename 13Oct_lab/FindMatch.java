/*Q3.Write a Java program to find sequences of lowercase letters joined with a underscore.*/
public class FindMatch {
public static String match(String input) { if(input.matches("[a-z]+_[a-z]+")) {
return "match found";
}
else {
return "match not found";
}}
public static void main(String[] args) {
System.out.println(match("subrata_mandal"));
System.out.println(match("Subrata_Mandal"));
}}tem.out.println(match("Subrata_Mandal"));
}}