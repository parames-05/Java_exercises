abstract class LibraryItem {
    String title;
    int id;
    boolean available = true;

    LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
    }

    abstract int getLoanPeriod();
}

interface Borrowable {
    void borrowItem();
    void returnItem();
}

class Book extends LibraryItem implements Borrowable {
    Book(String title, int id) {
        super(title, id);
    }

    int getLoanPeriod() {
        return 14;
    }

    public void borrowItem() {
        available = false;
        System.out.println(title + " borrowed");
    }

    public void returnItem() {
        available = true;
        System.out.println(title + " returned");
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, int id) {
        super(title, id);
    }

    int getLoanPeriod() {
        return 0;
    }
}

class DVD extends LibraryItem implements Borrowable {
    DVD(String title, int id) {
        super(title, id);
    }

    int getLoanPeriod() {
        return 7;
    }

    public void borrowItem() {
        available = false;
        System.out.println(title + " borrowed");
    }

    public void returnItem() {
        available = true;
        System.out.println(title + " returned");
    }
}

class Librarian {
    void borrow(LibraryItem item) {
        if (item instanceof Borrowable)
            ((Borrowable)item).borrowItem();
        else
            System.out.println(item.title + " cannot be borrowed");
    }
}

public class Main {
    public static void main(String[] args) {

        Book b = new Book("Java Book", 1);
        Magazine m = new Magazine("Tech Magazine", 2);
        DVD d = new DVD("Avengers", 3);

        Librarian l = new Librarian();

        l.borrow(b);
        l.borrow(d);
        l.borrow(m);
    }
}