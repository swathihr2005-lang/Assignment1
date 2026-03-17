
package module9;
import java.util.*;
public class GenerateParentheses {


    public static void main(String[] args) {

        int n = 3;

        List<String> result = new ArrayList<>();

        generate("",0,0,n,result);

        System.out.println(result);
    }

    static void generate(String s,int open,int close,int n,List<String> result){

        if(s.length()==2*n){
            result.add(s);
            return;
        }

        if(open<n)
            generate(s+"(",open+1,close,n,result);

        if(close<open)
            generate(s+")",open,close+1,n,result);
    }
}

