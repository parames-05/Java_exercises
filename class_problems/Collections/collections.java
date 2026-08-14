import java.util.*;
public class collections {
    public static void main(String[] args){
        List list=new ArrayList();
        Scanner sc= new Scanner(System.in);
        list.add(0,19);
        list.add(101);
        list.add(101);
        list.add("Kosaksik Pasapugal");
        list.add(null);
        list.addFirst("Modified first element");
        list.addFirst("Panchavan Paarivendhan");
        list.remove(null);
        list.remove(0);
        String name="Ash";
        String check = "a";
        System.out.println(name.contains(check));
        System.out.println(list);
        System.out.println(list);
        list.set(1,"holyy moly that was awesome");
        ArrayList<Integer> arr = new ArrayList<>();
        while(true){
            int ele= sc.nextInt();
            if (ele==-1){
                break;
            }
            else {
                arr.add(ele);
            }

        }
        arr.set(0,1008);
        System.out.println(arr);

    }
}
