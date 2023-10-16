import java.util.ArrayList;

public class Student {
    Integer ID;
    String Name;
    Course Course;
    ArrayList<Integer> Marks;

    public Student (Integer ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public static void main(String[] args) {
        Student student = new Student(22233575, "Will");
        student.enroll(8217862, "Science");

        System.out.println(student.Name);
        System.out.println(student.ID);
        System.out.println(student.Course.CourseName);
        System.out.println(student.Course.Code);
        System.out.println(student);
    }

    public void enroll(Integer Code, String CourseName) {
        Course course = new Course(Code, CourseName);
        this.Course = course;
    }

    public void giveMarks() {
        ArrayList<Integer> Marks = new ArrayList<Integer>();
        Marks.add(89);
        Marks.add(34);
        Marks.add(56);
        Marks.add(69);
    }

    public String getName() {
        return Name;
    }
    
    public Integer getID() {
        return ID;
    }

    public void seeDetails() { 
        System.out.println(this.Name);
        System.out.println(this.ID);
        System.out.println(this.Course.CourseName);
        System.out.println(this.Course.Code);
    }
}