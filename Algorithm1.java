//imports
import java.io.*;

public class Algorithm1 {
   
   //algorithm 1
   public static void algorithm1(int[] arr, BufferedWriter bw) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRightNew = 0;
      int minRight = 0;
      int minSumNew = 0;
      int minSum = 0;
      int negCount = 0;
      boolean allNeg = false;
      
      //checks for array of one element
      if (arr.length == 1) {
         System.out.println(arr[0]);
         System.out.println("0");
         System.out.println("0");
         return;
      }
      
      minLeft = 0;
      minRight = 0;
      minSum = arr[0];
      
      //checks for all positive case
      for (int i = 0; i < arr.length; i++) {
         if ((arr[i] >= 0) && (arr[i] < minSum)) {
            minSum = arr[i];
            minLeft = i;
            minRight = i;
         }
         if (arr[i] < 0) { 
            negCount++; 
         }
         if (negCount == arr.length - 1) { 
            break; 
         }
         if ((i == arr.length - 1) && (negCount < 0)) { 
            System.out.println(minSum);
            System.out.println(minLeft);
            System.out.println(minRight);
            return;
         }
      }
      
      //checks for all negative case
      if (allNeg) {
         minSum = arr[0];
         for (int j = 1; j < arr.length; j++) {
            minSum += arr[j];
         }
         System.out.println(minSum);
         System.out.println(0);
         System.out.println(arr.length - 1);
         return;
      }
      
      minLeft = 0;
      minRight = 0;
      minSum = arr[0];
      
      //finds contiguous minimum sum subarray, ignoring cases where subarrays > 0
      for (int j = 0; j < arr.length; j++) {
         minSumNew += arr[j];
         minRightNew = j;
         if (minSumNew < minSum) {
            minSum = minSumNew;
            minLeft = minLeftNew;
            minRight = minRightNew;
         }
         if (minSumNew >= 0) {
            minSumNew = 0;
            minLeftNew = j + 1; 
         }
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
   
   //Same algorithm, does not use a buffered writer to write to file
   public static void algorithm1B(int[] arr) {
      int minLeftNew = 0;
      int minLeft = 0;
      int minRightNew = 0;
      int minRight = 0;
      int minSumNew = 0;
      int minSum = 0;
      int negCount = 0;
      boolean allNeg = false;
      
      //checks for array of one element
      if (arr.length == 1) {
         System.out.println(arr[0]);
         System.out.println("0");
         System.out.println("0");
         return;
      }
      
      minLeft = 0;
      minRight = 0;
      minSum = arr[0];
      
      //checks for all positive case
      for (int i = 0; i < arr.length; i++) {
         if ((arr[i] >= 0) && (arr[i] < minSum)) {
            minSum = arr[i];
            minLeft = i;
            minRight = i;
         }
         if (arr[i] < 0) { 
            negCount++; 
         }
         if (negCount == arr.length - 1) { 
            break; 
         }
         if ((i == arr.length - 1) && (negCount < 0)) { 
            System.out.println(minSum);
            System.out.println(minLeft);
            System.out.println(minRight);
            return;
         }
      }
      
      //checks for all negative case
      if (allNeg) {
         minSum = arr[0];
         for (int j = 1; j < arr.length; j++) {
            minSum += arr[j];
         }
         System.out.println(minSum);
         System.out.println(0);
         System.out.println(arr.length - 1);
         return;
      }
      
      minLeft = 0;
      minRight = 0;
      minSum = arr[0];
      
      //finds contiguous minimum sum subarray, ignoring cases where subarrays > 0
      for (int j = 0; j < arr.length; j++) {
         minSumNew += arr[j];
         minRightNew = j;
         if (minSumNew < minSum) {
            minSum = minSumNew;
            minLeft = minLeftNew;
            minRight = minRightNew;
         }
         if (minSumNew >= 0) {
            minSumNew = 0;
            minLeftNew = j + 1; 
         }
      }
   }
}