class PriceException extends Exception {
    PriceException(String msg) {
        super(msg);
    }
}

public class throws_demo {

    static void checkPrice(int price) throws PriceException {
        if (price < 100)
            throw new PriceException("Price is below 100");
    }

    public static void main(String[] args) {

        int[] price = {50, 120, -20, 80, 150};

        for (int p : price) {

            if (p < 0)
                continue;

            try {
                if (p > 100)
                    throw new PriceException("Price is above 100");

                checkPrice(p);

                System.out.println(p + " is valid");
            }
            catch (PriceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
