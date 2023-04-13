package Recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=5;
        int n=2;
        int ans=sol(n,x);
        System.out.println(ans);
    }

    private static int sol(int n, int x) {
        if(n<0)
        {   n=-n;
            x=1/x;
        }
        if(n==0) return 1;
        if(n==1) return x;
        
        int res=sol(n/2,x);
        if(n%2==0)
             return res*res;
        else
            return res*res*x;     
    }     

    
}
