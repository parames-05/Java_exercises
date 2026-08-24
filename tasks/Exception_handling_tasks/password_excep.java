import java.util.*;
class pwlen extends RuntimeException{
    public pwlen(String er){
        super(er);
    }
}

class pwmatch extends RuntimeException{
    public pwmatch(String err){
        super(err);
    }
}

public class password_excep {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String pw = sc.nextLine();
        if(pw.length()<8){
            throw new pwlen("Password must be more than 8 characters");
        }
        System.out.println("Reenter password again: ");
        String recheck = sc.nextLine();
        if (pw.equals(recheck)){
            System.out.println("Password Accepted :) ");
        }
        else{
            throw new pwmatch("Password does not match :( ");
        }

    }
}
