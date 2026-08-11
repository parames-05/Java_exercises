public class block_in_class {
    {
        int a=10;
        System.out.println("beginning of the program "+a);
    }
    static void main() {

        System.out.println("this is main program");
        block_in_class b =new block_in_class();
        int a;

        {
            a=10;
            System.out.println(a);
            a+=10;
            System.out.println(a);
        }
        System.out.println(a);
    }
}
