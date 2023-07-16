package loopPractice;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number,uptoNumber;
        System.out.println("enter the number whose multiplication table to print and the till upto:-");
        number=sc.nextInt();uptoNumber=sc.nextInt();
        for(int i=1;i<=uptoNumber;i++){
            System.out.println("4 x "+i+"="+number*i);



        }
        sc.close();
//        int j=1;
//        for(;j<10;j++){                         easy code to print odd numbers
//            System.out.println(j);
//            j++;
        }

    }

