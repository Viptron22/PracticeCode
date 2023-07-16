package loopPractice;
import java.util.*;
public class Power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String oc="";
        boolean is=true;
        int i=0,v=1;
        while(n!=0){
            while(v<n){
                v*=5;
                i++;
            }
            if(v>n){
                i--;
                v/=5;
            }
            if(oc.indexOf(i+"")==-1){
                n-=v;oc+=i+" ";
                i=0;v=1;
            }
            else{
                is=false; break;
            }
        }
        if(is)
            System.out.println("passed");
        else
            System.out.println("failed");
    }
}
