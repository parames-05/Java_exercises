import java.util.*;
public class exception_handling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Enter an index to search");
        int ind = sc.nextInt();
        String bbb = null;
        int arr[] ={1,2,3,4,5,6,7,8,9,11,12,14,15,17,20,21,22,23,24};
        try{
            float result = a/b;
            System.out.println("The divided result is "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("\n");
            System.out.println("Don't divide by zero :(");
        }
        try{
            System.out.println(bbb.charAt(0));
        }
        catch(NullPointerException e){
            System.out.println("\n");
            System.out.println("String is null :(");
        }
        try{
            System.out.println("\n");
            System.out.println("Array element at entered position is: "+ arr[ind]);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("\n");
            System.out.println("Array size is exceeded :(");
        }

    }
}
