interface College
{
    void cashing();
    void document();
}
interface Department
{
    void papers();
}
interface class_room
{
    void marks();

}

class staff implements College,Department,class_room
{
    public void cashing()
    {
        System.out.println("cashing");
    }
    public void document()
    {
        System.out.println("documents");
    }
    public void papers()
    {
        System.out.println("Exam papers");
    }
    public void marks()
    {
        System.out.println("exam marks");
    }
}


public class multiple_inheritance {
    static void main() {
       staff s =new staff();

       s.papers();
    }
}
