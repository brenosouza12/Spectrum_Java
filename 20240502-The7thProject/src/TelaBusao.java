import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBusao extends JFrame{
    private JTextField txtPrefixo;
    private JTextField txtModeloBus;
    private JTextField txtChassi;
    private JTextField txtAno;
    private JTextField txtPlaca;
    private JButton Cadastrarbutton;
    private JButton MostrarButton;
    private JButton LocalizarButton;
    private JButton EditarButton;
    private JButton ApagarButton;
    public JPanel PainelPrincipal;


    public TelaBusao() {
        Cadastrarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               Bus b = new Bus(Integer.parseInt(txtPrefixo.getText()),txtModeloBus.getText(),
                       txtChassi.getText(), txtAno.getText(),txtPlaca.getText());

                System.out.printf(b.getModeloBus());

            }
        });
        LocalizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        EditarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ApagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
