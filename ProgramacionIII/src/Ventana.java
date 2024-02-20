import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	// Componentes siempre tienen:
	// Size
	// Location
	// Background - opaque
	// String en constructor

	public Ventana() {
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(null);

		this.iniciarComponentes();
	}

	private void iniciarComponentes() {
		JLabel login_tag = new JLabel("ACCEDER", 0);
		login_tag.setVisible(true);
		login_tag.setSize(220, 70);
		login_tag.setForeground(Color.white);
		login_tag.setFont(new Font("Bradley Hand ITC Normal", Font.BOLD, 40));
		login_tag.setLocation(100, 20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		this.add(login_tag);

		JPanel login = new JPanel();
		login.setSize(this.getWidth() / 2, this.getHeight());
		login.setBackground(Color.magenta);
		login.setLayout(null);
		this.add(login);

		JPanel registro = new JPanel();
		registro.setSize(this.getWidth() / 2, this.getHeight());
		registro.setLocation(500, 1);
		registro.setBackground(Color.gray);
		// this.getContentPane().add(registro);
	}

}