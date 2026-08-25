import java.util.*;
class emp{
    int id;
    String name;
    Stack stack = new Stack();

    void push(int idd, String namee){
        this.id=idd;
        this.name = namee;
        stack.push(id);
        stack.push(name);
    }
    void disp(){
        System.out.println(stack);
    }
        }

public class stack_oops {
    public static void main(String[] args){
        emp e = new emp();
        e.push(101,"Santosh");
        e.push(102,"Paramess");
        e.disp();
    }
}
