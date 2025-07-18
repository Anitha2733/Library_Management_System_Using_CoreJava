package library;
import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() { return name; }
    public int getMemberId() { return memberId; }

    public void displayMemberDetails() {
        System.out.println("Member [Name=" + name + ", ID=" + memberId + "]");
    }
}

