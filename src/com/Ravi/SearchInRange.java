package com.Ravi;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {


        Scanner in =new Scanner(System.in);
        int[] arr={10,19,22,8,9,4,20,4,5,6};
        int target= in.nextInt();
        int first=in.nextInt();
        int last=in.nextInt();

        System.out.println(SearchRange(arr, target, first, last) );
    }



    private static boolean SearchRange(int[] arr, int target, int first, int last) {
        int n=arr.length;
        if(n<first||n<last||n==0||first>last){
            return false;
        }
        for(int i=first;i<=last;i++){
            if(target==arr[i]){
                return true;
            }
        }
        return false;
    }


}
