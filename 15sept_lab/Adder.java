/* Write the following code:
 A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
 A class named Adder that inherits from a superclass named Arithmetic.
Input Format
test your submission by calling the add method on an Adder object and passing it integer parameters.*/
class Arithmatic {
int a,b;
int add(int a, int b) {
this.a=a;
this.b=b;
return a+b;
}}
class Adder extends Arithmatic{
public static void main(String[] args) {
Adder obj=new Adder();
 System.out.println("the result of sum is:"+obj.add(9,7));
}}
