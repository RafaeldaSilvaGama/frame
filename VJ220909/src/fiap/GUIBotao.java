package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIBotao  extends JPanel{
	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;
	
	public GUIBotao() {
		inicializarComponentes();
		definirEventos();
		
	}
	
	private void inicializarComponentes() {
		setLayout(null); //irá "limpar" a tela antes de um novo objeto
		setBackground(Color.cyan); //irá colocar a cor no background
		imageIcon1 = new ImageIcon(getClass().getResource("java_logo.png"));//definir imagem usada
		btMensagem = new JButton("Mensagem", imageIcon1); //inserir texto imagem ao botão
		btMensagem.setBounds(50,20,140,40); //definindo tamanho e posição do botão
		btMensagem.setMnemonic(KeyEvent.VK_M);//adiciona o atalho (Alt + M), pelo keyevent será gerado um atalho, podem podem ser adicionados botões além dos caracteres basicos
		btMensagem.setToolTipText("Clique para ver a mensagem");
		
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50,70,100,30);
		
		add(btMensagem);
		add(btTeimoso);
		
	}
	
	private void definirEventos() {
		btMensagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botao Mensagem");
			}
		});
		
		btTeimoso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,  "Botao Teimoso");
			}
		});
		
		btTeimoso.addMouseListener(new MouseListener() {
			//MouseListener vem de uma classe abistrata, portanto todos os metodos precisam ser gerados, mesmo não utilizados
		
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			
			public void mouseEntered(MouseEvent e) {
				//esse metodo faz q quando o mouse passar por cima do botão, irá gerar uma nova posição aleatória. 
				int x = (int)(Math.random() * 700);//metodo para sortear números aleatórios esse comando irá dar um valor entre 0 e 700. conversão para inteiro se dá pq ele usa numeros naturais e não inteiros.
				int y = (int)(Math.random() * 500); //calcula entre 0 e 500
				btTeimoso.setLocation(x,y);
			}
			
			public void mouseClicked(MouseEvent e) {}
		});
		
	}
	
}
