import java.util.*;
class InvalidMark extends RuntimeException{
    public InvalidMark(String er){
        super(er);
    }
}

class Array_size extends RuntimeException{
    public Array_size(String err){
        super(err);
    }
}

public class custom_exception_marks_task {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        if(size<5){
            throw new Array_size("Array Size must be more than 5 ");
        }
        System.out.println("Enter Array Elements: ");
        float avg=0;
        float arr[]=new float[size];
            for(int i =0;i<size;i++){
                arr[i]=sc.nextFloat();
                if(arr[i]<0 || arr[i]>100){
                    throw new InvalidMark("Mark entered is less than 0 or more than 100");
                }
                avg+=arr[i];
            }
            float result= avg/size;
            System.out.println("Average Marks of the Students is: "+result);
    }
}
