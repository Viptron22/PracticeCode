package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
      int []test={};
      insertionSort(test);
        System.out.println(Arrays.toString(test));
    }
      public static void insertionSort(int[] arr)
      {
           for(int i=0;i<arr.length-2;i++)
           {
               for (int j = i+1; j >0 ; j--) {
                     if(arr[j]<arr[j-1])
                     {
                           swap(arr,j-1,j);
                     }
                        else
                              break;
               }
           }
      }

      public static void swap(int[] sample,int firstIndex,int lastIndex)
      {
          int temp=sample[firstIndex];
          sample[firstIndex]=sample[lastIndex];
          sample[lastIndex]=temp;
      }
}
