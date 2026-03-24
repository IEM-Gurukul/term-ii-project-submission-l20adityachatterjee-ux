import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        // Main menu-driven program
        while (true) {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Show Books");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.println("7. Search Book");
            System.out.println("8. Show Members");
            System.out.println("9. Remove Book");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
            System.out.println("Invalid input! Try again.");
            sc.nextLine();
            continue;
            }

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
                   sc.close();
                   System.out.println("Exiting program...");
                   return;
                case 7:
                    sc.nextLine();
                    System.out.print("Enter title: ");
                    String t = sc.nextLine();
                    lib.searchBook(t);
                    break;
                case 8:
                    lib.displayMembers();
                    break;
                case 9:
                    sc.nextLine();  
                    System.out.print("Enter Book ID to remove: ");
                    lib.removeBook(sc.nextInt());
                    break;
            }
        }
    }
}