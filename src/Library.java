public class Library {
    public void returnBook(int daysLate) throws OverdueBookException {
        if (daysLate > 30) {
            throw new OverdueBookException("Book is " + daysLate + " days overdue. Maximum allowed is 30 days.");
        }
        else {
            int daysLeft = 30 - daysLate;
            System.out.println("You have " + daysLeft + " days left to return the book.");
        }
    }
}