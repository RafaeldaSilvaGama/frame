package fiap;

import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUILogin extends JFrame {
	private JTextField tfLogin;
	private JLabel lbLogin;
	private JLabel lbSenha;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	
	public GUILogin() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		//definindo o formulário
		setTitle("Login do Sistema");
		setBounds(0,0,300,200);
		setLayout(null);
		
		//criando objetos para o formulário
		tfLogin = new JTextField();
		pfSenha = new JPasswordField();
		lbSenha = new JLabel("Senha:");
		lbLogin = new JLabel("Login:");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		
		//defindo tamanho e posição dos objetos
		lbLogin.setBounds(50, 30, 80, 25); //x,y,larg,alt
		tfLogin.setBounds(120, 30, 120, 25);
		lbSenha.setBounds(50, 75, 80, 25);
		pfSenha.setBounds(120, 75, 120, 25);
		btLogar.setBounds(40, 120, 100, 25);
		btCancelar.setBounds(145, 120, 100, 25);
		
		//adicionando os objetos ao formulário
		add(lbLogin);
		add(tfLogin);
		add(lbSenha);
		add(pfSenha);
		add(btLogar);
		add(btCancelar);
	}
	
	private void definirEventos() {
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		btLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String senha = 
					String.valueOf(pfSenha.getPassword());
				if (tfLogin.getText().equals("fiap") && 
						senha.equals("123abc")) {
					setVisible(false);
					//Abrir a janela principal do Sistema
					//GUIUsuario frame = new GUIUsuario();
					GUIPrincipal frame = new GUIPrincipal();
					frame.abrir();
				} else {
					JOptionPane.showMessageDialog(
							null, "Login ou senha errados!");
				}
			}
		});
		
	}
	
}










