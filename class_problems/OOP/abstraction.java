    abstract class Car {
        private String model;

        public Car(String model) {
            this.model = model;
        }
        abstract void startEngine();

        public void showModel() {
            System.out.println("Car Model: " + model);
        }
    }

    class Tesla extends Car {
        public Tesla(String model) {
            super(model);
        }

        void startEngine() {
            System.out.println("Electric motor started silently.");
        }
    }

    public class abstraction {
        public static void main(String[] args) {
            Car myCar = new Tesla("Model S");
            myCar.showModel();
            myCar.startEngine();
        }
    }

