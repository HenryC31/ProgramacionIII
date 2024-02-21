import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

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

		JPanel login = new JPanel();
		login.setSize((this.getWidth() / 2), (this.getHeight() - 40));
		login.setBackground(Color.gray);
		login.setLayout(null);

		JLabel login_tag = new JLabel("ACCEDER", 0);
		login_tag.setSize(220, 70);
		login_tag.setForeground(Color.white);
		login_tag.setFont(new Font("Bradley Hand ITC Normal", Font.BOLD, 40));
		login_tag.setLocation(120, 20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		this.getContentPane().add(login_tag);

		JLabel id_tag = new JLabel("Usuario:");
		id_tag.setBounds(80, 120, 120, 40);
		id_tag.setFont(new Font("Bradley Hand ITC Normal", Font.BOLD, 25));
		this.getContentPane().add(id_tag);

		JTextField id_txt_field = new JTextField();
		id_txt_field.setBounds(80, 170, 300, 25);
		this.getContentPane().add(id_txt_field);

		JLabel pw_tag = new JLabel("Contraseña:");
		pw_tag.setBounds(80, 210, 200, 40);
		pw_tag.setFont(new Font("Bradley Hand ITC Normal", Font.BOLD, 25));
		this.getContentPane().add(pw_tag);

		JPasswordField psw_field = new JPasswordField();
		psw_field.setBounds(80, 260, 300, 25);
		this.getContentPane().add(psw_field);

		JCheckBox recordar_chkbox = new JCheckBox("Recordarme");
		recordar_chkbox.setBounds(80, 295, 100, 25);
		recordar_chkbox.setOpaque(false);
		this.getContentPane().add(recordar_chkbox);

		JLabel olvidaste_tag = new JLabel("<html> <u>¿Olvidaste tu contraseña?</u></html>");
		olvidaste_tag.setBounds(225, 290, 185, 40);
		this.getContentPane().add(olvidaste_tag);

		JButton login_btn = new JButton("Ingresar");
		login_btn.setBounds(165, 370, 130, 40);
		login_btn.setFont(new Font("Bradley Hand ITC Normal", Font.BOLD, 20));
		this.getContentPane().add(login_btn);

		JPanel registro = new JPanel();
		registro.setSize(this.getWidth() / 2, this.getHeight());
		registro.setLocation(500, 1);
		registro.setBackground(Color.gray);
		// this.getContentPane().add(registro);

		this.add(login);
	}

}