package codeUsingMethod;
import java.util.*;
public class FindingPrimeNumber {
    static void findPrime(int number){
        int count=0;
        for(int i=1;i<=number&&count<3;i++){
            if(number%i==0){
                count++;
            }
        }if(count<3){
            System.out.println("the number is prime");
        } else
            System.out.println("the number is not prime");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("enter the number:-");
        number=sc.nextInt();
        findPrime(number);
    }
}
