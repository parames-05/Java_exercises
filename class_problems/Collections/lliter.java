import java.util.*;
class Customer {
    String id;
    int amt;
    int discount;

    Customer(String id, int amt, int discount) {
        this.id = id;
        this.amt = amt;
        this.discount = discount;
    }
}
public class lliter {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", 5000, 10));
        customers.add(new Customer("C002", 3000, 5));
        customers.add(new Customer("C003", 7000, 15));

        ListIterator<Customer> iterator = customers.listIterator();
        while (iterator.hasNext()) {
            Customer c = iterator.next();
            System.out.println(c.id + " " + c.amt + " " + c.discount);
        }
    }
}

