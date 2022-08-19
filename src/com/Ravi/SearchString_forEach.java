package com.Ravi;
import java.util.*;
public class SearchString_forEach {
    public static void main(String[] args) {
       String str="manish";
       char target='a';
       SearchChar(str,target);
    }

    private static boolean SearchChar(String str, char target) {
        for(char ch :str.toCharArray()){
            if(target==ch){
                return true;
            }
        }
        return false;
    }
}
