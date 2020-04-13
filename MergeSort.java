public class MergeSort{
   public static void mergeSort (int[] list, int N) { 

      mergeSort(list, 0, N-1); 
}



   private static void mergeSort (int[] list, int first, int last)  { 
      if (first < last) { 
         int middle = (first + last)/2;
         mergeSort(list, first, middle);
         mergeSort(list, middle+1, last);
         mergeSortedHalves (list, first, middle, last); //supporting method for merging two halves
       }
   }
   private static void mergeSortedHalves (int[] arr, int left, int middle, int right){
      int[] temp = new int[right-left+1];
      int index1 = left;
      int index2 = middle+1;
      int index = 0;
      System.out.println("l"+left);
      System.out.println("m"+middle);
      System.out.println("r"+right);
      
      while((index1 <= middle) && (index2 <=right)){
         if(arr[index1] <= arr[index2]) {
            System.out.println(index1);
            temp[index] = arr[index1];
            index1++;
            index++;
         }
         else{
            temp[index] = arr[index2];
            index2++;
            index++;
         }
         //System.out.print(temp[0]);
      }
      while(index1 <= middle){
         System.out.println("test1");
         temp[index] = arr[index1];
//         arr[index] = temp[index1];
         index++;
         index1++;
         
      }
      while(index2<=right){
         System.out.println("test2");
         temp[index] = arr[index2];
         index++;
         index2++;
     }    
     
     int tIndex = 0;
     for(int j = left; j <= right; j++){
        arr[j] = temp[tIndex];
        tIndex++;
       //  System.out.print(temp[j]);
      }
   }


}
