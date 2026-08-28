import java.util.Iterator;
import java.util.LinkedList;

public class desc_iterator {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apricot");

        Iterator<String> reverseItr = list.descendingIterator();

        while (reverseItr.hasNext()) {
            System.out.println(reverseItr.next());
        }
    }
}
