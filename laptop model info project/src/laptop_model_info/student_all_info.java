package laptop_model_info;

interface student_info {
    final String name = "Md. samir amin";
    final int ID = 1935202534;

    default void data() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + ID);
        System.out.println("\n------------");
    }
}

interface student_course extends student_info {
    default void course_code() {

        System.out.println("CSE 115: Object Oriented Programming\n--------");
        System.out.println("CSE 116: Object Oriented Programming Lab\n--------");
        System.out.println("CSE 307: Discrete Mathematics\n--------");
        System.out.println("CSE 103: Vector Geometry\n-------");
        System.out.println("CSE 201: EEE \n-------");
    }
}

public class student_all_info implements student_info, student_course {
    public static void main(String[] args) {
        student_all_info a = new student_all_info();
        System.out.println("");
        a.data();
        a.course_code();
    }
}
