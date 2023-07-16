package arrayPractice.BinarySearch;
//852. Peak Index in a Mountain Array
public class PeakValueInBitonicArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int middle=start+(end-start)/2;
            if(arr[middle]>arr[middle+1]){
                end=middle;
            }
            else if(arr[middle]<arr[middle+1])
            {
                start=middle+1;
            }

            else
                return middle;
        }
        return start;
    }

    public static void main(String[] args){
        int[] test={0,2,3,1,0};
        System.out.println(peakIndexInMountainArray(test));
    }
}
