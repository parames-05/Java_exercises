
abstract class Product {
    private int productId;
    private String productName;
    private double price;

    public Product(int productId, String productName, double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Invalid product price: " + price);
        }
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscount();

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void displayDetails() {
        System.out.println("==========================================");
        System.out.println("  Mariamman Special Store - Cross Cut Road");
        System.out.println("==========================================");
        System.out.println("Product ID      : " + getProductId());
        System.out.println("Product Name    : " + getProductName());
        System.out.println("Original Price  : " + getPrice());
        System.out.println("Discount Amount : " + calculateDiscount());
        System.out.println("Final Price     : " + calculateFinalPrice());
        System.out.println("==========================================");
    }
}

class Electronics extends Product {
    public Electronics(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 10 / 100;
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 20 / 100;
    }
}

class Grocery extends Product {
    public Grocery(int id, String name, double price) throws InvalidPriceException {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 5 / 100;
    }
}

class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

public class oop_excep_task_goods_store {
    public static void main(String[] args) {

        try {
            Product p1 = new Electronics(101, "Television", 50000);
            Product p2 = new Clothing(102, "Shirt", 2000);
            Product p3 = new Grocery(103, "Rice Bag", 1500);

            p1.displayDetails();
            p2.displayDetails();
            p3.displayDetails();

            Product p4 = new Electronics(104, "Laptop", -50000);
            p4.displayDetails();

        } catch (InvalidPriceException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Product processing completed.");
        }
    }
}