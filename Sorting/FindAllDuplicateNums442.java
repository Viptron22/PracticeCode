package Sorting;

import java.util.ArrayList;
import java.util.List;

//leet code 442
class FindAllDuplicateNums442 {
    public static List<Integer> findDuplicate(int[] nums) {
        int i=0;
        List<Integer>ans=new ArrayList<>();
        while(i<nums.length){
            if(nums[i]!=i+1)
            {
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct])
                {
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }
                else if(!ans.contains(nums[i])) {
                    ans.add(nums[i]);
                i++;}
                    else i++;
            }
            else
                i++;
        }
        return ans;
    }


    public static void main(String[] args)
      {
          int[]test={4,3,2,7,8,2,3,1};
          System.out.println(findDuplicate(test));
      }

    
}