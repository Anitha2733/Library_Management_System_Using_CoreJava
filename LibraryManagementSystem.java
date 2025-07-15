package library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
       

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("==== Library Menu ====");
            System.out.println("\n1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Issue Book");
            System.out.println("4. View Books");
            System.out.println("5. View Members");
            System.out.println("6. Save & Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    int id = sc.nextInt();
                    library.addMember(new Member(name, id));
                    break;

                case 3:
                    System.out.print("Enter ISBN to issue: ");
                    String issueIsbn = sc.nextLine();
                    System.out.print("Enter member ID: ");
                    int memberId = sc.nextInt();
                    library.issueBook(issueIsbn, memberId);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    library.displayMembers();
                    break;

                case 6:
                    library.saveToFile();
                    running = false;
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }

        sc.close();
    }
}
