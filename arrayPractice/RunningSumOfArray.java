package arrayPractice;

import java.util.Arrays;

public class RunningSumOfArray {
    public static int[] runningSum(int[] nums) {
        int sum=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public  static void main(String[] arg)
    {
        int [] arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
