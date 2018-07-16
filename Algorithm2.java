//imports
import java.io.*;

public class Algorithm2 {

   //algorithm2
   public static void algorithm2(int[] arr, BufferedWriter bw) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRight = 0;
      int minSumNew = 0;
      int minSum = arr[0];
      
     //checks if array length is one.
      if (arr.length == 1) {
         System.out.println(arr[0]);
         System.out.println("0");
         System.out.println("0");
         return;
      }
      
      //loops through and creates all possible subarrays, saves minimum and indices
      for (int i = 0; i < arr.length; i++) {
         minSumNew = arr[i];
         minLeftNew = i;
         if (minSumNew < minSum) {
            minSum = minSumNew;
            minLeft = minLeftNew;
            minRight = minLeft;
         }
         for (int j = i + 1; j < arr.length; j++) {
            minSumNew = minSumNew + arr[j];
            if (minSumNew < minSum) {
               minSum = minSumNew;
               minLeft = minLeftNew;
               minRight = j;
            }
         }
         minSumNew = 0;
         minLeftNew = 0;
      }
      
      //checks last element (for edge cases where the last element is the answer
      if (arr[arr.length - 1] <  minSum){
         minSum = arr[arr.length - 1];
         minLeft = arr.length-1;
         minRight = arr.length-1;
      }
      
      // prints minimum sum and indices to a txt file
      try {
         bw.write(String.valueOf(minSum));
         bw.write(", ");
         bw.write(String.valueOf(minLeft));
         bw.write(", ");
         bw.write(String.valueOf(minRight));
         bw.newLine();
      }
      catch (IOException e) {
         System.out.println("Error reading in file.");
      }
   
   }
   
   //Same algorithm, does not use a BufferedWriter to write into a file
   public static void algorithm2B(int[] arr) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRight = 0;
      int minSumNew = 0;
      int minSum = arr[0];
      
     //checks if array length is one.
      if (arr.length == 1) {
         System.out.println(arr[0]);
         System.out.println("0");
         System.out.println("0");
         return;
      }
      
      //loops through and creates all possible subarrays, saves minimum and indices
      for (int i = 0; i < arr.length; i++) {
         minSumNew = arr[i];
         minLeftNew = i;
         if (minSumNew < minSum) {
            minSum = minSumNew;
            minLeft = minLeftNew;
            minRight = minLeft;
         }
         for (int j = i + 1; j < arr.length; j++) {
            minSumNew = minSumNew + arr[j];
            if (minSumNew < minSum) {
               minSum = minSumNew;
               minLeft = minLeftNew;
               minRight = j;
            }
         }
         minSumNew = 0;
         minLeftNew = 0;
      }
      
      //checks last element (for edge cases where the last element is the answer
      if (arr[arr.length - 1] <  minSum){
         minSum = arr[arr.length - 1];
         minLeft = arr.length-1;
         minRight = arr.length-1;
      }
   }

}