package Recursion;
import java.util.*;
/* 
Recursive program to find all Indices of a Number
Difficulty Level : Medium
Last Updated : 30 Nov, 2021
Read
Discuss
Courses
Practice
Video

Given an array arr of size N and an integer X. The task is to find all the indices of the integer X in the array
Examples: 
 

Input: arr = {1, 2, 3, 2, 2, 5}, X = 2 
Output: 1 3 4 
Element 2 is present at indices 1, 3, 4 (0 based indexing)
Input: arr[] = {7, 7, 7}, X = 7 
Output: 0 1 2 
 */

public class All_Indices_Of_Array {
    public static void main(String[] args) {
        int arr[]={15,11,40,4,4,9};
        int num=4;
        int ans[]=findArrIndex(arr,0,num,0);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findArrIndex(int[] arr, int i, int num,int fsf) {

        if(i==arr.length) 
           return new int[fsf];

         if(arr[i]==num){
           int iarr[]=findArrIndex(arr, i+1, num, fsf+1);
            iarr[fsf]=i;
            return iarr;
         }
         else{
            int iarr[]=findArrIndex(arr, i+1, num, fsf);
            return iarr;
         }  
   

    }
}
