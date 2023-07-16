package arrayPractice.BinarySearch;

import java.util.Arrays;

public class BinarySearch1dArray {
    public static void main(String[] args){
       int []arr={56,46,34,23,22,22,22,22,14,15,10,8,4,1};
     //   int []arr={1,4,6,8,13,13,16,44,50,51,58,90,92};
        System.out.println(binarySearch1(arr,22));
    }
       public static int binarySearch1(int[] arr,int target){
        int ret=-1;
          int start=0;
          int end=arr.length-1;
            while(start<=end)
             {
                int middle=start+(end-start)/2;
                 if(arr[middle]==target){
                      ret=middle;
                    break;
                 }
                  if(arr[start]<=arr[end])
                  {
                      if(arr[middle]>target){
                          end=middle-1;
                      }
                        else if(arr[middle]<target){
                            start=middle+1;

                      }
                            else if(start!=target)
                            {
                            ret=-1;
                            }

                               else{
                                   ret=end;
                      }


                  }
                 else if(arr[start]>=arr[end])
                 {
                     if(arr[middle]>target){
                         start=middle+1;
                     }
                     else if(arr[middle]<target){
                         end=middle-1;

                     }
                     else
                         return middle;

                 }
                }
            return ret;

       }
}


