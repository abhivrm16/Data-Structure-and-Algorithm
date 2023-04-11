package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        int fact=sol(n);
        System.out.println(fact);
    }

    private static int sol(int n) {
        if(n==0||n==1) return 1;
        else return n*sol(n-1);
    }
    
}
