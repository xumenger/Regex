package lexical;

import java.util.Scanner;

public class TEST{
    //(a|b)(c|e) (a|b)*(c|e)
    @SuppressWarnings("resource")
    public static void main(String[] args){
        //(d(a|b)*c)|a
        RE re = new RE("(a|b)*|(c|e)");
        //匹配正则表达式
        while(true){
            System.out.println("RE: " + re.getRE());
            System.out.println(re.match(new Scanner(System.in).nextLine()));
        }
    }
}
