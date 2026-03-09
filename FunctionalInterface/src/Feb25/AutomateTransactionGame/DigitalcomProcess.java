package Feb25.AutomateTransactionGame;

import java.util.Scanner;

public class DigitalcomProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        GameService gs = new GameService();
        int choice;

            System.out.println("Main Menu - Choices");
            System.out.println("1.Register User");
            System.out.println("2.For Login");
            System.out.println("3.To exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter userId: ");
                    String id = sc.next();
                    System.out.println("Enter password: ");
                    String pass = sc.next();
                    if (u.isAuthenticated(id, pass)) {
                        u.addUser(id, pass);
                    }
                    break;
                case 2:
                    System.out.println("Enter userId and Password: ");
                    if (u.isAuthenticated(sc.next(), sc.next())) {
                        while (true) {
                            System.out.println("3: To view all game");
                            System.out.println("4: To search Game");
                            System.out.println("5: To exit");
                            int ch1 = sc.nextInt();
                            switch (ch1) {
                                case 3:
                                    gs.viewAll().forEach(g -> System.out.println(g));
                                    break;
                                case 4:
                                    System.out.println("Enter AuthorName");
                                    System.out.println(gs.authorSearch(sc.next()));
                                    break;
                                case 5:
                                    return;
                            }
                        }
                    }else{
                            System.out.println("Wrong useId and Password");
                        }

            case 3:
                return;

        }

    }
}

