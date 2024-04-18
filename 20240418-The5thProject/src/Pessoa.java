import com.sun.security.jgss.GSSUtil;

public class Pessoa {
    private int age;
    private String name;

    public Pessoa (String n, int i){

        this.name = n;
        this.age =  i;
    }

    public int getAge(){

        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int i){

        this.age =  i;
    }

//    public void sayHello(){
//
//        System.out.println("Hello");
//    }
}
