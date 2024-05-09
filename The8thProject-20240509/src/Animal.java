public class Animal {

    private String name;
    private int age;
    private String habitat;
    private String typeOfAnimal;
    public boolean abilitySpeak;

    public Animal(String name, int age, String habitat, String typeOfAnimal, boolean abilitySpeak) {

        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.typeOfAnimal = typeOfAnimal;
        this.abilitySpeak = abilitySpeak;

    }

    public void eat() {

        System.out.println(getName() + " is eating");

    }

    public void sleep() {

        System.out.println(getName() + " is sleeping");

    }

    public void makeSound() {

        switch (typeOfAnimal) {

            case "Lion":
                roar();
                break;
            case "Elephant":
                noiseTrumpet();
                break;
            case "Parrot":
                if (abilitySpeak) {
                    speak();
                } else {

                    System.out.println(getName() + " is making other sounds.");
                }
                break;
            default:
                System.out.println("Generic animal sound.");

        }
    }

    public void roar() {

        System.out.println(getName() + " is roaring!");

    }

    public void noiseTrumpet() {

        System.out.println(getName() + " is making a trumpet noise!");

    }

    public void speak() {

        System.out.println(getName() + " is speaking now (Taylor Swift reference)");

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public String getHabitat() {

        return habitat;

    }

    public void setHabitat(String habitat) {

        this.habitat = habitat;

    }

    public String getTypeOfAnimal() {

        return typeOfAnimal;

    }

    public void setTypeOfAnimal(String typeOfAnimal) {

        this.typeOfAnimal = typeOfAnimal;

    }
}
