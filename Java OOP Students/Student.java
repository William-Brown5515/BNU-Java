import java.util.ArrayList;
import java.util.Random;

public class Student {
    Integer ID;
    String Name;
    Course Course;
    ArrayList<Integer> Marks;
    ArrayList<String> grades;

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
        Random random = new Random();
        for (int a = 0; a < 4; a++) {
            examMarks.add(random.nextInt(100));
        }
        this.Marks = examMarks;
    }

    public void giveGrades() {
        ArrayList<String> grades = new ArrayList<String>();
        for (int b = 0; b < 4; b++) {
            if (this.Marks.get(b) > 89) {
                grades.add("A*");
            }
            else if (this.Marks.get(b) > 79) {
                grades.add("A");
            }
            else if (this.Marks.get(b) > 69) {
                grades.add("B");
            }
            else if (this.Marks.get(b) > 59) {
                grades.add("C");
            }
            else if (this.Marks.get(b) > 49) {
                grades.add("D");
            }
            else if (this.Marks.get(b) > 39) {
                grades.add("E");
            }
            else if (this.Marks.get(b) > 29) {
                grades.add("F");
            }
            else {
                grades.add("U");
            }
        }
        this.grades = grades;
    }

    public void viewGrades() {
        for (int c = 0; c < 4; c++) {
            System.out.print("The grade for module ");
            System.out.print(this.Course.Modules.get(c).Name);
            System.out.print(" was ");
            System.out.println(this.grades.get(c));
        }
    }

    public void markModule() {

        for (int i = 0; i < 4; i++) {
            System.out.print("The marks for the module ");
            System.out.print(this.Course.Modules.get(i).Name);
            System.out.print(" with the module code ");
            System.out.print((this.Course.Modules.get(i)).Name);
            System.out.print(" was ");
            System.out.println(this.Marks.get(i));
        }
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