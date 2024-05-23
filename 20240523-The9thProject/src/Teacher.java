public class Teacher extends People {

    private String area;

    public Teacher(String name, int id, String password, String area) {
        super(name, id, password);
        this.area = area;
    }

    public void makeSchoolCall(){

        System.out.println("Audrey Spring");
        System.out.println("Elizabeth Spectrum");
        System.out.println("Lisa Valiant");
        System.out.println("Violet Soul");

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
