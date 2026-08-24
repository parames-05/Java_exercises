public class TrainingBatch {
    private String courseName;
    private int batchSize;
    private String instructorName;

    public TrainingBatch(String courseName, int batchSize, String instructorName) {
        this.courseName = courseName;
        this.batchSize = batchSize;
        this.instructorName = instructorName;
    }
    public void displayBatchInfo() {
        System.out.println("Course: " + courseName + " | Students: " + batchSize + " | Instructor: " + instructorName);
    }

    public static void main(String[] args) {
        TrainingBatch batch1 = new TrainingBatch("Java Full Stack", 25, "Santhosh");
        TrainingBatch batch2 = new TrainingBatch("AI", 18, "Parames");

        batch1.displayBatchInfo();
        batch2.displayBatchInfo();
    }
}
