public class Student extends People {

    private String course;

    public Student(String name, int id, String password, String course) {
        super(name, id, password);
        this.course = course;
    }

    public void enterClass(String course){

        this.setCourse(course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
