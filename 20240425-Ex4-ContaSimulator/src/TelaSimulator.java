import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSimulator extends JFrame {

    Conta c = new Conta(1,"Louise",212.0f);
    public JPanel painelPrincipal;
    private JTextField txtSaque;
    private JButton sacarButton;
    private JButton depositarButton;
    private JLabel lblSaldo;
    private JTextField txtDeposito;

    public TelaSimulator() {

        lblSaldo.setText(Float.toString(c.getSaldo()));
        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(txtSaque.getText());
                c.sacar(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));

            }
        });
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
