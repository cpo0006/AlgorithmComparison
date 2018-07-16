//imports
import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ReadWriteFile {

   public static void main(String args[])  {
     //reads input file into array
      try {
         File inputFile = new File("input.txt");
         Scanner scan = new Scanner(inputFile);
         String size = scan.nextLine(); // read size
         String aux = scan.nextLine(); 
         aux = aux.replaceAll("\\s",""); // remove whitespaces for better Integer.parseInt(String)
         String[] parts = aux.split(","); 
         int arraySize = Integer.parseInt(size);
         int[] array = new int[arraySize];
         for (int i = 0; i < parts.length; i++) { 
            array[i] = Integer.parseInt(parts[i]);
         }
         scan.close();
         
         
         //output.txt file created
         File outputFile = new File("output.txt");
         OutputStream output = new FileOutputStream(outputFile);
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(output,"UTF-8"));
         
         Algorithm1.algorithm1(array, bw);
         Algorithm2.algorithm2(array, bw);
         Algorithm3.algorithm3(array, bw);
         bw.close();
      }
      catch (IOException e) {
         System.out.println("Invalid file, input.txt not found.");
      }
      
      //Creates arrays between sizes of 100 to 10000
      int[] array100 = new int[100];
      int[] array500 = new int[500];
      int[] array1000 = new int[1000];
      int[] array1500 = new int[1500];
      int[] array2000 = new int[2000];
      int[] array2500 = new int[2500];
      int[] array3000 = new int[3000];
      int[] array3500 = new int[3500];
      int[] array4000 = new int[4000];
      int[] array4500 = new int[4500];
      int[] array5000 = new int[5000];
      int[] array5500 = new int[5500];
      int[] array6000 = new int[6000];
      int[] array6500 = new int[6500];
      int[] array7000 = new int[7000];
      int[] array7500 = new int[7500];
      int[] array8000 = new int[8000];
      int[] array8500 = new int[8500];
      int[] array9000 = new int[9000];
      int[] array9500 = new int[9500];
      int[] array10000 = new int[10000];
      
      //Generates random numbers for the arrays
      Random rand = new Random();
      for (int i = 0; i < 100; i++) {
         array100[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 500; i++) {
         array500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 1000; i++) {
         array1000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 1500; i++) {
         array1500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 2000; i++) {
         array2000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 2500; i++) {
         array2500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 3000; i++) {
         array3000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 3500; i++) {
         array3500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 4000; i++) {
         array4000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 4500; i++) {
         array4500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 5000; i++) {
         array5000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 5500; i++) {
         array5500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 6000; i++) {
         array6000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 6500; i++) {
         array6500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 7000; i++) {
         array7000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 7500; i++) {
         array7500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 8000; i++) {
         array8000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 8500; i++) {
         array8500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 9000; i++) {
         array9000[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 9500; i++) {
         array9500[i] = rand.nextInt(2001) - 1000;
      }
      for (int i = 0; i < 10000; i++) {
         array10000[i] = rand.nextInt(2001) - 1000;
      }
      
      
      //Calculates the time of the algorithms on each array
      //alg 1
      long startTime = 0;
      long endTime = 0;
      long elapsedTime = 0;
      for (int i = 0; i < 5000; i++) {             //alg1 100
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array100);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_100 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 1000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array1000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_1000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 1500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array1500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_1500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 2000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array2000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_2000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 2500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array2500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_2500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 3000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array3000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_3000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 3500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array3500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_3500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 4000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array4000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_4000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 4500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array4500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_4500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 5000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array5000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_5000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 5500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array5500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_5500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 6000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array6000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_6000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 6500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array6500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_6500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 7000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array7000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_7000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 7500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array7500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_7500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 8000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array8000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_8000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 8500
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array8500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_8500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 9000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array9000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_9000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 95000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array9500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_9500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg1 10000
         startTime = System.nanoTime();
         Algorithm1.algorithm1B(array10000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg1_10000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      //alg 2
      for (int i = 0; i < 5000; i++) {             //alg2 100
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array100);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_100 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 1000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array1000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_1000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 1500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array1500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_1500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 2000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array2000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_2000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 2500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array2500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_2500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 3000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array3000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_3000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 3500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array3500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_3500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 4000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array4000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_4000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 4500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array4500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_4500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 5000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array5000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_5000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 5500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array5500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_5500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 6000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array6000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_6000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 6500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array6500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_6500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 7000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array7000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_7000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 7500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array7500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_7500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 8000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array8000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_8000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 8500
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array8500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_8500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 9000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array9000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_9000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 95000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array9500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_9500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg2 10000
         startTime = System.nanoTime();
         Algorithm2.algorithm2B(array10000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg2_10000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 100
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array100);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_100 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 1000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array1000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_1000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 1500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array1500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_1500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 2000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array2000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_2000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 2500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array2500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_2500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 3000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array3000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_3000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 3500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array3500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_3500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 4000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array4000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_4000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 4500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array4500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_4500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 5000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array5000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_5000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 5500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array5500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_5500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 6000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array6000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_6000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 6500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array6500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_6500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 7000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array7000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_7000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 7500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array7500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_7500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 8000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array8000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_8000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 8500
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array8500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_8500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 9000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array9000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_9000 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 95000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array9500);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_9500 = elapsedTime / 5000;
      elapsedTime = 0;
      
      for (int i = 0; i < 5000; i++) {             //alg3 10000
         startTime = System.nanoTime();
         Algorithm3.algorithm3B(array10000);
         endTime = System.nanoTime();
         elapsedTime += (endTime - startTime);
      }
      long alg3_10000 = elapsedTime / 5000;
      elapsedTime = 0;
   
   //Reads data into time.txt file
      try {
         File outputTFile = new File("time.txt");
         OutputStream output = new FileOutputStream(outputTFile);
         BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(output,"UTF-8"));
         bw2.write(String.valueOf(alg1_100));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_1000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_1500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_2000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_2500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_3000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_3500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_4000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_4500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_5000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_5500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_6000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_6500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_7000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_7500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_8000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_8500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_9000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_9500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg1_10000));
         bw2.newLine();
         
         bw2.write(String.valueOf(alg2_100));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_1000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_1500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_2000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_2500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_3000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_3500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_4000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_4500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_5000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_5500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_6000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_6500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_7000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_7500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_8000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_8500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_9000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_9500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg2_10000));
         bw2.newLine();
         
         bw2.write(String.valueOf(alg3_100));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_1000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_1500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_2000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_2500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_3000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_3500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_4000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_4500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_5000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_5500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_6000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_6500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_7000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_7500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_8000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_8500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_9000));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_9500));
         bw2.write(", ");
         bw2.write(String.valueOf(alg3_10000));
         bw2.newLine();
         bw2.close();
      }
      catch (IOException e2) {
         System.out.println("Error reading/writing to text file");
      }
   
   }

}