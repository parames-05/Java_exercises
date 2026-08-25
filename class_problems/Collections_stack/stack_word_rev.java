import java.util.*;
public class stack_word_rev {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] input = word.split(" ");
        for(int i =0;i<input.length;i++){
            stack.add(input[i]);
        }
        for(int j=stack.size()-1;j>=0;j--){
            for(int k=stack.get(j).length()-1; k>=0;k--){
                System.out.println(stack.get(j).charAt(k));
            }
        }
    }
}
