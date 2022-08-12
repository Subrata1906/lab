// Write a java program to compute the specified expression and print the output.
class Equation
{
public static void main(String []args)
{
System.out.println("(25.5*3.5-3.5*3.5)/(40.5-4.5)=");
float a = 25.5f;
float b = 3.5f;
float c = 40.5f;
float d = 4.5f;
float equation = (a*b-b*b)/(c-d);
System.out.println(equation);
}
}
