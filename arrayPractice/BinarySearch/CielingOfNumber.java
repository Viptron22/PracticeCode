package arrayPractice.BinarySearch;

public class CielingOfNumber {
    public static void main(String[] args){
        int []arr={1,4,6,8,13,16,44,50,51,58,90,92};
        System.out.println(cieling(arr,5));
    }
    public static int cieling(int[] arr,int target){
        int ret=-1;
        int start=0;
        int end=arr.length-1;
        if(target>arr[arr.length-1])
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
                        else
                            ret=start;
                    }
            else if(arr[start]>=arr[end])
            {
                if(arr[middle]>target){
                    start=middle+1;
                }
                    else if(arr[middle]<target){
                        end=middle-1;

                    }
                        else {
                            ret=start;
                        }


            }
        }
        if(start>end)

          return start;
            else
                return ret;

    }
}
