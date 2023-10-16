public class Student {
    Integer ID;
    String Name;
    Course Course;

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
    }

    public void enroll(Integer Code, String CourseName) {
        Course course = new Course(Code, CourseName);
        this.Course = course;
    }

    public String getName() {
        return Name;
    }
    
    public Integer getID() {
        return ID;
    }
}