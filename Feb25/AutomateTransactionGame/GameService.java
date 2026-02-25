package AutomateTransactionGame;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    public ArrayList<Game> al = new ArrayList<>();

    GameService() {
        al.add(new Game("SnowBird", "Danny", 300));
        al.add(new Game("FreshFood", "Ram", 450));
        al.add(new Game("BatsMan", "Kate", 400));
        al.add(new Game("Pokieman", "Steeve", 600));
        al.add(new Game("YammyTmmy", "Narayana", 350));
    }

    public List<Game> viewAll() {
            return al;
    }

    public String authorSearch(String author) {
        for (Game g : al) {
            if (g.getAuthorName().equalsIgnoreCase(author)) {
                return g.getGameName();
            }
        }
        return "NOT FOUND";
    }

}
