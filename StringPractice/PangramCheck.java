package StringPractice;

import java.util.Arrays;

public class PangramCheck {
    public static boolean checkIfPangram(String sentence) {
        int count=0;
        char[] arr= sentence.toCharArray();
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        for(int i=97;i<=122;i++)
        {
          int val=binarySearch(arr,i);
            if(val==-1)
                return false;

        }

        return true;
    }
    public static int binarySearch(char[]arr,int target)
    {
        int start=0;
        int end=arr.length-1;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                  if(target>(int)arr[mid]){
                      start=mid+1;
                  }
                      else if(target<(int)arr[mid]){
                            end=mid-1;
                  }
                        else
                            return mid;
            }
              return -1;
    }

    public static void main(String[] args)
    {
        String sen="leetcode";
        sen=sen.toLowerCase();
        System.out.println(checkIfPangram(sen));
    }
}
