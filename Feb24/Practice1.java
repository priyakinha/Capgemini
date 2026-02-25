package Feb24;

import java.lang.*;
public class Practice1 {
    public static void main(String[] args) {
        //1
        power p=(x, y)->{
            return Math.pow(x,y);
        };
        System.out.println(p.cal(2,4));

        //2

        formatString f=(s)->{
            String str="";
            for(int i=0;i<s.length();i++){
                str+=s.charAt(i)+" ";
            }
            return str;
        };
        System.out.println(f.modify("abcderf"));

        //3
        userNamePssword user=(userName, password) -> {
            if(userName.isEmpty() || password.length()<8) return false;
            return true;
        };
        System.out.println(user.checkCredentials("Priya","vayuuuuu"));

        //4

    }
}
