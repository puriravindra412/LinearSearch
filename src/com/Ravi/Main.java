package com.Ravi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int target = in.nextInt();
        int[] arr= {10,28,9,4,5,6,11,29,19};
        System.out.println(LinearSearch(arr,target));

    }

    private static int LinearSearch(int[] arr, int target) {
        int n =arr.length;
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}