package loopPractice;

import java.util.*;
public class Code{

    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        long number,sum=0;
        int i=0;
        System.out.println("enter the number-");
        number=sc.nextInt();
        for(i=0;i<=number;i++){
            sum=(long)(sum+Math.pow(5,i)*1);

           if(sum==number){
               break;
           }else{

           }

        }
        if(sum==number){
            System.out.println(sum);
            System.out.println("PASSED");


        }
        else{
            System.out.println(sum);
            System.out.println("failed");
        }
    }
}


