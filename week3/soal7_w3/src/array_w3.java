import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
    public class array_w3 { 
    public static void main(String[] args) { 
 
    int[] fisrtArray = {2, 5, 3};  
    int[] secondArray = {9, 5, 3};  
    int[] thirdArray = {2, 4, 9};  
    int[] fourthArray = {10, 11, 12};  
    int[] fifthArray = {13, 14, 15};  
    int[] sixthArray = {16, 17, 18};  
    int[] seventhArray = {19, 20, 21};  
    int[] eighthArray = {22, 23, 24};  
    int[] ninthArray = {25, 26, 27};  
    
    int[][] twoDimensionalArray1 = {fisrtArray, secondArray,  thirdArray};  
    int[][] twoDimensionalArray2 = {fourthArray, fifthArray,  sixthArray}; 
    int[][] twoDimensionalArray3 = {seventhArray, eighthArray,  ninthArray}; 
 
    int[][][] threeDimensionalArray = {twoDimensionalArray1,  twoDimensionalArray2, twoDimensionalArray3}; 
    String output1 = Arrays.toString(fisrtArray)+Arrays.toString(secondArray)+Arrays.toString(thirdArray);
    output1=output1.replaceAll("\\[","{");
    output1=output1.replaceAll("\\]","}");
            for(int[][] array3d : threeDimensionalArray){
	     System.out.print("{");
	    	for(int[] array2d : array3d){
	        System.out.print("{");
	           for(int array : array2d){
	            System.out.print(array + " ");
	           }
                    System.out.print("} ");
	         }
                    System.out.println("}");
	     }	  
	} 
}
