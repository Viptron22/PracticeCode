package arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swapp {
    public static void main(String[] args){
     int [] arrayTest={1,2,4,5,68,22};
     //before swap
        System.out.println(Arrays.toString(arrayTest));
        //after swap
          swap(arrayTest,1,5);
        System.out.println(Arrays.toString(arrayTest));
        //reverse array
        reverseArray(arrayTest);
        System.out.println("Reversed array of"+Arrays.toString(arrayTest));
    }

    //reverse an array
    static void reverseArray(int[]arr){
        int start=0;
        int end= arr.length-1;
        while(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr,int start,int end){
       int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;


    }

}
