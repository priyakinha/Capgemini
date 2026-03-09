class Start{
    public static int sum(int[]arr){
        int sum=0;
       for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return sum;
    }
    public static void minElement(int[] arr){
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
       }
       System.out.println("Minimum: "+min);
    }
    public static void maxElement(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("First Max: "+max);
    }
    public static void secondMax(int[]arr){
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Second max: "+max2);
    }
    public static void avgOfArr(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
        }
        System.out.println("Average: "+sum/arr.length);
    }
    public static void sumOfEven(int[]arr){
        int sum=0;
        for(int i=0;i<arr.length;i+=2){
            sum+=arr[i];
        }
        System.out.println("Sum of even indexed: "+sum);
    }

     public static void sumOfOdd(int[]arr){
        int sum=0;
        for(int i=1;i<arr.length;i+=2){
            sum+=arr[i];
        }
        System.out.println("Sum of odd indexed: "+sum);
    }

    public static void minFromEvenIdx(int[]arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum from even index: "+min);
      }

    public static void maxFromOddIdx(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i+=2){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum from odd index: "+max);
      }
      public static void avgFromEven(int[]arr){
        int sum=0;
        int n=arr.length;
        if(n%2!=0){
            n+=1;
        }
        for(int i=0;i<arr.length;i+=2){
            sum+=arr[i];
        }
        System.out.println("Average from even index: "+sum/(n/2));
      }
      public static void avgFromOdd(int[]arr){
        int sum=0;
        int n=arr.length;
        for(int i=1;i<arr.length;i+=2){
            sum+=arr[i];
        }
        System.out.println("Average from odd index: "+sum/(n/2));
      }
      public static void sumFromFirstHalf(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<(n+1)/2;i++){
            sum+=arr[i];
        }
        System.out.println("Sum from first half: "+sum);
      }
      public static void sumFromSecondHalf(int[]arr){
        int n=arr.length;
        int sum=0;
        for(int i=n/2;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum from second half: "+sum);
      }

      public static void minFromFirstHalf(int[]arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<(n+1)/2;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum from first half: "+min);
      }  
    public static void main(String[] args) {
        int[] arr={4,6,5,8,9,2};
        System.out.println(sum(arr));
        minElement(arr);
        maxElement(arr);
        secondMax(arr);
        avgOfArr(arr);
        sumOfEven(arr);
        sumOfOdd(arr);
        minFromEvenIdx(arr);
        maxFromOddIdx(arr);
        avgFromEven(arr);
        avgFromEven(arr);
        avgFromOdd(arr);
        sumFromFirstHalf(arr);
        sumFromSecondHalf(arr);
        minFromFirstHalf(arr);
    }
}