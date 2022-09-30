/*Q5. Write a Java program to find common elements from three sorted (in 
non-decreasing order) arrays.*/
import java.util.*;
public class Common {
public static void main(String[] args) {
ArrayList<Integer> common = new ArrayList<Integer>();
int arr1[] = {5, 4, 8,}; 
int arr2[] = {12, 3, 5, 8, 10, 16}; 
int arr3[] ={4, 8, 12, 5}; 
int x = 0, y = 0, z = 0;
while (x < arr1.length && y < arr2.length && z < arr3.length){
if (arr1 [x] == arr2 [y] && arr2[y] == arr3 [z]) {
common.add(arr1 [x]);
x++; y++; z++;
}
else if (arr1 [x] < arr2 [y])
            x++;
else if (arr2 [y] < arr3 [z])
            y++;
else
            z++;
 }
System.out.println("Common elements from three sorted arrays are : " );
 System.out.println(common); }}