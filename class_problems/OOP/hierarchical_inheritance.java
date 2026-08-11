class Car
{
    int year = 1990;
    final int cost = 100000;
    String name ="car";
    void car()
    {
       // cost = 200000; //int cost = 200000; is possible
        System.out.println("1990's car model and cost is"+cost);
    }

}
class toyota extends Car{
    int cost = 200000;
    void toyota()
    {
        System.out.println("2000's car model and cost is"+super.cost);
    }
}

class honda extends Car{

}

public class hierarchical_inheritance {
    static void main() {
     Car c = new Car();
     toyota t =new toyota();
     t.toyota();

     honda h =new honda();

    }
}
