package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Library {

    private final List<Lendable> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(Lendable item) {
        items.add(item);
    }

    public void removeItem(Lendable item) {
        items.remove(item);
    }

    public List<Lendable> getAvailableItems() {
        List<Lendable> availableItems = new ArrayList<>();

        for (Lendable item : items) {
            if (!item.isBorrowed()) {
                availableItems.add(item);
            }
        }

        return availableItems;
    }

    public void listAllItems() {
        for (Lendable item : items) {
            System.out.println(item.describe());
        }
    }
}