public class searching {
    public static int LinearSearch(int[]arr,int x){
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
         }
         return -1;
    }
    public static int BinSearch(int[]arr,int x){
        int n=arr.length;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[]arr={1,4,3,7,56,5,98};
        System.out.println(BinSearch(arr,7));
    }
}
