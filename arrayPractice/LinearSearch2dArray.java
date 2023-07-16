package arrayPractice;

import java.util.Arrays;

public class LinearSearch2dArray {
    public static void main(String[] args){
      int [][] arr={
              {1,2,4},
              {-6,4,8},
              {9,9,9}
                    };
        System.out.println(Arrays.toString(search2dArray(arr,-6)));
    }

    public static int[] search2dArray(int[] []arr,int target){
        int elementIndex=-1;
        int[]ret=new int[2];
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                elementIndex=i;
                ret[0]=i;
                ret[1]=j;
            }}

        }
        return ret;
    }
}
