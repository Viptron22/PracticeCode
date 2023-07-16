package arrayPractice.BinarySearch;

public class FloorOfNumberInArray {
      public static void main(String[] args)
      {
          int []arr={1,4,6,8,13,16,44,50,51,58,90,92};
          System.out.println(floorOfNumber(arr,5));
      }
           public static int floorOfNumber(int arr[],int target)
           {
               int ret=-1;
               int start=0;
               int end=arr.length-1;
               int middle=0;
                   while(start<=end)
                   {
                       middle=start+(end-start)/2;
                         if(arr[middle]==target)
                         {
                             ret=middle;
                             break;
                         }
                           else if(arr[start]<=arr[end])
                            {
                             if(arr[middle]>target)
                             {
                                 end=middle-1;

                             }
                                else
                                    start=middle+1;
                            }
                         else if(arr[start]>=arr[end])
                         {
                             if(arr[middle]>target)
                             {
                                 start=middle+1;

                             }
                             else
                                 end=middle-1;
                         }
                           else
                               ret=start;
                   }
                   if(start>end)
               return end;
                   else
                       return ret;
           }
}
