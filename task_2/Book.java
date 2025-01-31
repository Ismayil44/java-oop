public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;

    public Book(String title, String author, int publicationYear, String genre, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Price: $" + price);
    }

    public void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
        System.out.println("New Price after discount: $" + price);
    }

    public void displayBookAge() {
        int age = 2024 - publicationYear;
        System.out.println("The book is " + age + " years old.");
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction", 15.99);
        book1.displayBookDetails();
        book1.applyDiscount(10);
        book1.displayBookAge();
    }
}