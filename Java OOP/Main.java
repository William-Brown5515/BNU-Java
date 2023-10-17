public class Main {
    public static void main(String[] args) {
        Student a = new Student(22233575, "Will");
        a.enroll(62455, "DTS Degree");
        a.seeDetails();
        Course b = new Course(9876, "All");
        b.seeDetails();
        a.giveMarks();
        a.markModule();
        a.giveGrades();
        a.viewGrades();
    }
}