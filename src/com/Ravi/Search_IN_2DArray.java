package com.Ravi;

import java.util.Arrays;
import java.util.Scanner;

public class Search_IN_2DArray {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] nums={11,13,15,17};

        System.out.println(findMin(nums) );
    }
//
//    private static int[] Search2D(int[][] arr, int target) {
//       int n=arr.length;
//        int[] ints = {-1, -1};
//       for(int i=0;i<n;i++){
//           for(int j=0;j<arr[i].length;j++){
//               if(arr[i][j]==target){
//                 ints[0]=i;
//                 ints[1]=j;
//                   return ints;
//               }
//           }
//       }
//       return ints;
//    }
public static int findMin(int[] nums) {
    int l=0;
    int h=nums.length-1;
    int left=minLeft(nums);
    int right =minRight(nums);
    if(left<right){
        return left;
    }
    return right;

}
    static int minRight(int[] nums) {
        int l=0;
        int  h=nums.length;
        int min=Integer.MAX_VALUE;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<=min){
                min=nums[mid];
                l=mid+1;
            }
            else if (nums[mid]>=min||nums[l]<nums[h]){
                h=mid-1;
            }else{
                l=mid+1;
            }

        }
        return min;
    }
    static int minLeft(int[] nums) {
        int l=0;
        int  h=nums.length;
        int min=Integer.MAX_VALUE;
        while(l<h){
            int mid=(l+h)/2;
            if(nums[mid]<=min){
                min=nums[mid];
                h=mid-1;
            }
            else if (nums[mid]>=min||nums[l]<nums[h]){
                h=mid-1;
            }else{
                l=mid+1;
            }

        }
        return min;
    }

}
