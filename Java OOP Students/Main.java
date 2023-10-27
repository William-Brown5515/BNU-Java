import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student(22233575, "Will"));
        student.add(new Student(22233576, "Matteo"));
        student.add(new Student(22233577, "Sean"));
        student.add(new Student(22233578, "Callum"));
        student.add(new Student(22233579, "Yufan"));
        student.add(new Student(22233580, "Lucas"));

        for (int c = 0; c < 6; c++) {
            student.get(c).enroll(11111, "Maths");
            student.get(c).enroll(22222, "Physics");
            student.get(c).enroll(33333, "Biology");
            student.get(c).enroll(44444, "Chemistry");
            student.get(c).enroll(55555, "English");
            student.get(c).enroll(66666, "History");
            student.get(c).seeDetails();
        }

    }
}