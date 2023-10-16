import java.util.ArrayList;

public class Course {
    Integer Code;
    String CourseName;
    ArrayList<Module> Modules;

    public Course (Integer Code, String CourseName) {
        this.Code = Code;
        this.CourseName = CourseName;
        ArrayList<Module> Topics = new ArrayList<Module>();
        Topics.add(new Module("Maths", 1111));
        Topics.add(new Module("English", 2222));
        Topics.add(new Module("Science", 3333));
        Topics.add(new Module("History", 4444));
        this.Modules = Topics;
    }

    public static void main(String[] args) {
        Course uniCourse = new Course (737628, "Maths");
        System.out.println(uniCourse.Code);
        System.out.println(uniCourse.CourseName);
    }

    public void seeDetails() {
        System.out.println(this.Modules.get(0));
        System.out.println(this.Modules.get(1));
        System.out.println(this.Modules.get(2));
        System.out.println(this.Modules.get(3));
    }
}