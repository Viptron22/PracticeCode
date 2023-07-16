package arrayPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //2d arraylist
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<3;i++){
            //initializing new array list at index of list arr
            arr.add(new ArrayList<>());
            for(int j=0;j<3;j++){
             //adding values in the list present at index i of Array list arr
               arr.get(i).add(sc.nextInt());
                }
            }
        //displaying 2d arraylist using to string
        for(ArrayList<Integer> nrr:arr){
            for(Integer in:nrr){
                System.out.print(in+" ");
            }
            System.out.println();
        }

       }






    }

