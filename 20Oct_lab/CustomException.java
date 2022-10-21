/*Q3. Write a program to create custom exception in java.*/
public class CustomException {// class that uses custom exception InvalidAgeException 
public void checkAge(int age) throws invalidAgeException{//method for checking the age 
if(age<=20||age>=29) {
throw new invalidAgeException(" allow to attempt");
}
else
System.out.println(" not allow to attempt");
}
public static void main(String[] args) throws invalidAgeException {
CustomException ce = new CustomException();//object creation of CustomException class
ce.checkAge(27);//method calling
}}
class invalidAgeException extends Exception{// class representing custom exception 
invalidAgeException(String str){// calling the constructor of parent Exception 
super(str);
}};
