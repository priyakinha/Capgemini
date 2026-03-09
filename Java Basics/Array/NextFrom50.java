import java.util.*;
public class NextFrom50 {
    //remove specified indexed element from array
    public static void Q51(int[]arr){
        int n=arr.length;
        int k=2;
        if (arr == null || arr.length == 0) {
        System.out.println("Array is empty or null");
        return;
        }
        if(k<0 || k>=n-1){
            System.out.println("Invalid index");
            return;
        }
        for(int i=k;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=0;
    }

    //update specified index element with new element from given array
    public static void Q52(int[]arr,int idx,int newele){
        if (arr == null || arr.length == 0) {//bcz null will not point to anything and if len 0 means we cant store anything
        System.out.println("Array is null or empty");
        return;
    }
        int n=arr.length;
        if (idx < 0 || idx >= n) {
        System.out.println("Invalid index");
        return;
    }
        arr[idx]=newele;
    }

    //remove all occurence of specified element from given array
    public static void Q53(int[]arr,int ele){
        int n=arr.length;
        int idx=0;
        for(int i=0;i<n;i++){
          if(arr[i]!=ele){
            arr[idx++]=arr[i];
          }
        }
        while(idx<n){
            arr[idx++]=0;
        }
    }

    //remove range of elements from the given array
    public static void Q54(int[]arr,int s,int e){
        int n=arr.length;
        int count=e-s+1;
        for(int i=s;i+count<n;i++){
            arr[i]=arr[i+count];
        }
        for(int i=n-count;i<n;i++){
            arr[i]=0;
        }
    }
    
    //remove all odd indexed element from the array
    public static void Q55(int[]arr){
        int n=arr.length;
        int idx=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[idx++]=arr[i];
            }
        }
        while(idx<n){
            arr[idx++]=0;
        }
    }

    //remove all even indexed element from given array
    public static void Q56(int[]arr){
        int n=arr.length;
        int idx=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                arr[idx++]=arr[i];
            }
        }
        while(idx<n){
            arr[idx++]=0;
        }
    }

    //remove the duplicates from the array
    public static void Q57(int[]arr){
        int n=arr.length;
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int[] arr1 = new int[set.size()];
        int i = 0;
        for (int x : set) {
            arr1[i++] = x;
        }

        System.out.println(Arrays.toString(arr1));
    }

    //find out missed element from given array between min and max element
    public static void Q58(int[]arr){
        HashSet<Integer>set=new HashSet<>();
        int min=arr[0];
        int max=arr[0];
        for(int x:arr){
            set.add(x);
            min=Math.min(x,min);
            max=Math.max(x,max);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }
        }
    }

    //remove elements of one array from another array
    public static void Q59(int[]arr1,int[]arr2){
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr2){
            set.add(x);
        }
        for(int x: arr1){
            if(set.contains(x)){
                set.remove(x);
            }
        }
     int[]arr=new int[set.size()];
     int idx=0;
     for(int x:set){
        arr[idx++]=x;
     }
     System.out.println(Arrays.toString(arr));//so that print the whole array
    }

    //retain one array elements in another array
    public static void Q60(int[]arr1,int[]arr2){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:arr1){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        ArrayList<Integer>arr=new ArrayList<>();
        for(int x:arr2){
            if(map.containsKey(x) &&map.get(x)>0){
                arr.add(x);
                map.put(x,map.get(x)-1);
            }
        }
        System.out.println(arr);
    }

    //common elements from 2 arrays
    public static void Q61(int[]arr1,int[]arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr1) {
            set.add(x);
        }
        HashSet<Integer> result = new HashSet<>();
        for (int x : arr2) {
        if (set.contains(x)) {
            result.add(x);
        }
        }
       System.out.println(result);
    }

    //find uncommon elements from 2 arrays
    public static void Q62(int[]arr1,int[]arr2){
        HashSet<Integer>set=new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
        HashSet<Integer>res=new HashSet<>();
        for(int x:arr2){
            if(!set.contains(x)){
                res.add(x);
            }else{
                set.remove(x);//so that at the end set will have uncommon ele only
            }
        }
        res.addAll(set);
        System.out.println(res);    
    }

    //combine 2 arrays and develop a third array
    ////Combine two arrays and develop a third array. Consider element by element while combining-----Q68
    public static void Q63(int[]arr1,int[]arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[]res=new int[n1+n2];
        int idx=0;
        for(int i=0;i<n1;i++){
            res[idx++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            res[idx++]=arr2[i];
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

//Find out index of an element which contains left indexed element is  same as a right indexed element.-->sum of left ele==sum of right ele
public static void Q64(int[]arr){
    int totalsum=0;
    for(int x:arr){
        totalsum+=x;
    }
    int leftsum=0;
    for(int i=0;i<arr.length;i++){
        int rightsum=totalsum-leftsum-arr[i];
        if(leftsum==rightsum){
            System.out.println("Equillibrium Index is: "+i);
            return;
        }
        leftsum+=arr[i];
    }
}

//Find out the elements which are not duplicates in the given array
public static void Q65(int[]arr){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:arr){
        map.put(x,map.getOrDefault(x, 0)+1);
    }
    ArrayList<Integer> res=new ArrayList<>();
    for(int x:arr){
        if(map.get(x)==1){
            res.add(x);
        }
    }
    System.out.println(res);
}

// Find out elements which are having minimum one duplicate
public static void Q66(int[]arr){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:arr){
        map.put(x,map.getOrDefault(x, 0)+1);
    }
    ArrayList<Integer> res=new ArrayList<>();
    for(int x:arr){
        if(map.get(x)>1){
            res.add(x);
            map.put(x,0);//once one is added remove that to avoid duplicate occurences
        }
    }
    System.out.println(res);
}

//Find out element frequency in the given array?
public static void Q67(int[]arr){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int x:arr){
        map.put(x,map.getOrDefault(x, 0)+1);
    }
    map.forEach((key, value) -> {
    System.out.println("Key = " + key + ", Value = " + value);
});
}

//Combine two arrays and develop a third array. Consider element by element while combining and take forward direction from first array    and reverse direction from 2nd array
public static void Q69(int[]arr1,int[]arr2){
     int n1=arr1.length;
     int n2=arr2.length;
     int n=n1+n2;
     int res[]=new int[n];
     int i=0,j=n2-1,k=0;
     while(i<n1 && j>=0){
        res[k++]=arr1[i++];
        res[k++]=arr2[j--];
     }
     while(i<n1) res[k++]=arr1[i++];
     while(j>=0)res[k++]=arr2[j--];
     for(i=0;i<n;i++){
        System.out.print(res[i]+" ");
     }
}

// Sorting int elements from an arrays? (use bubble sort)
public static void Q70(int[]arr){
    int n=arr.length;
    boolean flag=false;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(!flag){
            break;
        }
    }
}

    public static void display(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,3,5,2,2};
        int[]arr2={6,8,4,9};
        Q70(arr);
       display(arr);
    }
}
