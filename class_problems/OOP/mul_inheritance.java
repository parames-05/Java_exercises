interface Owner {
    void ownerName();
}
interface Fuel {
    void fuelType();
}
class TataNano implements Owner, Fuel {

    public void ownerName() {
        System.out.println("Owner: Rahul");
    }

    public void fuelType() {
        System.out.println("Fuel: Petrol");
    }

    void carName() {
        System.out.println("Car: Tata Nano");
    }
}

public class mul_inheritance {
    public static void main(String[] args) {
        TataNano car = new TataNano();
        car.carName();
        car.ownerName();
        car.fuelType();
    }
}
