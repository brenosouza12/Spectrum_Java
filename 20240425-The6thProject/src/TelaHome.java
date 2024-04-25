import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaHome extends JFrame {
    public JPanel painelPrincipal;
    private JTextField txtName;
    private JButton btnSend;

    public TelaHome() {
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                         "Hello "  + txtName.getText() );
            }
        });
    }
}
