package arrayPractice;

public class linearSearchString {
    public static void main(String[] args){
        String input="vidyadhar";
        char target='v';
        System.out.println(searchChar(input,target));
    }

    static boolean searchChar(String str,char target){
        boolean result=false;
        for(char ch:str.toCharArray()){
            if(ch==target){
                result =true;
                break;
            }

                else
                    result=false;
        }
    return result;
    }
}
