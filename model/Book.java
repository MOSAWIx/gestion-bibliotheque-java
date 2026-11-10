package library.model;

public class Book implements Lendable {

    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (borrowed) {
            System.out.println("This book is already borrowed.");
            return;
        }

        borrowed = true;
    }

    @Override
    public void returnItem() {
        if (!borrowed) {
            System.out.println("This book was not borrowed.");
            return;
        }

        borrowed = false;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String describe() {
        return title + " by " + author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}