package controle;

import modelo.Usuario;
import visao.TelaUsuario;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		TelaUsuario user = new TelaUsuario();
		user.setTitle("Tela Usuário");
		user.setVisible(true);
		Usuario usuario = new Usuario();
		AutenticaUser autUser = new AutenticaUser(user, usuario);
		
		
		
		
	}

}
