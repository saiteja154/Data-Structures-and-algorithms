import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        System.out.println("Enter N value");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x= maxValue(n,arr,0,0);
        System.out.println(x);
    }

    static int maxValue(int n ,int arr[] ,int currentSum,int index){

        if(index>(n-1)){
            return currentSum;
        }


      return Math.max( maxValue(n,arr,currentSum+arr[index],index+2), maxValue(n,arr,currentSum,index+1));
    }






















      /*int n=3;
        int arr[][]=new int[n][n];
        System.out.println("Enter the "+n*n+" Values ");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sortedArray[]=new int[n*n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sortedArray[k]=arr[i][j];
                k++;
            }
        }
        Arrays.sort(sortedArray);
        k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sortedArray[k];
                k++;
            }
        }


        System.out.println("Values in the Matrix are below");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/


}



