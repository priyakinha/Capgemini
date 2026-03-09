public class NextFrom15 {
    //min value from second half
    public static void Q16(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=n/2;i<n;i++){
          if(arr[i]<min){
            min=arr[i];
          }
        }
        System.out.println("Minimum from second half: "+min);
    }
    //max from first half
    public static void Q17(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<(n+1)/2;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max from first half: "+max);
    }
    //max value from second half
    public static void Q18(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=n/2;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max from second half: "+max);
    }
    //average from first half
    public static void Q19(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<(n+1)/2;i++){
            sum+=arr[i];
        }
        System.out.println("Average from first half: "+sum/((n+1)/2));
    }
   //average from second half 
    public static void Q20(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=n/2;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Average from second half: "+sum/(n/2));
    }
    //read all elements from array in reverse order
    public static void Q21(int[]arr){
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //read first half in reverse order
    public static void Q22(int[]arr){
        int n=arr.length;
        for(int i=((n+1)/2)-1;i>=0;i--){//made it right alligned
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //read second half in reverse direction
    public static void Q23(int[]arr){
        int n=arr.length;
        for(int i=n-1;i>=((n+1)/2);i--){//take more in right and less number in left
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //read only even indexed ele
    public static void Q24(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //read even index in reverse order
    public static void Q25(int[]arr){
        int n=arr.length;
        if(n%2==0){//bcz if length is even then index will be odd
            n-=1;
        }
        for(int i=n-1;i>=0;i-=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    //read only odd indexed array
    public static void Q26(int[]arr){
        for(int i=1;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    //read odd indexed in reverse order
    public static void Q27(int[]arr){
        int n=arr.length;
        if(n%2!=0){//odd elements than last idx will be even
            n=n-1;
        }
        for(int i=n-1;i>0;i-=2){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //find index of specified element from array
    public static void Q28(int[]arr,int x){
        int n=arr.length;
        for(int i=0;i<n;i++){
        if(arr[i]==x){
            System.out.println("Element found at index: "+i);
            break;
        }
        }
    }
    //swap two given indexed element from array
    public static void Q29(int[]arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }
    //Reverse the element of given array
    public static void Q30(int[]arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    public static void main(String[] args) {
        int[]arr={2,5,4,7,9,1,6};
        Q16(arr);
        Q17(arr);
        Q18(arr);
        Q19(arr);
        Q20(arr);
        Q21(arr);
        Q22(arr);
        Q23(arr);
        Q24(arr);
        Q25(arr);
        Q26(arr);
        Q27(arr);
        Q28(arr, 1);
        //Q29(arr,2,5);
        Q30(arr);

    }
}
