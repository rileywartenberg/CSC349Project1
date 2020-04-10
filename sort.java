//selection sort

import java.util.*;

class sort{

   public static int[] swap(int[] array,int a, int b)
   {
      int temp = array[a];
      array[a] = array[b];
      array[b] = temp;
      return array;
   }


   public static void selectionSort(int[] arr, int N)
   {
      int temp = 0;
      int minIndex = 0;
      for(int startIndex = 0; startIndex <= N-2; startIndex++)
      {
         minIndex = startIndex;
         for(int i = startIndex; i <= N - 1; i++)
         {
            if(arr[i] < arr[minIndex])
               minIndex = i;
         }
         arr = swap(arr, startIndex, minIndex);
      }
      for(int j = 0; j <= N-1; j++)
         System.out.print(arr[j] + ",");
   }

   public static void main(String[] args)
   {
      int[] arr = {3,2,4,6,1,9,8,2};
      selectionSort(arr, 8);
   }
}
