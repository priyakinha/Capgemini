import java.util.*;

public class From15 {
    //replace a given character by specified once
    public static void Q16(String s,char ch,char my){
      s= s.replace(ch, my);
      System.out.println(s);
    }
    //add specific charcater at specific index
    public static void Q17(String s,int idx,char ch){
        s=s.substring(0, idx)+ch+s.substring(idx+1,s.length());
        System.out.println(s);
    }
    //reverse each word in a string
    public static String Q18(String s){
        String words[]=s.trim().split("\\s+");
        StringBuilder res=new StringBuilder();
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            res.append(sb.reverse().append(" "));
        }
        return res.toString().trim();
    }
    //check if two strings are equal
    public static void Q19(String s1,String s2){
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equal");
        }
    } 
    //remove duplicate characters from a given string
    public static String Q20(String s){
        int[]freq=new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']>0){
                sb.append(ch);
                freq[ch-'a']=0;
            }
        }
        return sb.toString();
    }
    //print duplicate words in a given string
    public static void Q21(String s){
      String[]words=s.trim().toLowerCase().split("\\s+");
      HashMap<String,Integer>map=new HashMap<>();
      for(String word:words){
        map.put(word,map.getOrDefault(word,0)+1);
      }
      for(Map.Entry<String,Integer>entry:map.entrySet()){
        if(entry.getValue()>1){
            System.out.println(entry.getKey());
        }
      }
    }
    //check if two strings are anagrams
    public static boolean Q22(String s1,String s2){
        s1=s1.toLowerCase().replaceAll("\\s+", "");
        s2=s2.toLowerCase().replaceAll("\\s+", "");
        if(s1.length()!=s2.length()){
            return false;
        }
        int[]freq=new int[26];
        for(int i=0;i<s1.length();i++){
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(i);
            freq[ch1-'a']++;
            freq[ch2-'a']--;
        }
        for(int count :freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    //check if string is panagram
    public static boolean Q23(String s){
        int[]freq=new int[26];
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
            freq[ch-'a']++;
            }
        }
        for(int count :freq){
            if(count==0){
                return false;
            }
        }
        return true;
    }
    //remove odd index character from string
    public static String Q24(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
       
        //Q17(s,4,'x');
         //Q21(s);
        // System.out.println(Q23(s));
        System.out.println(Q24(s));

        
    }
}
