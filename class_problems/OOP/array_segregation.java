import java.util.Scanner;

public class array_segregation {
    static void main() {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int itr;
        int[] arr = new int[size];
        for(itr=0;itr<size;itr+=1)
            arr[itr]  = input.nextInt();
        int s_ind,c_ind,temp;
        for(s_ind=0,c_ind=0;s_ind<size;s_ind+=1)
        {
            if(arr[s_ind]%10!=0)
            {
                /*temp = arr[s_ind];
                arr[s_ind] = arr[c_ind];
                arr[c_ind] = temp;
                c_ind++;*/
                temp = arr[s_ind];
                for(itr=s_ind;itr>c_ind;itr-=1)
                    arr[itr] = arr[itr-1];
                arr[c_ind] = temp;
                c_ind+=1;
            }
        }
        for(int ele : arr)
            System.out.print(ele+" ");

    }
}
