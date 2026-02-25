package AutomateTransactionGame;

import java.util.ArrayList;

public class User implements IsValidate {
    String userId;
    String password;

    ArrayList<String>data=new ArrayList<>();
    public  void addUser(String u,String p){
        this.userId=u;
        this.password=p;
        if(isAuthenticated(u,p)){
            data.add(u);
            System.out.println("success");
        }
        else{
            System.out.println("Invalid data");
        }
    }
    public boolean isAuthenticated(String userId,String password){
                if(userId.isEmpty() || password.isEmpty()){
                    System.out.println("Enter valid credentials!!");
                    return false;
                }
                if(password.length()<8){
                    System.out.println("Password must contains at least 8 characters!!");
                    return false;
                }
                if(data.contains(userId)){
                    return false;
                }
        return true;
    }
}
