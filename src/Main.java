import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days since you got the book: ");
        int days = scanner.nextInt();

        try {
            library.returnBook(days);
        }
        catch (OverdueBookException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}