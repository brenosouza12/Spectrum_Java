
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args){
//
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = keyboard.nextLine();
//        System.out.print("Note: ");
//        float note = keyboard.nextFloat();
//
//        System.out.printf("A nota do aluno(a) %s foi %.1f", name, note);
//
//    }
//
//}

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Name: ");
//        String name = keyboard.nextLine();
//
//        System.out.print("Note 1: ");
//        float note1 = keyboard.nextFloat();
//
//        System.out.print("Note 2: ");
//        float note2 = keyboard.nextFloat();
//
//        System.out.print("Note 3: ");
//        float note3 = keyboard.nextFloat();
//
//        float average = (note1 + note2 + note3) / 3;
//
//        System.out.printf("A nota do aluno(a) %s foi:\n", name);
//        System.out.printf("Note 1: %.1f\n", note1);
//        System.out.printf("Note 2: %.1f\n", note2);
//        System.out.printf("Note 3: %.1f\n", note3);
//        System.out.printf("Média: %.1f\n", average);
//
//        float passingGrade = 6;
//
//        if (average >= passingGrade) {
//            System.out.println("Situação: Voce merece um lugar no céu, GOOD JOB");
//        } else {
//            System.out.println("Situação: Caraaa, tu foi jogar no vasco :(");
//        }

//        JOptionPane.showMessageDialog(null,"Hello World!");
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Your age:"));
//        System.out.println(age);

//        System.out.println(JOptionPane.showConfirmDialog(null,"Guess Who?"));

        //int to str
        int age = 9;
        String Text = Integer.toString(age);
        System.out.println("Convert Text: " + Text);

        //str to int

        String textToConvert = "12";
        int ConvertValue = Integer.parseInt(textToConvert);
        System.out.println("Convert Value: " + ConvertValue);

        // str to float

        textToConvert = "3.04";
        float ConvertFloat = Float.parseFloat(textToConvert);
        ConvertFloat += 1.5f;
        System.out.println("Convert Float: " + ConvertFloat);

    }
}

