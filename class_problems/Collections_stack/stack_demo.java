import java.util.Scanner;
import java.util.Stack;

public class stack_demo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.add(23);
        stack.add(99);
        stack.add(1);
        System.out.println(stack);

        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if (n==-1){
                break;
            }
            stack.add(n);
        }
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println("popping");
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.size());

    }
}
