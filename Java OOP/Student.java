public class Student {
    Integer ID;
    String Name;
    Course Course;

    public Student (Integer ID, String Name, Integer Code, String CourseName) {
        this.ID = ID;
        this.Name = Name;
        this.Course = new Course(Code, CourseName);
    }

    public static void main(String[] args) {
        Student student = new Student(22233575, "Will", 64255, "Maths");
        System.out.println(student.Name);
        System.out.println(student.ID);
        System.out.println(student.Course.CourseName);
        System.out.println(student.Course.Code);
    }

    public String getName() {
        return Name;
    }
    
    public Integer getID() {
        return ID;
    }
}