package AutomateTransactionGame;

import java.util.Scanner;

public class DigitalcomProcess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        User u=new User();
        GameService gs=new GameService();
        int choice;

        do {
        System.out.println("Main Menu - Choices");
        System.out.println("1.Register User");
        System.out.println("2.viewGames");
        System.out.println("3.SearchByGames");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter userId: ");
                    String id=sc.next();
                    System.out.println("Enter password: ");
                    String pass=sc.next();
                    if(u.isAuthenticated(id,pass)){
                        u.addUser(id,pass);
                    }
                    break;
                case 2:
                    for(Game g:gs.viewAll()){
                        System.out.println(g.getGameName());
                    }
                    break;
                case 3:
                    System.out.println("Enter author name: ");
                    String author=sc.next();
                    System.out.println(gs.authorSearch(author));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        }while(choice!=4);

    }
}
