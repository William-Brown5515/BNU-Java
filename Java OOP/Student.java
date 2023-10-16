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
        ArrayList<Integer> examMarks = new ArrayList<Integer>();
        examMarks.add(89);
        examMarks.add(34);
        examMarks.add(56);
        examMarks.add(69);
        this.Marks = examMarks;
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