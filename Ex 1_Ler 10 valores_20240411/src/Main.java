import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int number,TheBigNumber = -1;

        for (int i = 0; i < 10; i++ ){

            do {

                number = Integer.parseInt(JOptionPane.showInputDialog("#" + (i + 1) + " Number: "));

            }while (number < 0 || number > 100);

            if (number > TheBigNumber){

                TheBigNumber = number;
            }
        }

        System.out.println("Big Number: " + TheBigNumber);

    }

}
