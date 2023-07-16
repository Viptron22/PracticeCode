package arrayPractice;

import java.util.Arrays;

//deleting an element from a given index make sure the index is valid
public class DeletingElementOfArray {
public static void main(String[] args){
    int a[]=new int[]{1,2,3,4,5,0,0,0,0};


    int e=2,n=5;
//    for(int x:a){
//        System.out.print(x+",");                  //to print array we can use Arrays.toString(arrayname);
//    }
    System.out.println(Arrays.toString(a));
System.out.println("array after deleting element");
    for(int i=1;i<n;i++){//i=1 here 1 is the index of the element user want to delete
        a[i]=a[i+1];
    }
    for(int x:a){
        System.out.print(x+",");
    }
}
}
