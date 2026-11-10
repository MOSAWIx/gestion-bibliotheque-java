package library.service;

import java.util.ArrayList;
import java.util.List;
import library.model.Lendable;

public class Customer {

    private final String name;
    private final List<Lendable> checkedOutItems;

    public Customer(String name) {
        this.name = name;
        this.checkedOutItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void checkOutItem(Lendable item) {
        if (item.isBorrowed()) {
            return;
        }

        item.borrow();

        if (item.isBorrowed()) {
            checkedOutItems.add(item);
        }
    }

    public void returnItem(Lendable item) {
        if (checkedOutItems.contains(item)) {
            item.returnItem();
            checkedOutItems.remove(item);
        }
    }

    public List<Lendable> getCheckedOutItems() {
        return new ArrayList<>(checkedOutItems);
    }
}