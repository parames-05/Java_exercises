class BankAccount {
    static String bankName = "Mariamman Indian Bank";
    private String customerName;
    private double balance;
    private int acc_no;
    private int ph_no;
    private String acc_type;

    BankAccount(String name, double initialBalance, int num, int mob, String typeee) {
        this.customerName = name;
        this.balance = initialBalance;
        this.acc_no = num;
        this.ph_no=mob;
        this.acc_type=typeee;
    }

    int getPh_no(){
        return ph_no;
    }

    void set_newph(int a){
        ph_no = a;
        System.out.println("Phone Number is updated to: "+getPh_no());
    }
    void deposit(double amt){
        if (amt<=0){
            System.out.println("Invalid amount...Amount must be more than 0");
        }
        else{
            balance+=amt;
        }
    }
    void withdraw(double amt){
        if(balance>=amt){
            balance-=amt;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    void dispaccdeets(){
        System.out.println("==========================================");
        System.out.println("         Mariamman New Indian Bank        ");
        System.out.println("==========================================");
        System.out.println(" Account Holder: " + customerName);
        System.out.println(" Account Number: " + acc_no);
        System.out.println(" Account Type: " + acc_type);
        System.out.println(" Phone Number: " + ph_no);
        System.out.println(" Balance: " + balance);
        System.out.println(" End of Account Holder details");
        System.out.println(" ========================================");
        System.out.println("\n");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to " + BankAccount.bankName);
        BankAccount account1 = new BankAccount("Arun", 5000.0,1001,12345678,"Savings");
        BankAccount account2 = new BankAccount("Priya", 7500.0,1002,123456789,"Current");
        BankAccount account3 = new BankAccount("Arjun", 71500.0,1003,987654321,"Credit");
        BankAccount.bankName = "Mariamman New Indian Bank";
        account1.set_newph(222333444);
        account1.withdraw(10000);
        account2.deposit(10000000);
        account2.withdraw(1000000000);
        account1.deposit(-3);
        account1.dispaccdeets();
        account2.dispaccdeets();
        account3.dispaccdeets();
    }
}





