import java.util.Scanner;

import javax.print.DocFlavor.READER;
public class Practice {

    public static void pairs(int[]arr,int k){
        int n = arr.length;
         for(int i=0;i<arr.length;i++){
           boolean duplicate=false;
           for(int x=0;x<i;x++){
             if(arr[i]==arr[x]){
                duplicate=true;
                break;
             }
           }
            if (duplicate) continue;
            for (int j = i + 1; j<n; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + "," + arr[j]);
                    break; // avoid repeating same pair
                }
            }
         }
    }



    public static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array");
        int n=sc.nextInt();
        int[]arr1=new int[n];
        System.out.println("Enter elements of 1st array");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter sum you want: ");
        int k=sc.nextInt();
        // System.out.println("Enter size of 2nd array");
        // int n2=sc.nextInt();
        // int[]arr2=new int[n2];
        // System.out.println("Enter elements of 2nd array");
        // for(int i=0;i<n2;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // if(arr1.length!=arr2.length){
        //     System.out.println("Not identical");
        // }
        // else{
        //     for(int i=0;i<arr1.length;i++){
        //         if(arr1[i]!=arr2[i]){
        //             System.out.println("Not identical");
        //             break;
        //         }
        //     }
        //     System.out.println("Identical");
        // }

        //reverse

        // for(int i=0;i<n/2;i++){
        //     int temp=arr1[i];
        //     arr1[i]=arr1[n-i-1];
        //     arr1[n-i-1]=temp;
        // }
        // display(arr1);

    }
}
