class parent{
    void work(){
        System.out.println("Hello");
    }
}
class child extends parent{
    void work(){
        System.out.println("Changed Work");
    }

}
public class poly {
    public static void main(String[] args){
        parent p =new child();
        p.work();
    }
}
