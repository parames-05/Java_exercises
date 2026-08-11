import java.util.*;
class classroom {
    int class_room = 104;

    class subject {
        int code = 2042;
        String staff = "Santosh Sir";
    }
}

public class nested_class {
    public static void main(String[] args) {
        classroom obj = new classroom();
        System.out.println("Classroom: " + obj.class_room);
        classroom.subject sub = obj.new subject();
        System.out.println("Subject Code: " + sub.code);
        System.out.println("Staff: " + sub.staff);
    }
}


