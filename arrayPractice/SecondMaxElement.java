package arrayPractice;

public class SecondMaxElement {
    public static void main(String[] args){
        int A[]={30,40,50,10,80};
        int B[]=new int[5];
        int max1=0,max2=0;
        for(int x:A){
            if(x>max1){
                max2=max1;
                max1=x;
            }else {
                continue;
            }

        }System.out.println("the first max element and the the second max element is "+max1+","+max2);


    }
}
