package loopPractice;
import java.util.*;
public class DigitOfnumber {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int number,r,count=0;
        System.out.println("enter the number;");
        number=sc.nextInt();
        while(number!=0){
            r=number%10;
            number=number/10;
            count++;
            System.out.println("the digit of number is:-"+r);
        }
            System.out.println("the number is a "+count+" digit number");
    }
}
