interface College1
{
    void admission();
    void cashing();
}
class stud implements College1
{
    @Override
    public void admission()
    {
        System.out.println("adding students");
    }
    @Override
    public void cashing()
    {
        System.out.println("money paytm gpay");
    }
}


public class Interface_demo {
    static void main() {
      stud s =new stud();

    }
}
