import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaBusao extends JFrame {
    private JTextField txtPrefixo;
    private JTextField txtModeloBus;
    private JTextField txtAno;
    private JButton Cadastrarbutton;
    private JButton MostrarButton;
    private JButton LocalizarButton;
    private JButton EditarButton;
    private JButton ApagarButton;
    public JPanel PainelPrincipal;

    // Lista para armazenar os ônibus cadastrados
    private final ArrayList<Bus> listaOnibus;

    public TelaBusao() {
        listaOnibus = new ArrayList<>();

        Cadastrarbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cadastrar um novo ônibus
                Bus b = new Bus(Integer.parseInt(txtPrefixo.getText()), txtModeloBus.getText(), txtAno.getText());

                // Adicionar o ônibus à lista
                listaOnibus.add(b);

                // Limpar os campos após cadastrar
                limparCampos();
            }
        });

        LocalizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Localizar um ônibus pelo prefixo
                int prefixo = Integer.parseInt(txtPrefixo.getText());
                for (Bus b : listaOnibus) {
                    if (b.getPrefixo() == prefixo) {
                        JOptionPane.showMessageDialog(null, "Ônibus encontrado:\n" + b.getPrefixo());
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Ônibus não encontrado.");
            }
        });

        EditarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Editar um ônibus pelo prefixo
                int prefixo = Integer.parseInt(txtPrefixo.getText());
                for (Bus b : listaOnibus) {
                    if (b.getPrefixo() == prefixo) {
                        // Atualizar os dados do ônibus
                        b.setModeloBus(txtModeloBus.getText());
                        b.setAnoBus(txtAno.getText());
                        JOptionPane.showMessageDialog(null, "Ônibus editado com sucesso.");
                        limparCampos();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Ônibus não encontrado.");
            }
        });

        ApagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Apagar um ônibus pelo prefixo
                int prefixo = Integer.parseInt(txtPrefixo.getText());
                for (Bus b : listaOnibus) {
                    if (b.getPrefixo() == prefixo) {
                        listaOnibus.remove(b);
                        JOptionPane.showMessageDialog(null, "Ônibus removido.");
                        limparCampos();
                        return;
                    }
                }
                JOptionPane.showMessageDialog(null, "Ônibus não encontrado.");
            }
        });

        MostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar todos os ônibus cadastrados
                for (Bus b : listaOnibus) {

                    JOptionPane.showMessageDialog(null, "Lista de ônibus cadastrados:\n" + "Prefixo:\n" + b.getPrefixo() + "\nModelo:\n" + b.getModeloBus() + "\nAno:\n" + b.getAnoBus());

                }

            }
        });
    }

    // Método para limpar os campos de entrada
    private void limparCampos() {
        txtPrefixo.setText("");
        txtModeloBus.setText("");
        txtAno.setText("");
    }
}
