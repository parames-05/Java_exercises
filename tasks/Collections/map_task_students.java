import java.util.*;
public class map_task_students {
    public static void main(String[] args) {
        Map<Integer, Integer> marks = new HashMap<>();
        System.out.println("""
                   1. Add student marks.
                   2. Search marks using Student ID.
                   3. Update a student's marks.
                   4. Find the student with the highest marks.
                   5. Display students who scored more than 75.
                   6. Calculate the average marks.
                   7. Check whether a particular Student ID exists.""");

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enter Student id: ");
            int id = sc.nextInt();
            System.out.println("Enter Student Mark: ");
            int mrk = sc.nextInt();
            marks.put(id, mrk);
        } else if (choice == 2) {
            System.out.println("Enter Student id to search mark: ");
            int idd = sc.nextInt();
            System.out.println(marks.get(idd));
        } else if (choice == 3) {
            System.out.println("Enter student id whose mark has to be replaced: ");
            int iddd = sc.nextInt();
            System.out.println("Enter the new mark: ");
            int mrkk = sc.nextInt();
            marks.put(iddd, mrkk);
        } else if (choice == 4) {
            int max_val = 0;
            int highest_stu = 0;
            for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
                if (entry.getValue() > max_val) {
                    max_val = entry.getValue();
                    highest_stu = entry.getKey();
                }
            }
            System.out.println("Student with id: " + highest_stu + "Scored the highest mark" + max_val);
        } else if (choice == 5) {
            for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
                if (entry.getValue() > 75) {
                    int stud = entry.getKey();
                    System.out.println("Student with id who scored above 75: " + stud);
                }
            }

        } else if (choice == 6) {
            double sum = 0;
            int counter = 0;
            for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {
                sum += entry.getValue();
                counter++;

            }
            double avg = sum / counter;
            System.out.println("Average mark of the class is: " + avg);
        } else if (choice == 7) {
            System.out.println("Enter student id to search");
            int i_d = sc.nextInt();
            System.out.println(marks.containsKey(i_d));
        } else if (choice == -1) {
            break;
        } else {
            System.out.println("Enter a valid choice");
        }
    }


    }
}
