import java.util.*;
public class map_task_shopping_cart {
    public static void main(String[] args) {
        Map<String, Double> cart = new HashMap<>();
        System.out.println("""
1. Add products to the cart.
2. Remove a product.
3. Search for a product.
4. Update a product's price.
5. Display all products.
6. Calculate the total cart value.
7. Find the most expensive product.
""");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("Enter Product Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Product price: ");
                double price = sc.nextDouble();
                cart.put(name, price);
            }

            else if (choice == 2) {
                System.out.println("Enter product name to remove from cart: ");
                String prd = sc.nextLine();
                cart.remove(prd);
            }

            else if (choice == 3) {
                System.out.println("Enter product name to check it's existence: ");
                String prddd = sc.nextLine();
                System.out.println(cart.containsKey(prddd));
            }

            else if (choice == 4) {
                System.out.println("Enter product whose price has to be replaced: ");
                String prd = sc.nextLine();
                System.out.println("Enter the new price: ");
                double mrkk = sc.nextDouble();
                cart.put(prd, mrkk);
            }

             else if (choice == 5) {
                System.out.println(cart.keySet());
            }

             else if (choice == 6) {
                double sum = 0;
                for (Map.Entry<String, Double> entry : cart.entrySet()) {
                    sum += entry.getValue();

                }
                System.out.println("Total cart value is: " + sum);
            }

             else if (choice == 7) {
                    double max_val = 0;
                    String highest_stu="";
                    for (Map.Entry<String, Double> entry : cart.entrySet()) {
                        if (entry.getValue() > max_val) {
                            max_val = entry.getValue();
                            highest_stu = entry.getKey();
                        }
                    }
                    System.out.println("Product: " + highest_stu + " has the highest cart value of " + max_val);
                }

             else if (choice == -1) {
                System.out.println("Signing off...Bye :)");
                break;
            }

             else {
                System.out.println("Enter a valid choice");
            }
        }


    }
}
