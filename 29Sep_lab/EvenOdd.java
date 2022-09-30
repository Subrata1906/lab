/*Q1.Write a Java method to check whether every digit of a given integer 
is even. Return true if every digit is odd otherwise false?*/
import java.util.Scanner;
public class EvenOdd{ 
 public static void main(String[] args)
    {
        System.out.print("Check whether every digit of the integer is even or not!\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer:");
        int n = in.nextInt();
        System.out.print(test(n));
        }
  public static boolean test(int n){
    final int f = 10;
    if (n == 0){
        return false;
    }
    while(n != 0){
        if((n % f) % 2 != 0){
            return false;
        }
        n /= 10;
    }
     return true;
   }}