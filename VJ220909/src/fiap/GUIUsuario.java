package fiap;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIUsuario extends JFrame {

	private JLabel lbNome, lbEndereco, lbNumero, lbBairro, lbCidade;
	private JTextField tfNome, tfEndereco, tfNumero, tfBairro, tfCidade;
	private JButton btSalvar, btCancelar;
	
	public GUIUsuario() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Cadastro de Clientes");
		setBounds(0, 0, 400, 300);
		setLayout(null);
		
		lbNome = new JLabel("Nome:", JLabel.RIGHT);
		lbEndereco = new JLabel("Endereço:", JLabel.RIGHT);
		lbNumero = new JLabel("Número:", JLabel.RIGHT);
		lbBairro = new JLabel("Bairro:", JLabel.RIGHT);
		lbCidade = new JLabel("Cidade:", JLabel.RIGHT);
		tfNome = new JTextField();
		tfEndereco = new JTextField();
		tfNumero = new JTextField();
		tfBairro = new JTextField();
		tfCidade = new JTextField();
		btSalvar = new JButton("Salvar");
		btCancelar = new JButton("Cancelar");
		
		lbNome.setBounds(10, 30, 60, 25);
		tfNome.setBounds(80, 30, 180, 25);
		lbEndereco.setBounds(10, 75, 60, 25);
		tfEndereco.setBounds(80, 75, 290, 25);
		lbNumero.setBounds(10, 120, 60, 25);
		tfNumero.setBounds(80, 120, 50, 25);
		lbBairro.setBounds(140, 120, 60, 25);
		tfBairro.setBounds(210, 120, 160, 25);
		lbCidade.setBounds(10, 165, 60, 25);
		tfCidade.setBounds(80, 165, 180, 25);
		btSalvar.setBounds(90, 220, 100, 25);
		btCancelar.setBounds(195, 220, 100, 25);
		
		add(lbNome);
		add(tfNome);
		add(lbEndereco);
		add(tfEndereco);
		add(lbNumero);
		add(tfNumero);
		add(lbBairro);
		add(tfBairro);
		add(lbCidade);
		add(tfCidade);
		add(btSalvar);
		add(btCancelar);
	}
	
	private void definirEventos() {
		
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");				
			}
		});
		
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void abrir() {
		GUIUsuario cliente = new GUIUsuario();
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		cliente.setLocation((tela.width - cliente.getSize().width) / 2, 
				(tela.height - cliente.getSize().height) / 2);
		cliente.setVisible(true);
	}
	
}














