import java.util.*;
import java.lang.*;

public class SortTimes{

   public static void arrayGenerator(int[] arraySS, int[] arrayBS, int[] arrayMS, int[] arrayQS, int n)
   {
      int num;
      for(int i = 0; i < n; i++)
      {
         num = ((int)(Math.random() *n));
         arraySS[i] = num;
         arrayBS[i] = num;
         arrayMS[i] = num;
         arrayQS[i] = num;
      }
   }


   public static void main(String[] args){
      int[] arraySS = new int[160000];
      int[] arrayBS = new int[160000];
      int[] arrayMS = new int[160000];
      int[] arrayQS = new int[160000];
      sorts s = new sorts();
      for(int j = 5000; j <= 160000; j= j*2){
         for(int k = 0; k <5 ; k++){   
            System.out.print("N="+ j);
            
            arrayGenerator(arraySS, arrayBS, arrayMS, arrayQS, j);
        /*    System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arraySS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayBS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayQS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayMS[i] + ", ");
            System.out.println();
          */  
            long startTime = 0, endTime = 0, runningTime;
            startTime = System.nanoTime()/1000000;
            s.selectionSort(arraySS,j);
            endTime = System.nanoTime()/1000000; 
          /*  for(int i = 0; i < 10; i++)
               System.out.print(arraySS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayBS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayQS[i] + ", ");
            System.out.println();
            for(int i = 0; i < 10; i++)
               System.out.print(arrayMS[i] + ", ");
            System.out.println();
            */
            System.out.print( ": T_ss=" + (endTime - startTime));
            startTime = System.nanoTime()/1000000;
            s.bubbleSort(arrayBS,j);
            endTime = System.nanoTime()/1000000;
            System.out.print( ": T_bs=" + (endTime - startTime));
            startTime = System.nanoTime()/1000000;
            s.quickSort(arrayQS,j);
            endTime = System.nanoTime()/1000000;
            System.out.print( ": T_qs=" + (endTime - startTime));   
            System.out.println();
         }
         System.out.println();
      }


/*
      System.out.println("Logarithmic algorithm's running times:");
      int[] array1 = {1,4,2,5,3};
      for(int n = 1000 ; n <= 100000000; n = n*2){
         bubbleSort b = new bubbleSort();
         long startTime = 0, endTime = 0, runningTime;
         startTime = System.nanoTime()/1000000;
         b.bubbleSort(array1,5);
         endTime = System.nanoTime()/1000000;
         System.out.println("T("+ n+ ") = " + (endTime - startTime));
      }
*/


      //int[] array1 = {1,4,2,5,3};
     // System.nanoTime()
     // bubbleSort.bubbleSort(array1,5);
   }


}
