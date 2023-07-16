package Sorting;
//leet code 287
class FindDuplicateNums287 {
    public static int findDuplicate(int[] nums) {
        int i=0;
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
                       else
                           return nums[i];
             }
                else
                     i++;
        }
          return -1;
    }

    public static void main(String[] args)
      {
          int[]test={5,4,6,7,9,3,10,9,5,6};
          System.out.println(findDuplicate(test));
      }

    
}