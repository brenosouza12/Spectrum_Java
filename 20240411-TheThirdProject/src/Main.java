import javax.swing.*;

public class Main {

    public static void main(String[] args){

        String name="Lizzie Hunter", userName="MainVocalTw17";

        name = JOptionPane.showInputDialog("Name");
        userName = JOptionPane.showInputDialog("userName");

        if(name.equals(userName)){

            System.out.println("Iguais");

        }else{

            System.out.println("Diferentes");

        }

    }

}