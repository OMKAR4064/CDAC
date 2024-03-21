public class BookInventeryManagementSystem {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;

    // Constructor
    public BookInventeryManagementSystem(String title, String author, String publisher, String isbn, int year, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business logic methods
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void decreaseQuantity(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Error: Quantity cannot be decreased. Insufficient quantity in inventory.");
        }
    }

    public double getInventoryValue() {
        return price * quantity;
    }

    public static void main(String[] args) {
        // Creating an instance of the Book class
        BookInventeryManagementSystem book = new BookInventeryManagementSystem(" Java: A Beginner’s Guide", "Herbert Schildt", "ABC Publishers", "978-3-16-148410-0", 2020, 2999, 50);

        // Displaying book details
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Year: " + book.getYear());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Quantity: " + book.getQuantity());

        // Increasing quantity of books
        book.increaseQuantity(10);
        System.out.println("\nAfter increasing quantity by 10:");
        System.out.println("Quantity: " + book.getQuantity());

        // Decreasing quantity of books
        book.decreaseQuantity(5);
        System.out.println("\nAfter decreasing quantity by 5:");
        System.out.println("Quantity: " + book.getQuantity());

        // Calculating and displaying inventory value
        double inventoryValue = book.getInventoryValue();
        System.out.println("\nInventory Value: " + inventoryValue);

    }
}
