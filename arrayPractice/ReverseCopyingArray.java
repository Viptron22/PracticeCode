package arrayPractice;

import java.util.Arrays;

public class ReverseCopyingArray {
    public static void main(String[] args){
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];
        System.out.println(Arrays.toString(a));
        for(int i=a.length-1,j=0;i>=0;i--,j++){
            b[j]=a[i];
        }System.out.println(Arrays.toString(b));
    }
}
