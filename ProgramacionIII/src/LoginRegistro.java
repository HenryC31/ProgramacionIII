import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginRegistro {

	private JFrame frame;
	private JTextField textField;
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

	/*
	 * Método para el panel de Login
	 */
	public void login() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setBounds(70, 157, 490, 394);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Iniciar Sesión");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(153, 40, 332, 73);
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

		JPasswordField passwordField = new JPasswordField();
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

		JButton btn_olvide_contra = new JButton("¿Olvidaste tu contraseña?");
		btn_olvide_contra.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_olvide_contra.setBounds(305, 415, 213, 20);
		btn_olvide_contra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				recuperar();
			}
		});

		panel.add(btn_olvide_contra);

		JLabel lbl_noCuenta = new JLabel("¿No tienes cuenta?");
		lbl_noCuenta.setForeground(Color.WHITE);
		lbl_noCuenta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_noCuenta.setBounds(188, 570, 156, 23);
		panel.add(lbl_noCuenta);

		JButton btnNewButton = new JButton("Registrate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				registro();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(354, 566, 131, 31);
		panel.add(btnNewButton);

		frame.repaint();
		frame.revalidate();
	}

	public void alta() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Alta");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(260, 22, 201, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();
	}

	public void baja() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Baja");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(260, 22, 201, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();
	}

	public void consultar() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Consulta");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		lblNewLabel.setBounds(190, 19, 250, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();
	}

	public void usuario_inst() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("¿Cómo crear un usuario?");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(120, 19, 420, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();
	}

	public void sistema_inst() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("¿Cómo acceder al sistema?");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(90, 19, 450, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();
	}

	public void contra_inst() {

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		lblNewLabel.setForeground(new Color(228, 217, 112));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(35, 19, 600, 73);
		panel.add(lblNewLabel);

		frame.repaint();
		frame.revalidate();

	}

	/*
	 * Método para el panel de Recuperar cuenta
	 */
	public void recuperar() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setBounds(70, 157, 490, 209);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panel.add(lblNewLabel_1);

		JLabel titulo = new JLabel("Recuperar cuenta");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(new Color(228, 217, 112));
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 40));
		titulo.setBounds(120, 56, 392, 73);
		panel.add(titulo);

		JLabel lbl_Usuario_1 = new JLabel("Correo Electrónico");
		lbl_Usuario_1.setForeground(new Color(108, 108, 108));
		lbl_Usuario_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lbl_Usuario_1.setBounds(110, 170, 255, 50);
		panel.add(lbl_Usuario_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(110, 219, 409, 38);
		panel.add(textField);
		textField.setColumns(10);

		JButton btn_Entrar = new JButton("Recuperar");
		btn_Entrar.setForeground(new Color(81, 81, 81));
		btn_Entrar.setBackground(new Color(228, 217, 112));
		btn_Entrar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Entrar.setBounds(180, 291, 266, 50);
		btn_Entrar.setOpaque(true);
		panel.add(btn_Entrar);

		JButton btnNewButton = new JButton("Ya recordé mi contraseña");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				login();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(180, 403, 274, 38);
		panel.add(btnNewButton);

		frame.repaint();
		frame.revalidate();
	}

	/*
	 * Método para el panel de Registro
	 */
	public void registro() {
		frame.repaint();
		frame.revalidate();

		txt_correo = new JTextField();
		JCheckBox cbkbc_condiciones = new JCheckBox("Acepto vender mi alma al diablo");

		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 0, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setOpaque(false);
		lblNewLabel_1.setBounds(47, 103, 515, 510);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		panel.add(lblNewLabel_1);

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

		JButton btnNewButton_1 = new JButton("¿Ya tienes cuenta?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.remove(panel);
				login();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(203, 634, 201, 23);
		panel.add(btnNewButton_1);

		frame.repaint();
		frame.revalidate();
	}

	/**
	 * Inicializa los componentes del Frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar barra = new JMenuBar();
		JMenu cuenta = new JMenu("Cuenta");

		JMenuItem login = new JMenuItem("Login");
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				login();
			}
		});
		cuenta.add(login);

		JMenuItem registro = new JMenuItem("Registro");
		registro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				registro();
			}
		});
		cuenta.add(registro);

		JMenuItem recuperar = new JMenuItem("Recuperar cuenta");
		recuperar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				recuperar();
			}
		});
		cuenta.add(recuperar);

		barra.add(cuenta);

		JMenu usuario = new JMenu("Usuario");
		JMenuItem alta = new JMenuItem("Alta");
		alta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				alta();
			}
		});
		usuario.add(alta);

		JMenuItem baja = new JMenuItem("Baja");
		baja.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				baja();
			}
		});
		usuario.add(baja);

		JMenuItem consultar = new JMenuItem("Consultar");
		consultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				consultar();
			}
		});
		usuario.add(consultar);
		barra.add(usuario);

		JMenu ayuda = new JMenu("Ayuda");
		JMenuItem como_crear = new JMenuItem("¿Cómo crear un usuario?");
		como_crear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				usuario_inst();
			}
		});
		ayuda.add(como_crear);

		JMenuItem como_acceder = new JMenuItem("¿Cómo acceder al sistema?");
		como_acceder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				sistema_inst();

			}
		});
		ayuda.add(como_acceder);

		JMenuItem olvidar_contra = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		olvidar_contra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				contra_inst();
			}
		});
		ayuda.add(olvidar_contra);
		barra.add(ayuda);

		frame.setJMenuBar(barra);

//		recuperar();
		login();
//		registro();
	}
}
