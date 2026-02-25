package AutomateTransactionGame;

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

    Game(String gameName,String authorName,float price){
        this.gameName=gameName;
        this.authorName=authorName;
        this.price=price;
    }
}
