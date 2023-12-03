package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import modelo.Usuario;
import visao.TelaUsuario;

public class AutenticaDAO {
    
    File arq = new File("src/senhas.txt");
    TelaUsuario user;
    
    
    public boolean autenticaUser(Usuario user) {
        boolean resp = false;
        boolean usuarioEncontrado = false; 
        
        try {
            FileReader fr = new FileReader(arq);
            BufferedReader br = new BufferedReader(fr);
            
            String linha;
            String[] campos = new String[2];
            
            while ((linha = br.readLine()) != null && !usuarioEncontrado) { 
                campos = linha.split("#");
                
                if (campos[0].equals(user.getUsuario()) && campos[1].equals(user.getSenha())) {
                    System.out.println("Usuário Correto");
                    resp = true; 
                    usuarioEncontrado = true; 
                }
            }
            
            br.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (!usuarioEncontrado) {
            System.out.println("Usuário Incorreto");
        }
        
        return resp;
    }
}


