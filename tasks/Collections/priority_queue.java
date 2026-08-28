import java.util.PriorityQueue;

class Panel {
    String interviewer;
    int panelNo;
    int noOfCandidates;

    Panel(String interviewer, int panelNo, int noOfCandidates) {
        this.interviewer = interviewer;
        this.panelNo = panelNo;
        this.noOfCandidates = noOfCandidates;
    }

    void display() {
        System.out.println(
                "Panel No: " + panelNo +
                        ", Interviewer: " + interviewer +
                        ", Candidates: " + noOfCandidates
        );
    }
}

public class priority_queue {
    public static void main(String[] args) {

        PriorityQueue<Panel> q = new PriorityQueue<>(
                (a, b) -> a.noOfCandidates - b.noOfCandidates
        );

        q.add(new Panel("Santosh", 1, 2));
        q.add(new Panel("Arun", 2, 3));
        q.add(new Panel("Kumar", 3, 1));
        q.add(new Panel("Rahul", 4, 4));
        q.add(new Panel("Vijay", 5, 5));

        while (!q.isEmpty()) {
            Panel current = q.poll();
            current.display();
        }
    }
}