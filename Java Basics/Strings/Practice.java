import java.util.Scanner;
import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter string: ");
        // String s=sc.nextLine();
        // System.out.println("Enter character to count: ");
        // char ch=sc.next().charAt(0);
         //int count=0;
        // for(int i=0;i<name.length();i++){
        //     if(name.charAt(i)==ch){
        //         count++;
        //     }
        // }
        // System.out.println(count);
         

    //give only lower case letter
    //     for(int i=0;i<name.length();i++){
    //         if(Character.isLowerCase(name.charAt(i))){
    //             count++;
    //             System.out.print(name.charAt(i));
    //         }
    //     }
    //    System.out.println("\n"+count);


    //maximum length word
    // int max=0;
    // String[] str=name.split("\\s+");
    // for(int i=0;i<str.length;i++){
    //     int len=str[i].length();
    //     max=Math.max(len,max);
    // }
    // System.out.println("Maximum length: "+max);


    //highest number of times a letter appears
    // int[]freq=new int[26];
    // name=name.toLowerCase();
    // for(int i=0;i<name.length();i++){
    //     freq[name.charAt(i)-'a']++;
    // }
    // for(int i=0;i<freq.length;i++){
    //     if(count<freq[i]){
    //         count++;
    //     }
    // }
    // System.out.println(count);



    //compressed string in reverse order
//     Stack<String> stack = new Stack<>();
//     int count = 1;
//     for (int i = 1; i <= s.length(); i++) {
//     if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
//         count++;
//     } else {
//         stack.push("" + s.charAt(i - 1) + count);
//         count = 1;
//     }
// }
//     StringBuilder result = new StringBuilder();
//     while (!stack.isEmpty()) {
//         result.append(stack.pop());
//     }
//     System.out.println(result.toString());


//insert the given ele 
int arr[]={101,105,110,120,130};
int[] newArr=new int[arr.length+1];
int id=107;
int pos = 0;
while (pos < arr.length && arr[pos] < id) {
    newArr[pos] = arr[pos];
    pos++;
}
newArr[pos] = id;
for (int i = pos; i < arr.length; i++) {
    newArr[i + 1] = arr[i];
}
for(int i=0;i<newArr.length;i++){
    System.out.print(newArr[i]+" ");
}
System.out.println();

 }
}
