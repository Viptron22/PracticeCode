package arrayPractice;

import java.util.Arrays;

public class MinElementInArray {
    public static void main(String[] ar){
     int[]arr={4,7,-1,9,0};
     System.out.println(Arrays.toString(linearSearchMinimum(arr)));
    }
    public static int[] linearSearchMinimum(int arr[]){
        int minium=Integer.MAX_VALUE;
         int[]ret=new int[2];
          for(int i=0;i<arr.length;i++){
              if(arr[i]<minium)
                {
                 minium=arr[i];
                 ret[0]=i;
                 ret[1]=minium;
                }


          }
          return ret;

    }
}
