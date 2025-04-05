package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private double price;
    private final int condition;

    public Recording(String name, String artist, int year, double price, int condition) {

        super(name);
        this.artist = artist;
        this.year = year;
        this.price = price;
        this.condition = condition;

    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public int getCondition() {
        return condition;
    }

    public double getPrice() {

        double calculatedPrice = price * (condition / 10.0);
        if (calculatedPrice < 10){
            calculatedPrice = 10;
        }
        return calculatedPrice;
    }

    protected double getOriginalPrice() {
        return price;
    }

    public abstract String getType();


    public String toString() {
        return getType() + ": name=" + getName() + ", artist='" + getArtist() + "', year=" + getYear() + ", condition=" + getCondition() + ", original price=" + getOriginalPrice() + ", price=" + getPrice() + ", price+vat=" + getPriceWithVAT();
    }


}
