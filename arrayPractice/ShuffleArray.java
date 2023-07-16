package arrayPractice;

import java.util.Arrays;

public class ShuffleArray {

        public static int[] shuffle(int[] nums, int n) {
            int []temp=new int[nums.length];
            for(int i=0,j=0;i<temp.length&&j<n;i++,j++)
            {
                temp[i]=nums[j];
                temp[i+1]=nums[n+j];
                i++;
            }

            return temp;

        }
        public  static  void main(String[] args)
        {
            int[] arr={2,5,1,3,4,7};
            int n=arr.length/2;
            //before shuffle
            System.out.println(Arrays.toString(arr));
            //after shuffle
            System.out.println(Arrays.toString(shuffle(arr,n)));
        }
    }

