import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        TelaBusao t = new TelaBusao();
        t.setContentPane(t.PainelPrincipal);
        t.setTitle("Tudo é CRUD");
        t.setSize(800, 600);
        t.setLocationRelativeTo(null); // Centraliza a tela
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}