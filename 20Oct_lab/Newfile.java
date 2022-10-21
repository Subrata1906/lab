/*Q2.Wite a program in Java to create a file in Java using Exception Handling.*/
import java.io.File; //importing file class
import java.io.IOException; //importing IO Exception class
public class NewFile{
public static void main(String args[]){
try {
File f = new File("Internal_Android_Obb_Data");
if (f.createNewFile()){//creating new file and checking condition 
System.out.println("File" + f.getName()+" is created successfully.");
}
else {
System.out.println("File is already exist in the directory.");
}}
 catch (IOException e) { //catching exception if any exception occurs 
 System.out.println("An unexpected error is occurred."); 
 e.printStackTrace();
 }}}