package arrayPractice.BinarySearch;

public class FindInMountainArray {
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak=findPeakElement(mountainArr);
        int leftIndex=binarySearch1(mountainArr,target,0,peak);
        if(leftIndex!=-1)
        {
            return leftIndex;
        }
        else
        {return binarySearch1(mountainArr,target,peak,mountainArr.length-1);
        }
    }

    public static  int findPeakElement(int[] mountainArr){
        int start=0;
        int end=mountainArr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1])
            {
                end=mid;
            }
            else if(mountainArr[mid]<mountainArr[mid+1])
            {
                start=mid+1;

            }
            else
                return mid;
        }

        return start;
    }

    public static  int bsearch(int[] mountainArr,int target,int start,int end){

        if(mountainArr.length<1)
        {
            return -1;
        }
            if(mountainArr.length==1&&target==mountainArr[0])
            {
                return 0;
            }
               else if(mountainArr.length==1)
            {
                return -1;
            }

        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>mountainArr[mid])
            {
                start=mid+1;
            }
            else if(target<mountainArr[mid])
            {
                end=mid-1;

            }
            else
                return mid;
        }

        return -1;
    }

    public static int binarySearch1(int[] arr,int target,int start,int end){
        int ret=-1;
        if(arr.length<1)
        {
            return -1;
        }
        if(arr.length==1&&target==arr[0])
        {
            return 0;
        }
        else if(arr.length==1)
        {
            return -1;
        }
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

    public static void main(String[] args){
        int[]test={1,5,2};
        int targ=2;
        System.out.println(findInMountainArray(targ,test));
    }
}
/*class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=findPeakElement(mountainArr);
        int leftIndex=bsearch(mountainArr,target,0,peak);
           if(leftIndex!=-1)
              {
                  return leftIndex;
              }
                else
                   {return bsearch(mountainArr,target,peak,mountainArr.length()-1);
                   }
    }

    public int findPeakElement(MountainArray mountainArr){
         int start=0;
         int end=mountainArr.length()-1;
           while(start<end)
           {
               int mid=start+(end-start)/2;
               if(mountainArr.get(mid)>mountainArr.get(mid+1))
                 {
                     end=mid;
                 }
                   else if(mountainArr.get(mid)<mountainArr.get(mid+1))
                      {
                          start=mid+1;

                      }
                         else
                              return mid;
           }

           return -1;
    }

     public int bsearch(MountainArray mountainArr,int target,int start,int end){

           while(start<=end)
           {
               int mid=start+(end-start)/2;
               if(target>mountainArr.get(mid))
                 {
                     start=mid+1;
                 }
                   else if(target<mountainArr.get(mid))
                      {
                          end=mid-1;

                      }
                         else
                              return mid;
           }

           return -1;
    }

    void main(String[] args){
        int []test={1,2,3,4,5,3,1};


        int targ=3;
        System.out.println(findInMountainArray(targ,(MountainArray)test));
    }
}*/