public class StartString{
    //check palindrome
public static void palindrome(String s){
     int n=s.length();
       for(int i=0;i<n/2;i++){
           if(s.charAt(i)!=s.charAt(n-i-1)){
               System.out.print(false);
               return;
           }
       }
        System.out.print(true);
}

//remove repeating characters
public static String remrepeating(String s){
     boolean[] seen = new boolean[26];  // only for 'a' to 'z'
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (!seen[ch - 'a']) {   // first time
            sb.append(ch);
            seen[ch - 'a'] = true;
        }
    }
    return sb.toString();
}

//do 1st letter of each word capital
public static String capital1st(String s){
    int n=s.length();
    boolean capitalizeNext=true;
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++){
        char c=s.charAt(i);
        if(c==' '){
            sb.append(c);
            capitalizeNext=true;
        }else{
            if(capitalizeNext){
                sb.append(Character.toUpperCase(c));
                capitalizeNext=false;
            }else{
                sb.append(Character.toLowerCase(c));
            }
        }
    }
    return sb.toString();
}

//reverse the  words of string 
public static String reverse(String s){
     String[] words=s.split(" ");
     StringBuilder sb=new StringBuilder();
     for(int i=words.length-1;i>=0;i--){
        sb.append(words[i]).append(" ");
     }
     return sb.toString().trim();
}

//permutation
public static void permute(String str, String ans) {
    if (str.length() == 0) {
        System.out.println(ans);
        return;
    }

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        String ros = str.substring(0, i) + str.substring(i + 1);
        permute(ros, ans + ch);
    }
}
//count no of words
public static void Q13(String s){
    String[]words=s.trim().split("\\s+");
    System.out.println("Total words: "+words.length);
}
//write java program to remove specific character from string(all occurences)
public static String Q14(String s,char ch){
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=ch){
             sb.append(s.charAt(i));
        }
    }
    return sb.toString();
}

//remove first occurence of specified character
public static String Q15(String s,char ch){
    StringBuilder sb=new StringBuilder();
    boolean removed=false;
    for(int i=0;i<s.length();i++){
         if(s.charAt(i)==ch && !removed){
             removed=true;
             continue;
        }
        sb.append(s.charAt(i));
    }
    return sb.toString();
}

    public static void main(String[] args) {
    String s="I myself is enough";
    //palindrome(s);
    //System.out.println(remrepeating(s));
    //System.out.println(capital1st(s));
    //System.out.println(reverse(s));
    //permute(s,"");
   System.out.println( Q15(s,'e'));
}
}

