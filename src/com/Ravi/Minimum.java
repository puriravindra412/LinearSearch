package com.Ravi;

public class Minimum {
    public static void main(String[] args) {
        int[] arr={18,12,-7,40,-1};
        System.out.println(minimum(arr));

    }

    private static int  minimum(int[] arr) {
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
}
