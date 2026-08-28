import java.util.HashSet;
import java.util.List;

public class set_task {
    public static void main(String[] args){
        List<String> reg_cus = List.of("C101", "C102", "C103", "C101", "C104", "C105", "C103", "C106","C107","C107","C103");
        List<String> tdy_cus = List.of("C101","C107");
        HashSet<String> h1 = new HashSet<>();
        HashSet<String> h2 = new HashSet<>();
        for(String item: reg_cus){
            boolean flag = h1.add(item);
            if (!flag){
                if(tdy_cus.contains(item)){
                    h2.add(item);
                }
            }
        }
        System.out.println(h2);
    }
}
