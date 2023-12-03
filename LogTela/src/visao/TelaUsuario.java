package visao;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.BevelBorder;

public class TelaUsuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField fieldUsuario;
    private JTextField fieldSenha;
    private JButton botaoLimpa;
    private JButton botaoAutentica;

    public TelaUsuario() {
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 321, 252);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Usuário");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel.add(lblNewLabel);

        fieldUsuario = new JTextField();
        panel.add(fieldUsuario);
        fieldUsuario.setColumns(24);

        JLabel lblNewLabel_1 = new JLabel("Senha");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
        panel.add(lblNewLabel_1);

        fieldSenha = new JTextField();
        panel.add(fieldSenha);
        fieldSenha.setColumns(20);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.PINK);
        panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel_1, BorderLayout.SOUTH);

        botaoAutentica = new JButton("Autentica");
        panel_1.add(botaoAutentica);

        botaoLimpa = new JButton("Limpa");
        panel_1.add(botaoLimpa);
    }

    public JButton getBotaoAutentica() {
        return botaoAutentica;
    }

    public JButton getBotaoLimpa() {
        return botaoLimpa;
    }

    public JTextField getFieldUsuario() {
        return fieldUsuario;
    }

    public JTextField getFieldSenha() {
        return fieldSenha;
    }
}

