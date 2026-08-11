interface College{
    void admission();
    void cashing();
}
class student implements College{
    @Override
    public void admission(){
        System.out.println("Admission");

    }

    @Override
    public void cashing()
    {
        System.out.println("Moneyyyy Moneyyy Moneyyyyy");
    }
}

public class demo_abstract {
    public static void main(String[] args){
        student s = new student();
    }
}
