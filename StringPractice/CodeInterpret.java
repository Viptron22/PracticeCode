package StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeInterpret {
    public static String interpret(String command){
       String out="";
       for(int i=0;i<command.length();i++){
           if(command.contains("()"))
           {
               out=out+"o";

           }
           else if(command.contains("(al)"))
           {
               out=out+"al";

           }
           else if(command.contains("G"))
           {
               out=out+"G";

           }
       }



        return out;
    }

    public static void main(String[] args){
        System.out.println(interpret("G()(al)"));
        List<List<String>> twoDList = new ArrayList<>();

// Add elements to the 2D list
        twoDList.add(Arrays.asList("A", "B", "C"));
        twoDList.add(Arrays.asList("D", "E", "F"));
        twoDList.add(Arrays.asList("G", "H", "I"));
    }
}
