package Feb25.AutomateTransactionGame;

public class Game {
    private String gameName;
    private  String authorName;
    float price;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Game(){

    }

    Game(String gameName,String authorName,float price){
        super();
        this.gameName=gameName;
        this.authorName=authorName;
        this.price=price;
    }
    public String toString(){
        return gameName+"\t"+price+"\t"+authorName;
    }
}
