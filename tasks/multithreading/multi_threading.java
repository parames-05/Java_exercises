class process extends Thread {
    public void run() {
        int itr;
        for(itr = 1; itr <= 5; itr++) {
            System.out.println("Thread " + itr);
        }
        System.out.println("Name of the thread that performed these operaations is: "+getName());
    }
}

class process2 extends Thread {
    public void run() {
        int itr;
        for(itr = 1; itr <= 5; itr++) {
            System.out.println("Check " + itr);
        }
    }
}

public class multi_threading {
    public static void main(String[] args) {
        process p = new process();
        process2 p2 = new process2();
        System.out.println("Welcome");
        System.out.println("Start the process");

        try{
            p.sleep(2000);
            p.setName("MVP Thread");
            p.start();
            p.setPriority(1);
            System.out.println(p.isAlive());
            p.join();
        }
        catch(Exception e){}
        System.out.println(p.isAlive());
        p2.setPriority(2);
        p2.start();


        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Process...");
        }

        System.out.println("End of process ---- ^_^ ----");
    }
}
