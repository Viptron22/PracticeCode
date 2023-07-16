package loopPractice;
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,temp;
        int r,sum=0;
        System.out.println("enter the number:-");
        number=sc.nextInt();
        temp=number;

        while(temp!=0){
            r=temp%10;
            temp=temp/10;
            sum=sum+(int)Math.pow(r,3);
        }
        if(sum==number){
            System.out.println("it is a armstrong number");


        }else{
            System.out.println("it is not a armstrong number");
        }
    }
}
