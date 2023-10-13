public class Student {
    Integer ID;
    String Name;
    public Student (Integer ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }
    public static void main(String[] args) {
        Student student = new Student(22233575, "Will");
        System.out.println(student.Name);
        System.out.println(student.ID);
    }
}