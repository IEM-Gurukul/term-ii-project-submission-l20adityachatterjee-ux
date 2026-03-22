import java.util.*;
// This class manages books and members
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void displayBooks() {
        for (Book b : books) b.display();
    }

    public void displayMembers() {
        for (Member m : members) m.display();
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

   public void issueBook(int bookId) {
    Book b = findBook(bookId);

    if (b == null) {
        System.out.println(" Invalid Book ID!");
        return;
    }

    if (b.isIssued()) {
        System.out.println(" Book is already issued!");
        return;
    }

    b.issueBook();
    System.out.println("Book issued successfully!");
}

   public void returnBook(int bookId) {
    Book b = findBook(bookId);

    if (b == null) {
        System.out.println("Invalid Book ID!");
        return;
    }

    if (!b.isIssued()) {
        System.out.println(" Book was not issued!");
        return;
    }

    b.returnBook();
    System.out.println(" Book returned successfully!");
}
}