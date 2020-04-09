import java.util.*;


public class bubbleSort{

   public static int[] swap(int[] array,int a, int b){
      int temp = array[a];
      array[a] = array[b];
      array[b] = temp;
      return array;
   }


   public static void bubbleSort(int[] nums, int N){
      int flag = 1;
      int last = N-1;
      while (flag == 1){
         flag = 0;
         for(int i = 0; i <last;i++){
            if(nums[i] >nums[i+1]){
               nums = bubbleSort.swap(nums,i,i+1);
               flag = 1;
            }
         
         }
         last--;
      }
      //for(int j = 0; j <nums.length;j++)
      //   System.out.println(nums[j]);
   }


}
