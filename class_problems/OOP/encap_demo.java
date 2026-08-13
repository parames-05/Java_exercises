abstract class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    abstract void bonus_cal();
    abstract void display();
}

class Developer extends Employee {

    Developer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void bonus_cal() {
        System.out.println("Developer Bonus: " + (getSalary() * 20 / 100));
    }

    @Override
    void display() {
        System.out.println("Developer Name: " + getName());
        System.out.println("Developer Salary: " + getSalary());
    }
}


class Manager extends Employee {

    Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void bonus_cal() {
        System.out.println("Manager Bonus: " + (getSalary() * 30 / 100));
    }

    @Override
    void display() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Manager Salary: " + getSalary());
    }
}

public class encap_demo {
    public static void main(String[] args) {

        Employee developer = new Developer("ambuuu", 50000);
        Employee manager = new Manager("pabiii", 80000);

        developer.display();
        developer.bonus_cal();

        System.out.println();

        manager.display();
        manager.bonus_cal();
    }
}