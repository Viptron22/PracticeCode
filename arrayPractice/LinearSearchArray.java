package arrayPractice;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,-1,26};
        System.out.println("Enter element to search:-");
        int element=sc.nextInt();
        System.out.println("Element present at index:"+searchArray(arr,element));
        //searching element in range
        System.out.println("Element present at index"+searchArrayInRange(arr,element,1,3));

    }
    public static int searchArray(int[] arr,int target){
        int elementIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                elementIndex=i;
            }

        }
        return elementIndex;
    }

    public static int searchArrayInRange(int[]arr,int target,int start,int end){
        int elementIndex=-1;

        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                elementIndex=i;
            }

        }
        return elementIndex;
    }
}
