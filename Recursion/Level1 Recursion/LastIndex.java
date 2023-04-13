package Recursion;

public class LastIndex {
    public static void main(String[] args) {
        int arr[]={4,9,0,5,5,5,5,5};
        int lastindex=LastIndex(arr,arr.length-1,5);
        System.out.println(lastindex);
    }

    private static int LastIndex(int[] arr, int i, int num) {
        if(i<0)return -1;

        if(arr[i]==num) return i;
        else{
            int liisa=LastIndex(arr,i-1, num);
            return liisa;
        }

    }
}
