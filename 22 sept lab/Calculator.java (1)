//Q 2. Write a java program to illustrate Calculator class with addition, subtraction, multiplication methods that can take any number of parameters to perform the operation, without using method/constructor overloading.
import java.util.Scanner;
class Calculator {
  public static void main(String[] args) {
   char operator;
   Double number1, number2, result;  
   Scanner input = new Scanner(System.in); //create an object of Scanner class
   System.out.println("Choose an operation: +, -, *, or /");
   operator = input.next().charAt(0);
   System.out.println("Enter first number");
   number1 = input.nextDouble();
   System.out.println("Enter second number");
   number2 = input.nextDouble();

   switch (operator) {
      case '+':
         result = number1 + number2;
         System.out.println(number1 + " + " + number2 + " = " + result);
         break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid calculation");
        break;
    }
    input.close();
  }}
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}