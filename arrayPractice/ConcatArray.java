package arrayPractice;

import java.util.Arrays;

public class ConcatArray {
    public static void main(String[] args) {
      int [] ar={1,2,1};
        System.out.println(Arrays.toString(getConactinaiton(ar)));
    }
     public static int[] getConactinaiton(int[] arr){
        String str=(Arrays.toString(arr).concat(Arrays.toString(arr)));
         int []ans= new int[]{Integer.parseInt(str)};
         return ans;
      }
}
