package arrayPractice.BinarySearch;
//Q4 : First and Last Position in Sorted Array
import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int []arr={1,4,6,8,8,8,13,14,16,17,44,50,51,58,90,92};
        int [] narr=new int[arr.length];
        System.out.println(Arrays.toString(returnIndex(arr,8)));

    }

    public static int[] returnIndex(int[] arr,int target)
    {
        int[] ans={-1,-1};
        ans[0]=firstAndLastIndexFinder(arr,target,false);
        if(ans[0]!=-1) {
            ans[1] = firstAndLastIndexFinder(arr, target, true);
        }

        return ans;


    }

    public static int firstAndLastIndexFinder(int[] arr,int target,boolean cond){
        int ret=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {

            int middle=start+(end-start)/2;

            if(arr[start]<=arr[end])
            {
                if(arr[middle]>target){
                    end=middle-1;
                }
                else if(arr[middle]<target){
                    start=middle+1;

                }

                else{
                    ret=middle;
                     if(cond)
                     {
                         start=middle+1;

                     }
                       else
                     {
                         end=middle-1;
                     }

                }

            }

        }
        return ret;

    }
}
