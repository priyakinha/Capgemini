package Feb25.AutomateTransactionGame;

import java.util.ArrayList;

public class User implements IsValidate {
    private String userId;
   private  String password;

    public  void addUser(String u,String p){
        this.userId=u;
        this.password=p;
    }
    public boolean isAuthenticated(String userId,String password){

        return (this.userId.equalsIgnoreCase(userId)&& this.password.equalsIgnoreCase(password));

    }
}
