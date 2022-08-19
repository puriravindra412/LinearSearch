package com.Ravi;

import java.util.Scanner;
public class LinearSearch_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str="ravindra puri ";
        char target = in.next().charAt(0);
        System.out.println(Search(str,target));
    }

    private static boolean Search(String str, char target) {
        int n =str.length();
        if(n==0){
            return false;
        }
        for(int i=0;i<n;i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

