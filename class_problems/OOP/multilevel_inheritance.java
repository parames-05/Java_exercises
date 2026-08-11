

class GrandFather
{
    int age = 60;
    void GrandFather()
    {
        System.out.println("i am grandfather class");
    }
}

class Father1 extends GrandFather
{
    int age =40;
    void Father()
    {
        System.out.println("i am father class");
    }
}
class Son1 extends Father1{
    int age = 20;
    void Son()
    {
        System.out.println("I am son class" +age);
    }
}
class Grandson extends Son1
{

    void Grandson()
    {
        System.out.println("i am grandson");
    }
}

public class multilevel_inheritance {
    static void main() {
       Grandson s =new Grandson();

       s.Son();
    }
}
