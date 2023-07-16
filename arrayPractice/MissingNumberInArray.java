package arrayPractice;
/*Find the missing number in an array?
Approach
1. Calculate A = n (n+1)/2 where n is largest number in series 1...N.
2. Calculate B = Sum of all numbers in given series
3. Missing number = A – B
*/

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2,3, 4,5, 6, 8};
        System.out.println("Missing number is="+missingNumberFinder(numbers));
    }

    public static int maxNumberInArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        max = arr[arr.length - 1];
        return max;
    }

    public static int sumOfArray(int[] arra)
    {
        int sum=0;
        for(int i=0;i<arra.length;i++)
        {
            sum+=arra[i];
        }
        return sum;
    }
    public static int missingNumberFinder(int[] arr)
    {

        int n=maxNumberInArray(arr);
        int a=n*(n+1)/2;
        int b=sumOfArray(arr);
        return a-b;
    }
}
