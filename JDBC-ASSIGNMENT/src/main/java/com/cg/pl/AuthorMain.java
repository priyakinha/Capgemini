package com.cg.pl;

import com.cg.bean.Author;
import com.cg.bean.Book;
import com.cg.service.AuthorService;
import com.cg.service.BookService;
import com.cg.service.IAuthorService;
import com.cg.service.IBookService;

import java.util.List;
import java.util.Scanner;

public class AuthorMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IAuthorService authorService = new AuthorService();
        IBookService bookService = new BookService();
        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Insert Author & Book");
            System.out.println("2. View Books By Author");
            System.out.println("3. Update Book Price By Author");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                // Insert Author & Book
                case 1:
                    System.out.println("Enter Author ID:");
                    int authorId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Author First Name:");
                    String fname = sc.nextLine();
                    System.out.println("Enter Author Middle Name:");
                    String mname = sc.nextLine();
                    System.out.println("Enter Author Last Name:");
                    String lname = sc.nextLine();
                    System.out.println("Enter Phone Number:");
                    String phone = sc.nextLine();
                    Author author = new Author(authorId, fname, mname, lname, phone);
                    String res = authorService.createAuthor(author);
                    System.out.println(res);
                    if (res.equals("Author created")) {
                        System.out.println("Enter Book ISBN:");
                        int isbn = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Book Title:");
                        String title = sc.nextLine();
                        System.out.println("Enter Book Price:");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        Book book = new Book(isbn, title, price, authorId);
                        String result = bookService.createBook(book);
                        System.out.println(result);

                    } else {
                        System.out.println("Author not inserted, so book not added");
                    }
                    break;


                // View Books By Author
                case 2:
                    System.out.println("Enter Author First Name:");
                    String name = sc.nextLine();
                    List<String> books = authorService.getBooksByAuthor(name);
                    if (books.isEmpty()) {
                        System.out.println("No Books Found");
                    } else {
                        System.out.println("Books Written By " + name + ":");
                        for (String b : books) {
                            System.out.println(b);
                        }
                    }
                    break;


                // Update Book Price
                case 3:
                    System.out.println("Enter Author First Name:");
                    String aname = sc.nextLine();
                    System.out.println("Enter New Price:");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();

                    String updateResult = authorService.updateBookPrice(aname, newPrice);
                    System.out.println(updateResult);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}