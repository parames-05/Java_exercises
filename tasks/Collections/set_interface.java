import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set_interface {
    public static void main(String[] args){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(22);
        set.add(100);
        set.add(101);
        set.add(null);
        System.out.println(set.add(null));
        //null can also be added only once the second time will be false in hash set
        //null in tree set yeilds exception

        System.out.println(set.add(101));
        System.out.println(set);

    }
}


