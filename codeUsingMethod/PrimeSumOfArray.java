package codeUsingMethod;         //program to print sum of prime numbers in a input array,where input;n is array length,array elements
import java.util.*;              //this question is asked in rivature online assesement test
public class PrimeSumOfArray {
    static int primeSum(int arr[]){
        int sum=0,count=0;
        int prime[]=new int[arr.length];
        for(int i=0;i< arr.length;i++) {
            for (int j = 1; j <=arr[i]&&count<3;j++) {              //this loop will find the prime number in array and increment count value

              if(arr[i]%j==0){
                  ++count;
              }

            }if(count>=3){
             count=0  ; }                            //count should be 0 for every new traversal for array

             else{
                 sum=sum+arr[i];                     //sum wil count if value of count is less than 3 that is condition for the prime number
                 count=0;                            //count should be 0 for every new traversal for array
            }
        }
        return sum;
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0;

         System.out.println("enter the length of the array=");
         n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }

         sum=primeSum(arr);
         System.out.println(sum);
     }
}
