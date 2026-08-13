import java.util.*;
class LowBalance extends RuntimeException{
    public LowBalance(String er){
        super(er);
    }
}
public class custom_excep {
    public static void main(String[] args) throws LowBalance{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int bal = 1000;
        int withdraw = sc.nextInt();
        if (withdraw<=bal){
            System.out.println("Withdrawing Amount.....Please Wait ");
        }
        else{
            throw new LowBalance("Insuffcient Balance...");
        }

    }
}
