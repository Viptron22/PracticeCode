package Sorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int [] test={0};
        selectionSort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void selectionSort(int [] arr)
    {
        int max=0;
           for(int i=0;i<arr.length;i++)
           {
               int j;
               max=0;
               int maxIndex=0;
               for (j = 0; j <arr.length-i ; j++) {
                   if(arr[max]<arr[j])
                   {

                       max=j;
                   }


               }
               int temp=arr[j-1];
               arr[j-1]=arr[max];
               arr[max]=temp;


           }
    }
}
