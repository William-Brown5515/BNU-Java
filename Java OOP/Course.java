public class Course {
    Integer Code;
    String CourseName;

    public Course (Integer Code, String CourseName) {
        this.Code = Code;
        this.CourseName = CourseName;
    }

    public static void main(String[] args) {
        Course uniCourse = new Course (737628, "Maths");
        System.out.println(uniCourse.Code);
        System.out.println(uniCourse.CourseName);
    }
}