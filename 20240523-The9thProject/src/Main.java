import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<People> peoples = new ArrayList<>();
        Student student = new Student("Elizabeth Spectrum",20414,"122377","Javascript");
        student.enterClass("React");

        peoples.add(student);

        System.out.println(student.getName());
        System.out.println(student.getCourse());
        System.out.println(peoples.getFirst().getId());

        Teacher teacher = new Teacher("Madison Villehardt",20915,"231277","Programation");
        peoples.add(teacher);

        student = new Student("Lisa Valiant",10414,"772312","React");
        peoples.add(student);

        teacher = new Teacher("Audrey Spring",3414,"03042014","Math");
        peoples.add(teacher);

//        Student s = (Student) peoples.getFirst();
//        System.out.println("Student Course : " + s.getCourse());

        System.out.println("=====================");

        for(People p : peoples){

            System.out.println("=====================");
            System.out.println(p.getName());
            System.out.println("=====================");
            System.out.println(p.getId());
            System.out.println("=====================");
            System.out.println(p.getPassword());
            System.out.println("=====================");
            if(p instanceof Student){

                Student s = (Student) p;
                System.out.println(s.getCourse());
            }else if(p instanceof Teacher){

                Teacher teacher1 = (Teacher) p;
                System.out.println(teacher1.getArea());

            }

        }

        System.out.println("=====================");

        }
    }
