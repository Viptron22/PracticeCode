package arrayPractice;
//using for each loop
public class MaxElementInArray {
    public static void main(String[] args){
        int A[]={10,20,3,2,1};
        int max=0;

        for(int x:A){
            if(x>max){
                max=x;
            }else
                continue;
        }System.out.println("the max element is "+max);

    }
}
