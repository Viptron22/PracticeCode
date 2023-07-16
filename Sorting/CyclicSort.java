package Sorting;

import java.util.Arrays;

//use for 1-n range is given
public class CyclicSort {
    public static void main(String[] args) {
        int[]test={5,2,0,3,4};
        cycleSort(test);
        System.out.println(Arrays.toString(test));
    }
    public static void cycleSort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int valueIndex=arr[i]==0?0:arr[i]-1;


              if(arr[i]==arr[valueIndex])
              {
                  i++;
              }
                 else
              {
                     swap(arr,i,valueIndex);
              }
        }
    }

    public static void swap(int[]ar,int first,int second)
    {
        int temp=ar[first];
        ar[first]=ar[second];
        ar[second]=temp;
    }
}
