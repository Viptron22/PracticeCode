package arrayPractice;

import java.util.Arrays;

//copy elemnt of smaller array to bigger array,refer old to new array,make new array null
public class IncreasingSizeOfArray {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        System.out.println("length of array before increasing size "+a.length);
        int[] b=new int[2*a.length];//creating array of size double of array of which size is to increase
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        a=b;
        b=null;
        System.out.println("size of array a after increasing size "+a.length);
    }
}
