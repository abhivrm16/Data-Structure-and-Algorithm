package Recursion;

public class ArrayRecursivly {
    public static void main(String[] args) {
        int arr[]={3,1,0,7,5};
        print(arr,arr.length-1);
    }

    private static void print(int[] arr, int i) {
        if(i<0) return;
        System.out.println(arr[i]);
        print(arr, i-1);
    }
    
}
