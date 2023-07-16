package loopPractice;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,revNumber=0,r;
        System.out.println("enter the number:-");
        number =sc.nextInt();
        int m=number;
        while(number!=0){
            r=number%10;
            revNumber=revNumber*10+r;
            number=number/10;
        }

             if(revNumber==m){
                 System.out.println("it is a palindrome");
             }
                else{
                    System.out.println("it is not a palindrome");
             }
    }
}
