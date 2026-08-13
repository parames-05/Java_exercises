class Student {

    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }
}

public class encapsulation_demo {
    public static void main(String[] args) {

        Student s = new Student("Pabiii", 20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setName("Parames");
        s.setAge(25);

        System.out.println("Updated Name: " + s.getName());
        System.out.println("Updated Age: " + s.getAge());
    }
}