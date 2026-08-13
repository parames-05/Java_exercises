class Shapes {

    int area(int a) {
        return a*a;
    }

    int area(int a, int b) {
        return a*b;
    }

    float area(float a, int b, int c) {
        return (float) a*b*c;
    }

    double area(double a, int b){
        return a*b*b;
    }
}

public class overloading_task {
    public static void main(String[] args) {

        Shapes c = new Shapes();

        System.out.println(c.area(10));
        System.out.println(c.area(10, 20));
        System.out.println(c.area(0.5f, 20,30));
        System.out.println(c.area(3.14325364,4));
    }
}