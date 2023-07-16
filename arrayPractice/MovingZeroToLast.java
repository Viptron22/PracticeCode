package arrayPractice;

import java.util.Arrays;

/*Write a java program to Move all zeroes to end of
array?
Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0};*/
public class MovingZeroToLast {
    public static void main(String[] args){
        int[] narr={1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println(Arrays.toString(movingZero(narr)));
    }

    public static int[] movingZero(int[] arr)
    {
        int lastindex= arr.length-1;
        int indexOfZero=0;
      //  int [] swappedArr = new int[0];
        while(indexOfZero<lastindex)
        {
            if(arr[indexOfZero]!=0) {
                indexOfZero++;
            }
               else if(arr[lastindex]==0){
                   lastindex--;
            }
                     else
                     {
                         swap(arr,indexOfZero,lastindex);
                     }

        }
           return arr;
    }

     public static void swap(int[] arr2,int zero,int last)
     {
         int temp=arr2[last];
         arr2[last]=arr2[zero];
         arr2[zero]=temp;

     }
}
