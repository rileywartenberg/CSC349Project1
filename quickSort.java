//selection sort

import java.util.*;

class quickSort{

   public static int[] swap(int[] array,int a, int b)
   {
      int temp = array[a];
      array[a] = array[b];
      array[b] = temp;
      return array;
   }


   public static void quickSort(int[] list, int N) { quickSort(list, 0 , N-1); }

   private static void quickSort(int[] list, int first, int last)
   {
      //System.out.println("initial call " + first + " " + last);
   //   for(int i = 0; i < list.length; i++)
   //      System.out.print(list[i] + ", ");
    //  System.out.println(" ");
      if(first<last)
      {
      //   for(int i = first; i <= last; i++)
        //    System.out.print(list[i] + ",");
    //     System.out.println("switch");
         setPivotToEnd(list, first, last);
      //   for(int i = 0; i < list.length; i++)
      //   System.out.print(list[i] + ", ");
      //   System.out.println("after setPivot");
         int pivotIndex = splitList(list, first, last);
        // System.out.println("pivotIndex " + pivotIndex);
    //     for(int i = 0; i < list.length; i++)
      //      System.out.print(list[i] + ", ");
        // System.out.println(" ");
         quickSort(list, first, pivotIndex - 1);
         quickSort(list, pivotIndex+1, last);
        // for(int i = first; i <= last; i++)
          //  System.out.print(list[i] + ",");
      }
   }

   private static void setPivotToEnd(int[] arr, int left, int right)
   {
      int center = (right + left)/2;
      //System.out.println(center);
      if(arr[left] > arr[center])
         swap(arr, left, center);
      if(arr[left] > arr[right])
         swap(arr, left, right);
      if(arr[center] < arr[right])
         swap(arr, center, right);

   }

   private static int splitList(int[] arr, int left, int right)
   {
      int indexL = left;
      int indexR = right - 1;
      int pivot = arr[right];
 //     for(int i = 0; i < arr.length; i++)
   //      System.out.print(arr[i] + ", "); 
     // System.out.println("\n" + indexL + " " + indexR + " " + pivot);
      while(indexL <= indexR)
      {
  //       for(int i = 0; i < arr.length; i++)
    //        System.out.print(arr[i] + ", ");
      //   System.out.println("\n" + indexL + " " + indexR);
         if(arr[indexL] <= pivot)
            indexL++;
         if(arr[indexR] > pivot)
            indexR--;
         if(indexL < indexR && arr[indexL] > pivot && arr[indexR] <= pivot)
         {
            swap(arr, indexL, indexR);
            indexL++;
            indexR--;
         }
      }
    //  System.out.println("swap pivot: " + indexL + " " + right);
      swap(arr, indexL, right);
   //   System.out.println("final array after split: ");
   //   for(int i = 0; i < arr.length; i++)
     //    System.out.print(arr[i] + ", ");
 
      return indexL;

   }

   public static void main(String[] args)
   {
      int[] arr = {1,6,4,5,8,2, 2, 2, 4 ,10, 13, 4, 6};
      quickSort(arr, arr.length);
      for(int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + ", ");
   }
}
