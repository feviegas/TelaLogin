package controle;

import modelo.Usuario;
import visao.TelaUsuario;
import dao.AutenticaDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutenticaUser implements ActionListener {
    
    private TelaUsuario tel;
    private Usuario user;
    private AutenticaDAO autDao;
    
    public AutenticaUser(TelaUsuario tel, Usuario user) {
        this.tel = tel;
        this.user = user;
        autDao = new AutenticaDAO();
        verificaAutentica();
    }
            
    public void verificaAutentica() {
        tel.getBotaoAutentica().addActionListener(this);
        tel.getBotaoLimpa().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Autentica")) {
            String usuario = tel.getFieldUsuario().getText();
            String senha = tel.getFieldSenha().getText();
            user.setUsuario(usuario);
            user.setSenha(senha);
            boolean resultado = autDao.autenticaUser(user);
            
            if (resultado) {
                System.out.println("Usuário autenticado com sucesso!");
            } else {
                System.out.println("Falha na autenticação do usuário.");
                tel.getFieldUsuario().setText(" ");
                tel.getFieldSenha().setText(" ");
            }

        } else if (e.getActionCommand().equals("Limpa")) {
            tel.getFieldUsuario().setText("");
            tel.getFieldSenha().setText("");
        }
    }
}
