package se.su.ovning1;

public class LongPlay extends Recording{

    public LongPlay(String name, String artist, int year,  int condition, double price){
        super(name, artist, year, price, condition);
    }

    @Override
    public String getType(){
        return "LP";
    }

    @Override
    public double getPrice() {
        // Hämta grundpriset enligt Recording (baserat på slitage)
        double basePrice = super.getPrice();
        // Använd ett fast "aktuellt" år – här 2025
        int fixedCurrentYear = 2025;
        int yearsPassed = fixedCurrentYear - this.getYear();  // se till att getYear() returnerar rätt år
        return basePrice + (yearsPassed * 5.0);
    }


}
