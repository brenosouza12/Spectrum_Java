import javax.swing.*;
 public class Main {

     public static void main(String[] args) {

         TelaBusao t = new TelaBusao();
         t.setContentPane(t.PainelPrincipal);
         t.setTitle("Spectrum Bus");
         t.setSize(400,300);
         t.setVisible(true);
         t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
 }