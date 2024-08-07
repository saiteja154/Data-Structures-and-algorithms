package Subsequences;


import java.util.ArrayList;
import java.util.List;

//we need to print any one sub sequence with sum K and avoid future calls of the recurssion.
// we are making use of true / false before calling the function call.
public class PrintAnyOneSubSequenceHavingSumAsK {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int requiredSum=2;
        List<Integer> sub_Ans=new ArrayList<>();
        boolean ans=functionPrint(sub_Ans,0,n,requiredSum,0,arr);

    }
    static boolean functionPrint(List<Integer> sub_Ans,int index, int n,int requiredSum,int currentSum,int arr[]){

        if(index==n){
            if(requiredSum==currentSum){ //condition satisfied return true , if not return false.
                for(int i=0;i<sub_Ans.size();i++){
                    System.out.print(sub_Ans.get(i)+" ");
                }
                System.out.println();
                return true; // ************************** important statement .
            }
            return false;     // ************************** important statement .
        }

        sub_Ans.add(arr[index]);
        currentSum =currentSum+arr[index];

        if(functionPrint(sub_Ans,index+1,n,requiredSum,currentSum,arr)==true){  // ************************** important statement .
            return true;
        }


        currentSum=currentSum-arr[index];
        sub_Ans.remove(sub_Ans.size()-1);
       if( functionPrint(sub_Ans,index+1,n,requiredSum,currentSum,arr)==true){  // ************************** important statement .
           return true;
       }
    return false;  // ************************** important statement .
    }
}
