public class NextFrom30 {
    //Reverse first half of array
    public static void Q31(int[]arr){
       int n=arr.length;
       for(int i=0;i<n/4;i++){//because reverse half of first half
        int temp=arr[i];
        arr[i]=arr[(n/2)-i-1];
        arr[(n/2)-i-1]=temp;
       }
    }
    //reverse only last half of array
    public static void Q32(int[]arr){
        int n=arr.length;
        int start = n / 2;
        int end = n - 1;

    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    }
    //reverse even index of array
    public static void Q33(int[]arr){
        int n=arr.length;
        int s=0;
         int e=n-1;
        if(n%2==0){//bcz last index will be odd
            e=e-1;
        }
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s+=2;
            e-=2;
        }
    }
    //reverse only odd index ele of array
    public static void Q34(int[]arr){
        int n=arr.length;
        int s=1;
        int e=n-1;
        if(n%2!=0){//bcz odd ele than last idx will be even
            e=e-1;
        }
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s+=2;
            e-=2;
        }
    }
    //Swap odd inx ele with its immediate next even idx ele
    public static void Q35(int[]arr){//using 2 pointer approach but can also solve with simple for loop
        int n=arr.length;
        int ev=0;
        int od=1;
        while(ev<n && od<n){
        int temp=arr[ev];
        arr[ev]=arr[od];
        arr[od]=temp;
        ev+=2;
        od+=2;
    }
    }
    //Do right shift by 1 of given array elements(clockwise rotation by 1 and assign 0 to first)
    public static void Q36(int[]arr){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
           arr[i+1]=arr[i];
        }
        arr[0]=0;
    }
    //Do right shift by 2 of given array elements(general)
    public static void Q37(int[]arr){//Q38
        int n=arr.length;
        int k=2;
        for(int i=n-k;i<n;i++){
            arr[i]=0;
        } 
        swap(arr,0,n-k-1);
        swap(arr,0,n-1);
    }
    //Do left shift by one ele of given array(remove first ele andassign 0 to last)
    public static void Q39(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=0;
    }
    //Do left shift by 2 ele(general)
    public static void Q40(int[]arr){//Q41
        int n=arr.length;
        int k=2;
         for(int i=0;i<k;i++){
            arr[i]=0;
         }
         swap(arr,k,n-1);
         swap(arr,0,n-1);
    }
    //Do right rotate of 1 for ele of given array------>Q42-Q47

    //rotate first half of elements by one
    public static void Q48(int[]arr){
        int n=arr.length;
        int half=n/2;
        int k=1%half;
        swap(arr,0,half-k-1);
        swap(arr,half-k,half-1);
        swap(arr,0,half-1);

    }
    //rotate 2nd half of ele by 1
    public static void Q49(int[]arr){
        int n=arr.length;
        int start=n/2;
        int len2=n-start;
        int k=1%len2;
        swap(arr,start,n-k-1);
        swap(arr, n - k, n - 1);
        swap(arr, start, n - 1);
    }
    //rotate first halfof ele by 1 and second half by 1 seperately
    public static void Q50(int[]arr){
        int n=arr.length;
        int mid=n/2;
        int len2=n-mid;
        int k1=1%mid;
        int k2=1%len2;
        swap(arr,0,mid-k1-1);
        swap(arr,mid-k1,mid-1);
        swap(arr,0,mid-1);

        swap(arr,mid,n-k2-1);
        swap(arr,n-k2,n-1);
        swap(arr,mid,n-1);
    }
    public static void swap(int[]arr,int s,int e){
        while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
    }
    }
    public static void display(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={2,5,3,8,6,9};
        Q40(arr);
        display(arr);
    }
}
