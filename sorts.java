//selection sort

import java.util.*;

class sorts{

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
   //   for(int j = 0; j <= N-1; j++)
     //    System.out.print(arr[j] + ",");
   }
   
   public static void bubbleSort(int[] nums, int N){
      int flag = 1;
      int last = N-1;
      while (flag == 1){
         flag = 0;
         for(int i = 0; i <last;i++){
            if(nums[i] >nums[i+1]){
               nums = swap(nums,i,i+1);
               flag = 1;
            }
         
         }
         last--;
      }
      //for(int j = 0; j <nums.length;j++)
      //   System.out.println(nums[j]);
   }

   public static void quickSort(int[] list, int N) { quickSort(list, 0 , N-1); }

   private static void quickSort(int[] list, int first, int last)
   {
      if(first<last)
      {
         setPivotToEnd(list, first, last);
         int pivotIndex = splitList(list, first, last);
         quickSort(list, first, pivotIndex - 1);
         quickSort(list, pivotIndex+1, last);
      }
   }

   private static void setPivotToEnd(int[] arr, int left, int right)
   {
      int center = (right + left)/2;
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
      while(indexL <= indexR)
      {
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
      swap(arr, indexL, right);
      return indexL;

   }



}
