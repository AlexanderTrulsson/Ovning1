package se.su.ovning1;

import java.awt.print.Printable;

public abstract class Item implements Printable {

    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
