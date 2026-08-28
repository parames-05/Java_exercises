class OrderProcessing extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order " + i + " is being processed");

            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}


class Kitchen extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Kitchen is preparing Order " + i);

            try {
                Thread.sleep(1200);
            }
            catch (Exception e) {
            }
        }
    }
}


class Delivery extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Order " + i + " is out for delivery");

            try {
                Thread.sleep(1500);
            }
            catch (Exception e) {
            }
        }
    }
}


public class multi_threading_task {

    public static void main(String[] args) {

        OrderProcessing order = new OrderProcessing();
        Kitchen kitchen = new Kitchen();
        Delivery delivery = new Delivery();

        order.start();
        kitchen.start();
        delivery.start();
    }
}