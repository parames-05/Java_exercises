import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class menu_crt{
    String food;
    int price;

    menu_crt(String dish, int rate){
        this.food=dish;
        this.price=rate;
    }
}
public class map_interface {
    public static void main(String[] args) {
    Map<String, Integer> menu = new HashMap<>();
    menu_crt item1 = new menu_crt("Parotta",13);
    menu.put(item1.food, item1.price);
    menu.put("Chappatti",33);
    menu.put("Onion Rava",47);
    System.out.println(menu);
    System.out.println(menu.keySet());
    System.out.println(menu.values());
        List<Integer> l1 = new ArrayList<>();
        l1.addAll(menu.values());
        String priciestDish = "";
        int max_val = 0;


        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            if (entry.getValue() > max_val) {
                max_val = entry.getValue();
                priciestDish = entry.getKey();
            }
        }

        System.out.println("The priciest dish in the menu is: " + priciestDish);

    }
}
