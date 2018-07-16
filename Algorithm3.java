//imports
import java.io.*;

public class Algorithm3 {
    
    //Algorithm3
   public static void algorithm3(int[] arr, BufferedWriter bw) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRight = 0;
      int min = arr[0];
      int[] sum = new int[arr.length];
      sum[0] = arr[0];
   
      //Dynamic Programming method, modified to calculate indices. 
      //Lines 19-29 were adapted from source mentioned in pdf file.
      for (int i = 1; i < arr.length; i++) {
         sum[i] = Math.min(arr[i], sum[i - 1] + arr[i]);
         min = Math.min(min, sum[i]);
         if (min == sum[i]) {
            minRight = i;
            minLeft = minLeftNew;
         }
         if (sum[i] > 0) {
            minLeftNew = i + 1;
         }
      }
      
      //added check for edge case
      if (minRight == 1 && arr[0] > 0){
         minLeft = 1;
      }
      
      // prints minimum sum and indices to a txt file
      try {
         bw.write(String.valueOf(min));
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
   
   //Same algorithm, does not use BufferedWriter to write to text
   public static void algorithm3B(int[] arr) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRight = 0;
      int min = arr[0];
      int[] sum = new int[arr.length];
      sum[0] = arr[0];
   
      //Dynamic Programming method, modified to calculate indices. 
      //Lines 19-29 were adapted from source mentioned in pdf file.
      for (int i = 1; i < arr.length; i++) {
         sum[i] = Math.min(arr[i], sum[i - 1] + arr[i]);
         min = Math.min(min, sum[i]);
         if (min == sum[i]) {
            minRight = i;
            minLeft = minLeftNew;
         }
         if (sum[i] > 0) {
            minLeftNew = i + 1;
         }
      }
      
      //added check for edge case
      if (minRight == 1 && arr[0] > 0){
         minLeft = 1;
      }
   }

}