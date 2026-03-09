import java.util.Scanner;
import java.util.Stack;

public class MaxEle {
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();
    public void addVal(int val){
        stack1.push(val);
    }
    public void removeVal(){
        stack1.pop();
    }
    public void getTopVal(){
        stack1.peek();
    }
    public  int getMinValue(){
        int min=stack1.peek();
        stack2.push(min);
        while(!stack1.isEmpty()){
             if(stack1.peek()<stack2.peek()){
             stack2.pop();
             stack2.push(stack1.pop());
         }else{
            stack1.pop();
         }
        }
         return stack2.pop();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        MaxEle obj=new MaxEle();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            obj.addVal(sc.nextInt());
        }
        System.out.println(obj.getMinValue());   
    }
}
