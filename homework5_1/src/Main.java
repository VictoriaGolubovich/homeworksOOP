import model.Teacher;
import model.Student;
import model.User;
public class Main {
    public static void main(String[] args) {
        User u1 = new Student(21, "Юрий");
        User u2 = new Teacher(40, "Иван");
        User u3 = new Student(22, "Сергей");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}