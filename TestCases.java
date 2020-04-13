import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class TestCases
{

   public static int[] arrayGenerator(int n)
   {
      int[] arrayN = new int[n];
      for(int i = 0; i < n; i++)
         arrayN[i] = ((int)(Math.random()*n));
      return arrayN;
   }

   public static boolean equals(int[] L1, int[] L2)
   {
      if(L1 == null && L2 == null)
         return true;
      else if((L1 != null && L2 == null) || (L1 == null && L2 != null) || (L1.length != L2.length))
         return false;
      for(int i = 0; i < L1.length; i++)
      {
         if(L1[i] != L2[i])
            return false;
      }
      return true;
   }
   public static boolean testSelectionSort1()
   {

      sorts s = new sorts();
      int[] result = {4,2,5,342,897,23,-1,76,4};
      int[] expected = {-1,2,4,4,5,23,76,342,897};
      s.selectionSort(result,result.length);
      return equals(expected, result);
    }


   public static boolean testSelectionSort2()
   {

      sorts s = new sorts();
      int[] result = {3425,84,4,3,2,5,7,32,7,9,4,2,6,8};
      int[] expected = {3425,84,4,3,2,5,7,32,7,9,4,2,6,8};
      Arrays.sort(expected);
      s.selectionSort(result,result.length);
      return equals(expected, result);
   }

   public static boolean testSelectionSort3()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(1000);
      int[] expected = new int[1000];
      for(int i = 0; i < 1000; i++)
         expected[i] = result[i];
      Arrays.sort(expected);
      s.selectionSort(result,result.length);
      return equals(expected, result);
    }

   public static boolean testSelectionSort4()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(100000);
      int[] expected = new int[100000];
      for(int i = 0; i < 100000; i++)
         expected[i] = result[i];
      Arrays.sort(expected);
      s.selectionSort(result,result.length);
      return equals(expected, result);
    }

   public static boolean testBubbleSort1()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(1000);
      int[] expected = new int[1000];
      for(int i = 0; i < 1000; i++)
         expected[i] = result[i];
      Arrays.sort(expected);
      s.bubbleSort(result,result.length);
      return equals(expected, result);
    }

   public static boolean testBubbleSort2()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(100000);
      int[] expected = new int[100000];
      for(int i = 0; i < 100000; i++)
         expected[i] = result[i];
      Arrays.sort(expected);
      s.bubbleSort(result,result.length);
      return equals(expected, result);
    }

   public static boolean testQuickSort1()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(1000);
      int[] expected = new int[1000];
      for(int i = 0; i < 1000; i++)
         expected[i] = result[i];
      Arrays.sort(expected);
      s.quickSort(result,result.length);
      return equals(expected, result);
    }

   public static boolean testQuickSort2()
   {

      sorts s = new sorts();
      int[] result = arrayGenerator(10);
     // for(int i =0; i<10; i++)
       //  System.out.print(result[i] + ", ");
      int[] expected = new int[10];
      for(int i = 0; i < 10; i++)
         expected[i] = result[i];
    //  System.out.println();
     // for(int i =0; i<10; i++)
       //  System.out.print(expected[i] + ", ");
     // System.out.println();
      Arrays.sort(expected); 
      s.quickSort(result,result.length);
     // for(int i =0; i<10; i++)
       //  System.out.print(expected[i] + ", ");
      //System.out.println();
    //  for(int i =0; i<10; i++)
      //   System.out.print(result[i] + ", ");
     // System.out.println();
      return equals(expected, result);
    }


   public static void main(String[] args)
   {
      boolean pass;
      pass = testSelectionSort1();
      System.out.println("Selection Sort Test 1: " + pass);

      pass = testSelectionSort2();
      System.out.println("Selection Sort Test 2: " + pass); 

      pass = testSelectionSort3();
      System.out.println("Selection Sort Test 3: " + pass); 
 
      pass = testSelectionSort4();
      System.out.println("Selection Sort Test 4: " + pass); 
 
      pass = testBubbleSort1();
      System.out.println("Bubble Sort Test 1: " + pass); 
 
      pass = testBubbleSort2();
      System.out.println("Bubble Sort Test 2: " + pass); 
  
      pass = testQuickSort1();
      System.out.println("Quick Sort Test 1: " + pass); 
      
      pass = testQuickSort2();
      System.out.println("Quick Sort Test 2: " + pass); 
   
   }

}
