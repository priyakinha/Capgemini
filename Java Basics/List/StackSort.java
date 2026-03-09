import java.util.Stack;

public class StackSort {
    public static void SortStack(int[]arr){
       Stack<Integer>stack=new Stack<>();
       int[]ans=new int[arr.length];
       int idx=0;
       for(int i=0;i<arr.length;i++){
        while(!stack.isEmpty() && arr[i]>stack.peek()){
            ans[idx++]=stack.pop();
        }
        stack.push(arr[i]);
       }
       while(!stack.isEmpty()){
        ans[idx++]=stack.pop();  
       }
       for(int i=0;i<ans.length-1;i++){
            if(ans[i]>ans[i+1]){
                System.out.println("No");
                return;
            }
       }
       System.out.println("YES");  
    }

    public static void main(String[] args) {
        int[]arr={1,3,4,2};
        SortStack(arr); 
    }
}
