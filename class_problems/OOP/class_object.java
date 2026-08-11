class water_bottle
{
    int weight = 500;
    String name = "bottle";
    void water_bottle()
    {
        int cost =250;
        System.out.println("to carry some water "+cost);
    }
}

public class class_object {
    static void main() {
       water_bottle w = new water_bottle();

        System.out.println(w.name);
        System.out.println(w.weight);
        w.water_bottle();
    }
}
