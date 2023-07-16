package arrayPractice.BinarySearch;
//Searching in sorted infinite array using binary search
public class SearchingInfiniteArray {
    public static void main(String[] args){
     int [] test={1,4,6,8,8,8,13,14,16,17,44,50,51,58,90,92};
        System.out.println(primeAns(test,16));
    }

    public static int primeAns(int []arr,int target){
        int start=0;
        int end=1;
        //reverse approach for binary,here we are increasing the search parameter by 2^n ,time complexity id logn
            while (target > arr[end]) {
                  int newStart=end+1;
                  end=end+(end-start+1)*2;
                  start=newStart;
            }
             return bsearch(arr,target,start,end);

    }
    public static int bsearch(int[] arr,int target,int start,int end){
        int ret=-1;
        while(start<=end){
              int middle=start+(end-start)/2;


            if (target < arr[middle]) {
                end=middle-1;
            }
                else if (target > arr[middle]) {
                    start=middle+1;

            }
                    else
                        return middle;

        }
        return ret;
    }
}
