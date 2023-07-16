package codeUsingMethod;
import java.util.*;
import java.util.Arrays;
public class MaxElementInArray {
    static int maxElement(int arr1[]){
        //Arrays.sort(arr1);                           //using inbuilt method of Array class
        //return arr1[arr1.length-1];
        int max=0;
        for(int x:arr1){
            if(x>max){
                max=x;
            }

        }

        return max;
        }
        public static void main(String[] args){
        int arr[]={1,4,7,8,20,50};
        int max=maxElement(arr);
        System.out.println("the max element in array is "+max);



    }
}
