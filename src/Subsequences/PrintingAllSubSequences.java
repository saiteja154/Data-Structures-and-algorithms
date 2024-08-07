package Subsequences;

import java.util.ArrayList;
import java.util.List;

public class PrintingAllSubSequences {
       //static List<List<Integer>> finalAns;
    public static void main(String[] args) {
        int arr[]={3,1,2};
        int n=arr.length;
        List<Integer> result=new ArrayList<>();
       // finalAns=new ArrayList<>();
        functionPrint(0,arr,n,result);
    }


    private static void functionPrint(int index,int arr[],int n,List<Integer> result){
        if(index==n){
           // finalAns.add(result);
            System.out.print("{");
            for(int i=0;i<result.size();i++){
                System.out.print(result.get(i)+" ");
            }
            System.out.println("}");
            return;
        }

        result.add(arr[index]);
        functionPrint(index+1,arr,n,result);
        result.remove(result.size()-1);
        functionPrint(index+1,arr,n,result);

    }
}
