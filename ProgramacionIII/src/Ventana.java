import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		this.iniciarComponentes();
	}

	private void iniciarComponentes() {

		this.admin();
		// this.login();
		// this.registro();
		this.repaint();
		// this.validate();
	}

	public void registro() {
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth() / 2, this.getHeight());
		registro.setLocation(500, 1);
		registro.setLayout(null);
		registro.setBackground(Color.cyan);

		JLabel registro_tag = new JLabel("Registro", 0);
		registro_tag.setSize(220, 70);
		registro_tag.setForeground(Color.white);
		registro_tag.setFont(new Font("Algerian", Font.BOLD, 40));
		registro_tag.setLocation(120, 20);
		registro_tag.setOpaque(true);
		registro_tag.setBackground(Color.DARK_GRAY);
		registro.add(registro_tag);

		JLabel id_tag = new JLabel("Usuario:", 0);
		id_tag.setBounds(125, 100, 200, 40);
		id_tag.setOpaque(true);
		id_tag.setBackground(Color.black);
		id_tag.setForeground(Color.white);
		id_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		registro.add(id_tag);

		JTextField id_txt_field = new JTextField();
		id_txt_field.setBounds(80, 150, 300, 28);
		registro.add(id_txt_field);

		JLabel bio_tag = new JLabel("Bio", 0);
		bio_tag.setBounds(125, 180, 200, 40);
		bio_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		registro.add(bio_tag);

		JTextArea bio_text = new JTextArea();
		bio_text.setBounds(80, 220, 300, 100);
		bio_text.setFont(new Font("Algerian", Font.PLAIN, 16));
		registro.add(bio_text);

		JLabel prefer_tag = new JLabel("Preferencias", 0);
		prefer_tag.setBounds(125, 320, 200, 40);
		prefer_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		registro.add(prefer_tag);

		JCheckBox item_box_1 = new JCheckBox("Dulce");
		item_box_1.setBounds(80, 365, 100, 25);
		item_box_1.setOpaque(false);
		registro.add(item_box_1);

		JCheckBox item_box_2 = new JCheckBox("Salado");
		item_box_2.setBounds(160, 365, 100, 25);
		item_box_2.setOpaque(true);
		item_box_2.setForeground(Color.white);
		item_box_2.setBackground(Color.GRAY);
		registro.add(item_box_2);

		JCheckBox item_box_3 = new JCheckBox("Saludable");
		item_box_3.setBounds(270, 365, 100, 25);
		item_box_3.setOpaque(false);
		item_box_3.setBorderPainted(true);
		item_box_3.setBorder(BorderFactory.createLineBorder(Color.red, 2));
		registro.add(item_box_3);

		JLabel terminos_tag = new JLabel("Términos", 0);
		terminos_tag.setBounds(125, 410, 200, 30);
		terminos_tag.setOpaque(true);
		terminos_tag.setBackground(Color.black);
		terminos_tag.setForeground(Color.white);
		terminos_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		registro.add(terminos_tag);

		JRadioButton acepto_rbtn = new JRadioButton("Acepto");
		acepto_rbtn.setBounds(80, 450, 100, 20);
		acepto_rbtn.setOpaque(false);
		acepto_rbtn.setFont(new Font("Algerian", Font.BOLD, 15));
		registro.add(acepto_rbtn);

		JRadioButton no_acepto_rbtn = new JRadioButton("No Acepto");
		no_acepto_rbtn.setBounds(260, 450, 150, 20);
		no_acepto_rbtn.setOpaque(false);
		no_acepto_rbtn.setFont(new Font("Algerian", Font.BOLD, 15));
		registro.add(no_acepto_rbtn);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(acepto_rbtn);
		grupo.add(no_acepto_rbtn);

		String colonias[] = { "Centro", "Camino Real", "Pedregal", "Conchalito", "8 de Octubre" };

		JComboBox locations = new JComboBox(colonias);
		locations.setBounds(80, 490, 300, 28);
		registro.add(locations);

		JButton crear_btn = new JButton("Crear");
		crear_btn.setBounds(165, 540, 140, 40);
		crear_btn.setFont(new Font("Algerian", Font.BOLD, 20));
		registro.add(crear_btn);

		this.add(registro);
	}

	public void login() {
		JPanel login = new JPanel();
		login.setSize((this.getWidth() / 2), (this.getHeight()));
		login.setBackground(Color.gray);
		login.setLayout(null);

		JLabel login_tag = new JLabel("ACCEDER", 0);
		login_tag.setSize(220, 70);
		login_tag.setForeground(Color.white);
		login_tag.setFont(new Font("Algerian", Font.BOLD, 40));
		login_tag.setLocation(120, 20);
		login_tag.setOpaque(true);
		login_tag.setBackground(Color.red);
		login.add(login_tag);

		JLabel id_tag = new JLabel("Usuario:");
		id_tag.setBounds(80, 120, 120, 40);
		id_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		login.add(id_tag);

		JTextField id_txt_field = new JTextField();
		id_txt_field.setBounds(80, 170, 300, 25);
		login.add(id_txt_field);

		JLabel pw_tag = new JLabel("Contraseña:");
		pw_tag.setBounds(80, 210, 200, 40);
		pw_tag.setFont(new Font("Bradley Hand ITC", Font.BOLD, 25));
		login.add(pw_tag);

		JPasswordField psw_field = new JPasswordField();
		psw_field.setBounds(80, 260, 300, 25);
		login.add(psw_field);

		JCheckBox recordar_chkbox = new JCheckBox("Recordarme");
		recordar_chkbox.setBounds(80, 295, 100, 25);
		recordar_chkbox.setOpaque(false);
		login.add(recordar_chkbox);

		JLabel olvidaste_tag = new JLabel("<html> <u>¿Olvidaste tu contraseña?</u></html>");
		olvidaste_tag.setBounds(225, 290, 185, 40);
		login.add(olvidaste_tag);

		JButton login_btn = new JButton("Ingresar");
		login_btn.setBounds(165, 370, 130, 40);
		login_btn.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
		login.add(login_btn);

		this.add(login);

	}

	public void admin() {

		// Añadir panel
		JPanel admin = new JPanel();
		admin.setSize(this.getWidth(), this.getHeight());
		admin.setLocation(0, 0);
		admin.setLayout(null);
		admin.setBackground(Color.decode("#6786E7"));
		// Añadir Menú y Opciones
		JMenuBar barra = new JMenuBar();
		JMenu menu_file = new JMenu("Archivo");
		barra.add(menu_file);
		JMenuItem open_item = new JMenuItem("Abrir Archivo ...");
		menu_file.add(open_item);
		JMenuItem create_item = new JMenuItem("Crear Archivo ...");
		menu_file.add(create_item);
		this.setJMenuBar(barra);

		// Contenido Panel

		JLabel users_tag = new JLabel("Usuarios", 0);
		users_tag.setBounds(350, 20, 300, 80);
		users_tag.setOpaque(true);
		users_tag.setFont(new Font("Marker Felt", Font.BOLD, 40));
		admin.add(users_tag);

		JLabel title_widget = new JLabel("Total de Usuarios", 0);
		title_widget.setBounds(42, 130, 300, 40);
		title_widget.setFont(new Font("Marker Felt", Font.BOLD, 20));
		title_widget.setForeground(Color.white);
		admin.add(title_widget);

		JLabel content_widget = new JLabel("100", 0);
		content_widget.setBounds(42, 170, 300, 40);
		content_widget.setFont(new Font("Marker Felt", Font.BOLD, 30));
		content_widget.setForeground(Color.white);
		admin.add(content_widget);

		JLabel widget = new JLabel("");
		widget.setBounds(40, 120, 315, 100);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		admin.add(widget);

		JButton exportar = new JButton("Exportar");
		exportar.setBounds(740, 230, 100, 40);
		exportar.setFont(new Font("Marker Felt", Font.PLAIN, 17));
		admin.add(exportar);

		JButton add_user = new JButton("Agregar");
		add_user.setBounds(860, 230, 100, 40);
		add_user.setFont(exportar.getFont());
		admin.add(add_user);

		String titles[] = { "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" };
		String data[][] = { { "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" },
				{ "No. Control", "Nombre", "Apellidos", "Semestre", "Promedio", "Acciones" }, };

		JTable tabla = new JTable(data, titles);
		JScrollPane scroll_tabla = new JScrollPane(tabla);
		scroll_tabla.setBounds(40, 290, 920, 400);
		admin.add(scroll_tabla);

		this.add(admin);
	}
}