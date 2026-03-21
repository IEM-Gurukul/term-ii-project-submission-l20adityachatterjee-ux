import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add Book\n2.Register Member\n3.Show Books\n4.Issue Book\n5.Return Book\n6.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Member ID: ");
                    int mid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    lib.registerMember(new Member(mid, name));
                    break;

                case 3:
                    lib.displayBooks();
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    lib.issueBook(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Book ID: ");
                    lib.returnBook(sc.nextInt());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}