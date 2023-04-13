package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

/*Get Subsequence
Easy  Prev   Next
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format

Sample Input
abc
Sample Output
[, c, b, bc, a, ac, ab, abc]

*/

public class GetSubsequence {
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> ss=gss(str);
        System.out.println(ss);
        
    }

    private static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> ans=new ArrayList<>();
            ans.add("");
            return ans;
        }
        
        char ch=str.charAt(0);
        String ss=str.substring(1);

        ArrayList<String> res=gss(ss);
        ArrayList<String> ans=new ArrayList<>();

        for(String s:res)
        {
            ans.add(""+s);
            ans.add(ch+s);

        }
        return ans;
    }
}
       
//         ArrayList<String> ss = gss(str);
//         System.out.println(ss);
//     }

//     public static ArrayList<String> gss(String str) {
//         if(str.length() == 0){
//             ArrayList<String> bres = new ArrayList<>();
//             bres.add("");
//             return bres;
//         }

//         char ch = str.charAt(0);
//         String ros = str.substring(1);

//         ArrayList<String> rres = gss(ros);
//         ArrayList<String> mres = new ArrayList<>();

//         for(String rstr: rres){
//             mres.add(rstr);
//         }

//         for(String rstr: rres){
//             mres.add(ch + rstr);
//         }
//         return mres;
//     }
// }


                        


                        


                        


                        


                        


                 