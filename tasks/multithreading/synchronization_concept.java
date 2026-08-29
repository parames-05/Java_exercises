class Task extends Thread {

    Counter cnt;

    Task(Counter cnt) {
        this.cnt = cnt;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            cnt.click();
        }
    }
}


class Counter {
    int cnt = 0;

    synchronized void click() {
        cnt++;
    }
}


public class synchronization_concept {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Task t1 = new Task(counter);
        Task t2 = new Task(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (Exception e) {

        }

        System.out.println("Final count: " + counter.cnt);
    }
}