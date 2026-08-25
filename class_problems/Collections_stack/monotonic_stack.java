import java.util.*;

public class monotonic_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            stack.add(n);
        }
        boolean isStrictlyIncreasing = true;
        for (int i = 0; i < stack.size() - 1; i++) {
            if (stack.get(i) >= stack.get(i + 1)) {
                isStrictlyIncreasing = false;
                break;
            }
        }
        if (isStrictlyIncreasing && stack.size() > 0) {
            System.out.println("strictly increasing monotonic array");
        }

        boolean isStrictlyDecreasing = true;
        for (int i = 0; i < stack.size() - 1; i++) {
            if (stack.get(i) <= stack.get(i + 1)) {
                isStrictlyDecreasing = false;
                break;
            }
        }
        if (isStrictlyDecreasing && stack.size() > 0) {
            System.out.println("strictly decreasing monotonic array");
        } else {
            System.out.println("Not a strictly increasing nor decreasing monotonic array");
        }
    }
}
