package Recursion;

public class MaxOfAnArray {
    static int max=0;
    public static void main(String[] args) {
        int arr[]={3,1,0,7,5};
        int num=Finbmax(arr,0);
        System.out.println(num);

    }
    private static int Finbmax(int[] arr, int i) {
        if(i==arr.length-1) return arr[arr.length-1];

         max=Math.max(arr[i], Finbmax(arr, i+1));

         return max;
    }
}