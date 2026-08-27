import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "A*B+(C-D)/E%F";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if ((ch >= 'A' && ch <= 'Z')) {
                result.append(ch);
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }


            else {
                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        System.out.println("Postfix: " + result);
    }

    public static int precedence(char ch) {

        if (ch == '^') {
            return 3;
        }
        else if (ch == '*' || ch == '/' || ch == '%') {
            return 2;
        }
        else if (ch == '+' || ch == '-') {
            return 1;
        }

        return 0;
    }
}