import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;
    int arrivalTime;
    int age;

    Patient(String name, int severity, int arrivalTime, int age) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
        this.age = age;
    }

    public String toString() {
        return name;
    }
}

public class pr_queue_task {

    PriorityQueue<Patient> queue = new PriorityQueue<>((a, b) -> {
        if (a.severity != b.severity) {
            return b.severity - a.severity;
        }
        if (a.arrivalTime != b.arrivalTime) {
            return a.arrivalTime - b.arrivalTime;
        }

        return a.name.compareTo(b.name);
    });


    void add_patient(String name, int severity, int arrivalTime, int age) {

        queue.add(new Patient(name, severity, arrivalTime, age));
    }


    Patient treat_next() {

        if (queue.isEmpty()) {
            return null;
        }

        return queue.poll();
    }


    Patient peek_next() {

        if (queue.isEmpty()) {
            return null;
        }

        return queue.peek();
    }


    public static void main(String[] args) {

        pr_queue_task er = new pr_queue_task();

        er.add_patient("AAAA", 3, 10, 8);
        er.add_patient("BBBB", 3, 5, 40);
        er.add_patient("CCCC", 5, 20, 30);

        System.out.println(er.treat_next());
        System.out.println(er.treat_next());
        System.out.println(er.treat_next());
    }
}