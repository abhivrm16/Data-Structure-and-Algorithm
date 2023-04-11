package Recursion;

public class FirstIndex {
    static int index=-1;
    public static void main(String[] args) {
        int arr[]={4,9,0,5,5,5,5,5};
        int n=5;
        int findIndex=FindIndex(arr,0,n);
        System.out.println(findIndex);
    }

    private static int FindIndex(int[] arr, int i,int num) {
        if(i==arr.length) return -1;
        
        
        if(arr[i]==num) {
            return i;
        }

        else {
            int fiisma=FindIndex(arr, i+1, num);
            return fiisma;
        }

    }
    
}
