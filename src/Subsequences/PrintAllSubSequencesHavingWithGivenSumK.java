package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequencesHavingWithGivenSumK {
    //    List<List<Integer>> result=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int requiredSum=2;
        List<Integer> sub_Ans=new ArrayList<>();
        functionPrint(sub_Ans,0,n,requiredSum,0,arr);
    }
    static void functionPrint(List<Integer> sub_Ans,int index, int n,int requiredSum,int currentSum,int arr[]){

        if(index==n){
            if(requiredSum==currentSum){
                for(int i=0;i<sub_Ans.size();i++){
                    System.out.print(sub_Ans.get(i)+" ");
                }
                System.out.println();
            }
            return ;
        }
        // pick and add the sum and call the function.
        sub_Ans.add(arr[index]);
        currentSum =currentSum+arr[index];
        functionPrint(sub_Ans,index+1,n,requiredSum,currentSum,arr);
        // Don't pick and substract the sum and call the function.

        currentSum=currentSum-arr[index];
        sub_Ans.remove(sub_Ans.size()-1);
        functionPrint(sub_Ans,index+1,n,requiredSum,currentSum,arr);

    }
}


//  result.add(new ArrayList<>(sub_res));