/*Q.4 a Java program to find all pairs of elements in an array whose sum is 
equal to a specified number*/
public class Pairs{ 
static void pairs_value(int inputArray[], int inputNumber){ 
System.out.println("Pairs of elements and their sum: "); 
for (int i = 0; i<inputArray.length; i++){
	 for (int j= i+1; j <inputArray.length; j++) { if(inputArray[i]+inputArray[j] == inputNumber) {
System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber); 
	 }}}}
public static void main(String[] args){
pairs_value(new int[] {17, 9, 2, 5, 13, 5, 20}, 22); pairs_value(new int[] {14, -15, 9, 16, 14, 43, 12, 8}, 28); 
}}