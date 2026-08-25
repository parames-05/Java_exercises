import java.util.*;
public class stack_menu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("""
                    WELCOME TO STACK MENU
                    ENTER OPERATION TO PERFORM
                    1.Push
                    2.POP
                    3.Peek
                    4.isEmpty
                    5.Size
                    6.Display
                    7. EXIT(-1)
                     
                     """);
        while(true){
            System.out.println("Enter your choice of operation: ");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Enter value to insert into stack: ");
                int to_push = sc.nextInt();
                stack.push(to_push);
            }
            else if (choice==2) {
                stack.pop();
            }
            else if (choice==3) {
                System.out.println(stack.peek());
            }
            else if (choice==4) {
                System.out.println(stack.isEmpty());
            }
            else if(choice==5){
                System.out.println(stack.size());
            }
            else if(choice==6){
                System.out.println("Printing elments last in first out order: ");
                for(int i=stack.size()-1;i>=0;i--){
                    System.out.println(stack.get(i));
                }
            }
            else if (choice==-1) {
                System.out.println("Signing off...");
                break;
            }
            else{
                System.out.println("Enter a valid choice from menu ");
            }


        }
    }
}
