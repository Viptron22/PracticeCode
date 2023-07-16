package arrayPractice;

import java.util.Arrays;

public class MaxIn2dArray {
    public static void main(String[] args){
        int [][] arr={
                {1,2,4},
                {-6,4,8},
                {2,1,9}
        };
        System.out.println(Arrays.toString(maxLinearSearch2d(arr)));
    }

    public static int[] maxLinearSearch2d(int[] []arr){
        int minimum=Integer.MIN_VALUE;
        int[]ret=new int[3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>minimum){
                    minimum=arr[i][j];
                    ret[0]=i;
                    ret[1]=j;
                    ret[2]=minimum;
                }}

        }
        return ret;
    }
}
