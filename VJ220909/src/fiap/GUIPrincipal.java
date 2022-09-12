package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame{
	
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao;
	
	public GUIPrincipal() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		//preparação do formulário
		setTitle("Janela Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		
		//barra de menu
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');//usar apostrofos //gera um atalho no teclado, q será executado com Alt + o que estiver entre apostrofos
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		
		//itens de menu
		miSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		miBotao = new JMenuItem("Botao");
		
		//definir posição
		setJMenuBar(mnBarra);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		mnArquivo.add(miSair);
		mnExemplos.add(miBotao);
				
	}
	
	private void definirEventos() {
		//adicionar ações aos botões
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		miBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//aqui vai o codigo para chamar os exemplos
				GUIBotao botao = new GUIBotao();
				contentPane.removeAll();//limpa antes de adicionar
				contentPane.add(botao);
				contentPane.validate();
				
			}
		});
		
		
		
	}
	
	public void abrir() {
		GUIPrincipal frame = new GUIPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//posicionando na tela
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width-frame.getSize().width)/2,(tela.height-frame.getSize().height)/2);
		frame.setVisible(true);
		}
		
	
	
	

}
