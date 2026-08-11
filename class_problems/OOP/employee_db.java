import java.util.Scanner;

class Employee
{
    int emp_id;
    String emp_name;
    double salary;
    Employee(int emp_id,String emp_name,double salary)
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.salary = salary;
    }
    void address(int door ,String street ,String city ,int pin)
    {
        System.out.printf("%d ,%s\n%s-%d",door,street,city,pin);
    }
}
public class employee_db {
    static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Employee[] list = new Employee[n];
        int roll,door,pin;
        String name,street,city;
        double sal;
        for(int itr=0;itr<n;itr+=1)
        {
            roll = input.nextInt();
            name = input.nextLine();
            sal = input.nextDouble();

            list[itr] = new Employee(roll,name,sal);


        }
        System.out.println(list[0].emp_id);
        System.out.println(list[0].emp_name);
        System.out.println(list[0].salary);
        door = input.nextInt();
        pin = input.nextInt();
        street = input.nextLine();
        city = input.nextLine();
        list[0].address(door,street,city,pin);
    }
}
