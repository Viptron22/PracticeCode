package loopPractice;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0,b,c,n;
        System.out.println("enter the starting number of the fibonacci series and upto which you whant to print series");
        b=sc.nextInt();
        n=sc.nextInt();
        System.out.print("the fibonacci series is " +a+","+b);
        for(int i=1;i<=n;i++){
            c=a+b;
            if(c%2==0) {                                  //to print only even prime number
                System.out.print("," + c);
            }
            a=b;
            b=c;


        }
    }
}
