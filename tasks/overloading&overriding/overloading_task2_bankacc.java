import java.util.Scanner;

class BankAcc {
    double deposit(int a, String b) {
        if (b.equals("savings")){
            return  a + 0.06*a;
        }
        return a+0.02*a;

    }
    double deposit(int a, String b,String c) {
        double result=0;
        if (b.equals("savings")){
            result= a + 0.06*a;
        }
        result= a+0.02*a;
        System.out.println("\n");
        System.out.println("Description: "+ c);
        return result;
    }

    double deposit(int a, String b,String c, int id) {
        double result=0;
        if (b.equals("savings")){
            result= a + 0.06*a;
        }
        result= a+0.02*a;
        System.out.println("\n");
        System.out.println("Description: "+c);
        System.out.println("Account id: "+id);
        return result;
    }
}

public class overloading_task2_bankacc{
    public static void main(String[] args) {

        BankAcc c = new BankAcc();
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        System.out.println(c.deposit(10,txt));
        System.out.println(c.deposit(10,"ssss","Depositting amt"));
        System.out.println(c.deposit(10,txt,"Depo",123));
    }
}