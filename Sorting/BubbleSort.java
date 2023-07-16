package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []test={-1,0,-5,4,7};
        bubbleSortDesc(test);
        System.out.println(Arrays.toString(test));
    }
    //sorting in ascending
    public static void bubbleSort(int [] arr){
        boolean swapped=false;
        //i is number of comparisons
        for (int i = 0; i <arr.length-1 ; i++) {
            //j is number of swaps
              for(int j=1;j<arr.length-i;j++)
              {
                  if (arr[j] < arr[j-1]) {
                      int temp=arr[j];
                      arr[j]=arr[j-1];
                      arr[j-1]=temp;
                      swapped=true;
                  }

              }
              //to break the loop if array is already sorted
              if (!swapped)
              {
                  break;
              }

        }
    }

    //sorting in descending
    public static void bubbleSortDesc(int[] arr){
         boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
               if(!swapped)
               {
                   break;
               }

        }
    }
}

