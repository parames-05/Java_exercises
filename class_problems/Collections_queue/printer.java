import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class prinnnter{
    String name;
    String task;

    void disp(String namee, String taskk){
        this.name=namee;
        this.task=taskk;
    }
}


public class printer {
    public static void main(String[] args){
        Queue<String> q = new LinkedList<>();
        prinnnter p1 = new prinnnter();
        prinnnter p2 = new prinnnter();
        prinnnter p3 = new prinnnter();
        prinnnter p4 = new prinnnter();
        prinnnter p5 = new prinnnter();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                    WELCOME TO QNS PRINT_SHOP
                    1. Assign task to Printer 1
                    2. Assign task to Printer 2
                    3. Assign task to Printer 3
                    4. Assign task to Printer 4
                    5. Assign task to Printer 1
                    -1. To exit
                    """);

        while(true){
            System.out.println("Enter the number of printer to assign task to: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter task to be performed: ");
                String task_to_be_done = sc.nextLine();
                p1.disp("Printer 1", task_to_be_done);
                q.offer("Printer 1 : "+task_to_be_done);
            }

            else if(choice==2){
                System.out.println("Enter task to be performed: ");
                String task_to_be_done = sc.nextLine();
                p2.disp("Printer 2", task_to_be_done);
                q.offer("Printer 2 : "+task_to_be_done);
            }

            else if(choice==3){
                System.out.println("Enter task to be performed: ");
                String task_to_be_done = sc.nextLine();
                p3.disp("Printer 3", task_to_be_done);
                q.offer("Printer 3 : "+task_to_be_done);
            }

            else if(choice==4){
                System.out.println("Enter task to be performed: ");
                String task_to_be_done = sc.nextLine();
                p4.disp("Printer 4", task_to_be_done);
                q.offer("Printer 4 : "+task_to_be_done);
            }

            else if(choice==5){
                System.out.println("Enter task to be performed: ");
                String task_to_be_done = sc.nextLine();
                p5.disp("Printer 5", task_to_be_done);
                q.offer("Printer 5 : "+task_to_be_done);
            }

            else if(choice ==-1){
                System.out.println("Signing off...");
                break;
            }

            else{
                System.out.println("Enter a valid choice");
            }

        }

        System.out.println(q);

    }
}
