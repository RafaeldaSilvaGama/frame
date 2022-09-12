package fiap;
import java.awt.*;
import javax.swing.*;

public class UsaUsuario {
	public static void main(String[] args) {
		GUIUsuario cliente = new GUIUsuario();
		cliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		cliente.setLocation((tela.width - cliente.getSize().width) / 2, 
				(tela.height - cliente.getSize().height) / 2);
		cliente.setVisible(true);
	}
}
