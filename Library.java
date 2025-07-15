package library;

import java.io.*;
import java.util.*;

public class Library implements Storable {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("✅ Book added.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("✅ Member added.");
    }

    public void issueBook(String isbn, int memberId) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isIssued()) {
                book.setIssued(true);
                System.out.println("✅ Book issued to member ID: " + memberId);
                return;
            }
        }
        System.out.println("❌ Book not available.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayMembers() {
        for (Member member : members) {
            member.displayMemberDetails();
        }
    }

    // File Handling for persistence
    @Override
    public void saveToFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
            out.writeObject(books);
            out.writeObject(members);
            System.out.println("✅ Data saved to file.");
        } catch (IOException e) {
            System.out.println("❌ Error saving data: " + e.getMessage());
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("library.dat"))) {
            books = (List<Book>) in.readObject();
            members = (List<Member>) in.readObject();
            System.out.println("✅ Data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error loading data: " + e.getMessage());
        }
    }
}
