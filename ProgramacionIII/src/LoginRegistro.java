import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginRegistro {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txt_nombre;
	private JTextField txt_apellido;
	private JTextField txt_correo;
	private JPasswordField psw_contra;
	private JPasswordField psw_confirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginRegistro window = new LoginRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginRegistro() {
		initialize();
	}

	public void login() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(155, 23, 332, 73);
		panel.add(lblNewLabel);

		JLabel lbl_Usuario_1 = new JLabel("Usuario");
		lbl_Usuario_1.setForeground(new Color(108, 108, 108));
		lbl_Usuario_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbl_Usuario_1.setBounds(110, 170, 170, 50);
		panel.add(lbl_Usuario_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(110, 219, 409, 38);
		panel.add(textField);
		textField.setColumns(10);

		JLabel lbl_Usuario_1_1 = new JLabel("Contraseña");
		lbl_Usuario_1_1.setForeground(new Color(108, 108, 108));
		lbl_Usuario_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbl_Usuario_1_1.setBounds(110, 324, 170, 50);
		panel.add(lbl_Usuario_1_1);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(110, 374, 409, 38);
		panel.add(passwordField);

		JButton btn_Entrar = new JButton("Entrar");
		btn_Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane optionPane = new JOptionPane("Error al Iniciar Sesión\nRegistrese primero",
						JOptionPane.ERROR_MESSAGE);
				JDialog dialog = optionPane.createDialog("Error");
				dialog.setAlwaysOnTop(true);
				dialog.setVisible(true);
			}
		});
		btn_Entrar.setForeground(new Color(81, 81, 81));
		btn_Entrar.setBackground(new Color(228, 217, 112));
		btn_Entrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Entrar.setBounds(221, 491, 178, 38);
		btn_Entrar.setOpaque(true);
		panel.add(btn_Entrar);
	}

	public void registro() {

		txt_correo = new JTextField();
		JCheckBox cbkbc_condiciones = new JCheckBox("Acepto vender mi alma al diablo");

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(203, 19, 201, 73);
		panel.add(lblNewLabel);

		JLabel lbl_Nombre = new JLabel("Ingresa tu nombre:");
		lbl_Nombre.setForeground(new Color(146, 146, 146));
		lbl_Nombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Nombre.setBounds(66, 103, 201, 50);
		panel.add(lbl_Nombre);

		JButton btn_Registrarse = new JButton("Registrarse");
		btn_Registrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btn_Registrarse.setForeground(new Color(81, 81, 81));
		btn_Registrarse.setBackground(new Color(228, 217, 112));
		btn_Registrarse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Registrarse.setBounds(211, 565, 178, 38);
		btn_Registrarse.setOpaque(true);
		panel.add(btn_Registrarse);

		JLabel lbl_Nombre_1 = new JLabel("Ingresa tu apellido:");
		lbl_Nombre_1.setForeground(new Color(146, 146, 146));
		lbl_Nombre_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_Nombre_1.setBounds(345, 103, 201, 50);
		panel.add(lbl_Nombre_1);

		txt_nombre = new JTextField();
		txt_nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_nombre.setBounds(66, 156, 217, 44);
		panel.add(txt_nombre);
		txt_nombre.setColumns(10);

		txt_apellido = new JTextField();
		txt_apellido.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_apellido.setColumns(10);
		txt_apellido.setBounds(329, 156, 217, 44);
		panel.add(txt_apellido);

		JLabel lbl_correo = new JLabel("Correo Electrónico");
		lbl_correo.setForeground(new Color(146, 146, 146));
		lbl_correo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_correo.setBounds(143, 210, 201, 50);
		panel.add(lbl_correo);

		txt_correo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_correo.setColumns(10);
		txt_correo.setBounds(143, 260, 320, 44);
		panel.add(txt_correo);

		JLabel lbl_contra = new JLabel("Contraseña");
		lbl_contra.setForeground(new Color(146, 146, 146));
		lbl_contra.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_contra.setBounds(143, 315, 201, 50);
		panel.add(lbl_contra);

		JLabel lbl_confirmarContra = new JLabel("Confirmar Contraseña");
		lbl_confirmarContra.setForeground(new Color(146, 146, 146));
		lbl_confirmarContra.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbl_confirmarContra.setBounds(143, 420, 248, 50);
		panel.add(lbl_confirmarContra);

		psw_contra = new JPasswordField();
		psw_contra.setFont(new Font("Tahoma", Font.PLAIN, 20));
		psw_contra.setBounds(143, 365, 320, 44);
		panel.add(psw_contra);

		psw_confirmar = new JPasswordField();
		psw_confirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		psw_confirmar.setBounds(143, 471, 320, 44);
		panel.add(psw_confirmar);

		cbkbc_condiciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbkbc_condiciones.setForeground(new Color(146, 146, 146));
		cbkbc_condiciones.setBounds(135, 530, 341, 23);
		cbkbc_condiciones.setOpaque(false);
		panel.add(cbkbc_condiciones);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		login();
//		registro();
	}
}
