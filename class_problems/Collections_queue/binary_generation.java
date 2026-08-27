import java.util.*;

//Binary Generation concept by MVP :)
//binary generation basically does 1 (increase to tens) -> 10 (add 1) -> 11 (move to 100's place) -> 100 (add 1)-->101-->110-->111

public class binary_generation {
    public static void main(String[] args) {
        int n = 10;

        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 1; i <= n; i++) {
            String current = queue.poll();

            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}