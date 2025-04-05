package se.su.ovning1;

import java.util.*;

public class Order {

    private static long counter;

    private final List <Item> items;

    private final long orderNumber;

    public Order(Item... items) {
        this.items = new ArrayList<>();
        for (Item item : items){
            this.items.add(item);
        }
        this.orderNumber = counter++;
    }

    public double getTotalValue() {
        double total = 0;
        for (Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    public double getTotalValuePlusVAT(){
        double total = 0;
        for (Item item : items){
            total += item.getPriceWithVAT();
        }
        return total;
    }

    public List<Item> getItems() {
        return items;
    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("Receipt for order #" + orderNumber + "\n" +
                "-----------\n");
        for (Item item : items){
            receipt.append(item.toString() + "\n");
        }

        receipt.append("Total excl. VAT:" + getTotalValue() + "\n");
        receipt.append("Total incl. VAT:" + getTotalValuePlusVAT() + "\n");
        return receipt.toString();

    }

}
