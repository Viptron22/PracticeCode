package loopPractice;
import java.util.*;
//code to print value upto given decimal places without rounding off the value
public class CordisCode {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double fx,sum=0;
        double roundOff;
        System.out.println("enter the value of x=");
        fx= sc.nextDouble();
        for(int i=1;i<=6;i++){

               sum=sum+(1/Math.pow(fx,i));

        }if(fx==2){
            roundOff=Math.floor(sum*10000)/10000;
            System.out.println("the sum for x=2 is "+ roundOff);
        }
           else{
               roundOff=Math.floor(sum*100000)/100000;
               System.out.println("the value of series for entered value x is "+roundOff);
        }
    }
}
//System.out.println( (int) (your_double * 10000) / 10000.0 );