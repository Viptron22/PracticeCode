package codeUsingMethod;
import java.util.*;
//to calculate area of different shapes using method overloading
public class OverloadedMethodForArea {
    static float area(float radius){
        //for calculating area of circle
        float area=3.14f*radius*radius;
        return area;
    }
    //method for calculating area of square
    static int area(int side){

        int area=side*side;
        return area;
    }
    //method for calculating area of rectangle
    static int area(int length,int breadth){
        int area=length*breadth;
        return area;
    }
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        int length,breadth,side,ch;
        float radius;
        System.out.println("Enter the choice:"+"\n 1.Find aea of circle.\n 2.Find area of square. \n 3.Find area of rectangle");
        ch=sc.nextInt();
        switch(ch){
            case 1: System.out.println("Enter the radius of the circle");
                      radius=sc.nextFloat();

                      System.out.println("the area of the circle is "+area(radius));
                      break;
            case 2: System.out.println("Enter the side of the square");
                     side=sc.nextInt();
                     System.out.println("the area of the square is "+area(side));
                     break;
            case 3:  System.out.println("Enter the length and breadth of the rectangle");
                     length=sc.nextInt();
                     breadth=sc.nextInt();
                     System.out.println("the area of the rectangle is "+area(length,breadth));
                     break;
            default : System.out.println("wrong choice entered");

        }


    }
}
