package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class CountTheNoofSubSequencesWithSumOfK {


    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int requiredSum=2;
        int ans=functionPrint(0,n,requiredSum,0,arr);
        System.out.println("Total Number of sub sequences with sum K "+ans);
    }

    static int functionPrint(int index, int n,int requiredSum,int currentSum,int arr[]){

        if(index==n){
            if(requiredSum==currentSum){ //condition satisfied return 1 else return 0.
                return 1;
            }
            return 0;
        }
       //count left and right and return total count.

       currentSum =currentSum+arr[index];
       int left= functionPrint(index+1,n,requiredSum,currentSum,arr);

       currentSum=currentSum-arr[index];
       int right= functionPrint(index+1,n,requiredSum,currentSum,arr);
       return left+right;

    }

}
