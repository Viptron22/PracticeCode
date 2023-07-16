package arrayPractice;

import java.util.Arrays;

//1389. Create Target Array in the Given Order
public class TargetArray1389 {
    public static int[] targetArray(int[] index,int[]nums)
    {
        int[] target=new int[index.length];
        int count=0;
//        for(int i=0,ind=index[i];i<target.length;i++){
//
//
//
//
//            target[ind]=nums[i];
//
//
//        }
//
        while(count<index.length){
            int i=index[count];
            target[i]=nums[count];
            count++;
            i++;

        }
        return target;
    }

    public static void main(String[] args) {
        int []arr1={0,1,2,3,4};
        int[] arr2={0,1,2,2,1};
        System.out.println(Arrays.toString(targetArray(arr1,arr2)));
    }
}
