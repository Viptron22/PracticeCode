package Sorting;

import java.util.ArrayList;
import java.util.List;

class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result=new ArrayList<>();

          int i=0;
            while(i<nums.length)
               {
                   int correc=nums[i]-1;
                    if(nums[i]!=nums[correc])
                       {
                            swap(nums,i,nums[i]-1);
                       }
                          else
                             i++;
               }

               for(int index=0;index<nums.length;index++)
                 {
                     if(nums[index]!=index+1)
                       {
                           result.add(index+1);
                       }
                 }
             return result;
                
    }
     public static void swap(int[]ar,int first,int second)
    {
        int temp=ar[first];
        ar[first]=ar[second];
        ar[second]=temp;
    }

    public static void main(String[]args)
       {
           int[]test={4,3,2,7,8,2,3,1};
           System.out.println(findDisappearedNumbers(test));
       }
}