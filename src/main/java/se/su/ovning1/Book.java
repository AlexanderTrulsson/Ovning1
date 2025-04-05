package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{

    private final double price;
    private final boolean bound;
    private final String author;

    public Book(String name, String author, double price, boolean bound) {

        super(name);
        this.price = price;
        this.bound = bound;
        this.author = author;
    }

    private String getAuthor() {
        return author;
    }

    private boolean isBound() {
        return bound;
    }

    public double getPrice() {
        return bound ? price * 1.3 : price;
    }

    public String toString() {
        return "Book: name='" + getName() + "', author='" + getAuthor() + "', bound=" + isBound() + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT();
    }

}
