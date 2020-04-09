import java.util.*;
import java.lang.*;

public class SortTimes{

   public int[] arrayGenerator(int n){
      int[] arrayN = new int[n];
      for(int i = 0; i < n; i++){
         arrayN[i] = ((int)(Math.random() *n));
      }
      return arrayN;
   }


   public static void main(String[] args){
      SortTimes st = new SortTimes();
      int[] arrayN = new int[160000];
      for(int j = 5000; j <= 160000; j= j*2){
         for(int k = 0; k <5 ; k++){   
            System.out.print("N="+ j);
   
            System.out.print( ": T_SS=");
            arrayN = st.arrayGenerator(j);
            bubbleSort b = new bubbleSort();
            long startTime = 0, endTime = 0, runningTime;
            startTime = System.nanoTime()/1000000;
            b.bubbleSort(arrayN,j);
            endTime = System.nanoTime()/1000000;

            System.out.print(", T_bs=" + (endTime - startTime));
   
            System.out.print(", T_ms=");
   
            System.out.println(", T_qs=");
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
