import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
		this.setSize(1150, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		this.iniciarComponentes();
//		this.addMouseListener(this);
	}

	private void iniciarComponentes() {

//		this.calculadora();
//		this.admin();
//		this.login();
//		this.registro();
//		this.user_login();
//		this.calculadora_clase();
//		this.interes();
		this.botones();
		this.repaint();
		this.validate();
	}

	public void botones() {
		this.setSize(500, 750);
		this.setLocationRelativeTo(null);
		this.setTitle("Botones");

		JPanel panel_btn = new JPanel();
		panel_btn.setSize(this.getWidth(), this.getHeight());
		panel_btn.setLocation(0, 0);
		panel_btn.setLayout(null);
		panel_btn.setBackground(Color.decode("#6786E7"));

		panel_btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				int w = (int) Math.floor(Math.random() * 120 + 1);
				int h = (int) Math.floor(Math.random() * 120 + 1);

				int r = (int) Math.floor(Math.random() * 255 + 1);
				int g = (int) Math.floor(Math.random() * 255 + 1);
				int b = (int) Math.floor(Math.random() * 255 + 1);

				JButton otro_boton = new JButton(r + ", " + g + ", " + b);
				otro_boton.setOpaque(true);
				otro_boton.setBackground(new Color(r, g, b));
				otro_boton.setBounds(e.getX(), e.getY(), w, h);
				otro_boton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, otro_boton.getText());
					}
				});

				panel_btn.add(otro_boton);

				getContentPane().repaint();
				getContentPane().revalidate();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				int r = (int) Math.floor(Math.random() * 255 + 1);
				int g = (int) Math.floor(Math.random() * 255 + 1);
				int b = (int) Math.floor(Math.random() * 255 + 1);

				panel_btn.setBackground(new Color(r, g, b));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		JButton boton = new JButton("Pushame");
		boton.setBounds(50, 300, 400, 100);
		boton.setFont(new Font("", Font.BOLD, 30));

		boton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int x = (int) Math.floor(Math.random() * 450 + 1);
				int y = (int) Math.floor(Math.random() * 620 + 1);

				int w = (int) Math.floor(Math.random() * 120 + 1);
				int h = (int) Math.floor(Math.random() * 120 + 1);

				int r = (int) Math.floor(Math.random() * 255 + 1);
				int g = (int) Math.floor(Math.random() * 255 + 1);
				int b = (int) Math.floor(Math.random() * 255 + 1);

				JButton otro_boton = new JButton(r + ", " + g + ", " + b);
				otro_boton.setOpaque(true);
				otro_boton.setBackground(new Color(r, g, b));
				otro_boton.setBounds(x, y, w, h);
				otro_boton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						panel_btn.remove(otro_boton);
						getContentPane().repaint();
					}
				});

				panel_btn.add(otro_boton);

				getContentPane().repaint();
				getContentPane().revalidate();
			}
		});

		panel_btn.add(boton);
		this.add(panel_btn);
	}

	public void bordes(JPanel panel) {
		JLabel izquierda = new JLabel("    ");
		izquierda.setSize(300, 1);
		panel.add(izquierda, BorderLayout.WEST);

		JLabel derecha = new JLabel("    ");
		derecha.setSize(300, 1);
		panel.add(derecha, BorderLayout.EAST);

		JLabel abajo = new JLabel("    ");
		abajo.setSize(300, 1);
		panel.add(abajo, BorderLayout.SOUTH);

	}

	public void interes() {
		this.setSize((this.getWidth() / 2), this.getHeight());
		this.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, this.getWidth() - 15, this.getHeight() - 38);
		panel.setLayout(new BorderLayout());

		JLabel interes_tag = new JLabel("   Interes");
		interes_tag.setForeground(Color.red);
		interes_tag.setFont(new Font("", Font.BOLD, 24));
		panel.add(interes_tag, BorderLayout.NORTH);

		JLabel izquierda = new JLabel("    ");
		izquierda.setSize(300, 1);
		panel.add(izquierda, BorderLayout.WEST);

		JLabel derecha = new JLabel("    ");
		derecha.setSize(300, 1);
		panel.add(derecha, BorderLayout.EAST);

		JLabel abajo = new JLabel("    ");
		abajo.setSize(300, 1);
		panel.add(abajo, BorderLayout.SOUTH);

		JPanel panel_centro = new JPanel();
		panel_centro.setBackground(Color.decode("#74FFAD"));
		panel_centro.setLayout(new GridLayout(2, 1, 0, 20));
		panel.add(panel_centro, BorderLayout.CENTER);

		JPanel panel_calcular = new JPanel();
		panel_calcular.setLayout(new BorderLayout());
//		panel_calcular.setSize(panel_centro.getWidth(), 40);
		panel_calcular.setBackground(Color.decode("#74FFAD"));

		JLabel calcular_tag = new JLabel("Calcular");
		calcular_tag.setFont(new Font("", Font.BOLD, 12));
		panel_calcular.add(calcular_tag, BorderLayout.NORTH);
		panel_centro.add(panel_calcular);

		JPanel centro_calcular = new JPanel();
		centro_calcular.setLayout(new GridLayout(3, 2));
		centro_calcular.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		panel_calcular.add(centro_calcular, BorderLayout.CENTER);

		JLabel espacio = new JLabel(" ");
//		espacio.setSize(panel_centro.getWidth(), 40);
		panel_centro.add(espacio);

		JPanel panel_op = new JPanel();
		panel_op.setBackground(Color.cyan);
//		panel_op.setLayout(null);
//		panel_op.setSize(panel_centro.getWidth(), 80);
		panel_centro.add(panel_op);

		this.add(panel);
	}

	public void calculadora_clase() {
		this.setSize(480, 650);
		this.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#FFA474"));
		panel.setLayout(new BorderLayout());

		JLabel text = new JLabel("100.00", 4);
		text.setOpaque(true);
		text.setBackground(Color.white);
		text.setFont(new Font("", Font.BOLD, 30));
		panel.add(text, BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setOpaque(true);
		centro.setBackground(Color.decode("#74C6FF"));
		centro.setLayout(new GridLayout(4, 3, 10, 10));
		panel.add(centro, BorderLayout.CENTER);

		String btns[] = { "7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/" };
		for (int i = 0; i < 12; i++) {
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
		}

		JPanel east = new JPanel();
		east.setOpaque(true);
		east.setBackground(Color.decode("#74FFAD"));
		east.setLayout(new GridLayout(3, 1));
		panel.add(east, BorderLayout.EAST);

		String btns2[] = { "+", "-", "=" };
		for (int i = 0; i < 3; i++) {
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
		}

		JPanel west = new JPanel();
		west.setOpaque(true);
		west.setBackground(Color.black);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);

		String btns3[] = { "MC", "M+", "*" };
		for (int i = 0; i < 3; i++) {
			JButton boton = new JButton(btns3[i]);
			west.add(boton);
		}

		this.add(panel);

	}

	public void calculadora() {

		this.setTitle("Calculadora");
		this.setVisible(true);
		this.setSize(400, 470);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, this.getWidth(), this.getHeight());
		panel.setOpaque(true);
		panel.setLayout(null);
		panel.setBackground(Color.black);

		JLabel operaciones = new JLabel("4,580,000", 0);
		operaciones.setBounds(10, 10, (panel.getWidth() - 32), 60);
		operaciones.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		operaciones.setForeground(Color.white);
		operaciones.setFont(new Font("", Font.BOLD, 20));
		panel.add(operaciones);

		JButton boton_ce = new JButton("CE");
		boton_ce.setBounds(10, 85, 84, 60);
		boton_ce.setOpaque(true);
		boton_ce.setBackground(Color.gray);
		boton_ce.setFont(new Font("", Font.BOLD, 16));
		boton_ce.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_ce);

		JLabel espacio_vacio = new JLabel();
		espacio_vacio.setBounds(104, 85, 275, 60);
		espacio_vacio.setOpaque(true);
		espacio_vacio.setBackground(Color.gray);
		espacio_vacio.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(espacio_vacio);

		JButton boton_7 = new JButton("7");
		boton_7.setBounds(10, 155, 84, 60);
		boton_7.setOpaque(true);
		boton_7.setForeground(Color.white);
		boton_7.setFont(new Font("", Font.BOLD, 16));
		boton_7.setBackground(Color.darkGray);
		boton_7.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_7);

		JButton boton_8 = new JButton("8");
		boton_8.setBounds(104, 155, 84, 60);
		boton_8.setOpaque(true);
		boton_8.setForeground(Color.white);
		boton_8.setFont(new Font("", Font.BOLD, 16));
		boton_8.setBackground(Color.darkGray);
		boton_8.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_8);

		JButton boton_9 = new JButton("9");
		boton_9.setBounds(199, 155, 84, 60);
		boton_9.setOpaque(true);
		boton_9.setForeground(Color.white);
		boton_9.setFont(new Font("", Font.BOLD, 16));
		boton_9.setBackground(Color.darkGray);
		boton_9.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_9);

		JButton boton_division = new JButton("/");
		boton_division.setBounds(294, 155, 84, 60);
		boton_division.setOpaque(true);
		boton_division.setForeground(Color.white);
		boton_division.setBackground(Color.decode("#D2802B"));
		boton_division.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_division);

		JButton boton_4 = new JButton("4");
		boton_4.setBounds(10, 225, 84, 60);
		boton_4.setOpaque(true);
		boton_4.setForeground(Color.white);
		boton_4.setFont(new Font("", Font.BOLD, 16));
		boton_4.setBackground(Color.darkGray);
		boton_4.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_4);

		JButton boton_5 = new JButton("5");
		boton_5.setBounds(104, 225, 84, 60);
		boton_5.setOpaque(true);
		boton_5.setForeground(Color.white);
		boton_5.setFont(new Font("", Font.BOLD, 16));
		boton_5.setBackground(Color.darkGray);
		boton_5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_5);

		JButton boton_6 = new JButton("6");
		boton_6.setBounds(199, 225, 84, 60);
		boton_6.setOpaque(true);
		boton_6.setForeground(Color.white);
		boton_6.setFont(new Font("", Font.BOLD, 16));
		boton_6.setBackground(Color.darkGray);
		boton_6.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_6);

		JButton boton_mult = new JButton("*");
		boton_mult.setBounds(294, 225, 84, 60);
		boton_mult.setOpaque(true);
		boton_mult.setForeground(Color.white);
		boton_mult.setBackground(Color.decode("#D2802B"));
		boton_mult.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_mult);

		JButton boton_1 = new JButton("1");
		boton_1.setBounds(10, 295, 84, 60);
		boton_1.setOpaque(true);
		boton_1.setForeground(Color.white);
		boton_1.setFont(new Font("", Font.BOLD, 16));
		boton_1.setBackground(Color.darkGray);
		boton_1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_1);

		JButton boton_2 = new JButton("2");
		boton_2.setBounds(104, 295, 84, 60);
		boton_2.setOpaque(true);
		boton_2.setForeground(Color.white);
		boton_2.setFont(new Font("", Font.BOLD, 16));
		boton_2.setBackground(Color.darkGray);
		boton_2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_2);

		JButton boton_3 = new JButton("3");
		boton_3.setBounds(199, 295, 84, 60);
		boton_3.setOpaque(true);
		boton_3.setForeground(Color.white);
		boton_3.setFont(new Font("", Font.BOLD, 16));
		boton_3.setBackground(Color.darkGray);
		boton_3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_3);

		JButton boton_resta = new JButton("-");
		boton_resta.setBounds(294, 295, 84, 60);
		boton_resta.setOpaque(true);
		boton_resta.setForeground(Color.white);
		boton_resta.setBackground(Color.decode("#D2802B"));
		boton_resta.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_resta);

		JButton boton_0 = new JButton("0");
		boton_0.setBounds(10, 365, 84, 60);
		boton_0.setOpaque(true);
		boton_0.setForeground(Color.white);
		boton_0.setFont(new Font("", Font.BOLD, 16));
		boton_0.setBackground(Color.darkGray);
		boton_0.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_0);

		JButton boton_punto = new JButton(".");
		boton_punto.setBounds(104, 365, 84, 60);
		boton_punto.setOpaque(true);
		boton_punto.setForeground(Color.white);
		boton_punto.setFont(new Font("", Font.BOLD, 16));
		boton_punto.setBackground(Color.darkGray);
		boton_punto.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_punto);

		JButton boton_igual = new JButton("=");
		boton_igual.setBounds(199, 365, 84, 60);
		boton_igual.setOpaque(true);
		boton_igual.setForeground(Color.white);
		boton_igual.setBackground(Color.decode("#D2802B"));
		boton_igual.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_igual);

		JButton boton_suma = new JButton("+");
		boton_suma.setBounds(294, 365, 84, 60);
		boton_suma.setOpaque(true);
		boton_suma.setForeground(Color.white);
		boton_suma.setBackground(Color.decode("#D2802B"));
		boton_suma.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
		panel.add(boton_suma);

		this.add(panel);
	}

	public void registro() {
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth() / 2, this.getHeight());
		registro.setLocation(this.getWidth() / 2, 1);
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
		acepto_rbtn.setBorderPainted(true);
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
		crear_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usr = id_txt_field.getText();
				String bio = bio_text.getText();
//				acepto_rbtn
				if (usr.length() <= 0) {
					id_txt_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else
					id_txt_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				if (bio.length() <= 0) {
					bio_text.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else
					bio_text.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				if (!acepto_rbtn.isSelected()) {
					acepto_rbtn.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else
					acepto_rbtn.setBorder(BorderFactory.createLineBorder(Color.green, 2));
			}

		});
		registro.add(crear_btn);

		this.add(registro);
	}

	public void user_login() {
		this.setTitle("User Login");

		JPanel login_panel = new JPanel();
		login_panel.setSize(this.getWidth(), this.getHeight());
		login_panel.setBackground(Color.decode("#294296"));
		login_panel.setLayout(null);

		JLabel login_tag = new JLabel("User Login", 0);
		login_tag.setBounds(250, 10, 500, 100);
		// login_tag.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		login_tag.setForeground(Color.white);
		login_tag.setFont(new Font("Britannic", Font.ITALIC, 40));
		login_panel.add(login_tag);

		JLabel acc_widget = new JLabel();
		acc_widget.setBounds(190, 130, 630, 400);
		acc_widget.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		acc_widget.setOpaque(true);
		acc_widget.setBackground(Color.decode("#203274"));

		JLabel acc_tag = new JLabel("My Account", 0);
		acc_tag.setBounds(250, 130, 500, 100);
		acc_tag.setForeground(Color.decode("#ECEA6A"));
		acc_tag.setFont(new Font("Britannic", Font.ITALIC, 52));
		login_panel.add(acc_tag);

		JLabel user_tag = new JLabel("ENTER YOUR USERNAME");
		user_tag.setBounds(300, 240, 250, 50);
		user_tag.setForeground(Color.WHITE);
		user_tag.setFont(new Font("Britannic", Font.ITALIC, 18));
		login_panel.add(user_tag);

		JTextField user_text = new JTextField();
		user_text.setBounds(300, 285, 386, 40);
		user_text.setFont(new Font("Britannic", Font.ITALIC, 16));
		login_panel.add(user_text);

		JLabel password_tag = new JLabel("ENTER YOUR PASSWORD");
		password_tag.setBounds(300, 360, 250, 50);
		password_tag.setForeground(Color.WHITE);
		password_tag.setFont(new Font("Britannic", Font.ITALIC, 18));
		login_panel.add(password_tag);

		JPasswordField password_text = new JPasswordField();
		password_text.setBounds(300, 405, 386, 40);
		password_text.setFont(new Font("Britannic", Font.ITALIC, 16));
		login_panel.add(password_text);

		/*
		 * JLabel pass_tag = new JLabel("Password"); pass_tag.setBounds(300, 405, 386,
		 * 40); pass_tag.setForeground(Color.LIGHT_GRAY); pass_tag.setOpaque(false);
		 * pass_tag.setFont(new Font("Britannic", Font.ITALIC, 16));
		 * login_panel.add(pass_tag);
		 */

		ImageIcon imagen_usuario = new ImageIcon(getClass().getResource("user.png"));
		JLabel user_img = new JLabel(" ");
		user_img.setBounds(260, 292, 30, 30);
		user_img.setIcon(new ImageIcon(imagen_usuario.getImage().getScaledInstance(user_img.getWidth(),
				user_img.getHeight(), Image.SCALE_SMOOTH)));
		login_panel.add(user_img);

		ImageIcon imagen_password = new ImageIcon(getClass().getResource("lock.png"));
		JLabel password_img = new JLabel(" ");
		password_img.setBounds(260, 412, 30, 30);
		password_img.setIcon(new ImageIcon(imagen_password.getImage().getScaledInstance(password_img.getWidth(),
				password_img.getHeight(), Image.SCALE_SMOOTH)));
		login_panel.add(password_img);

		JButton login_btn = new JButton("Login");
		login_btn.setBounds(384, 467, 230, 40);
		login_btn.setOpaque(true);
		login_btn.setBackground(Color.decode("#ECEA6A"));
		login_btn.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		login_btn.setFont(new Font("Britannic", Font.ITALIC, 22));
		login_panel.add(login_btn);

		JLabel createacc_tag = new JLabel("Don´t have an account?", 0);
		createacc_tag.setBounds(374, 540, 250, 40);
		createacc_tag.setForeground(Color.decode("#ECEA6A"));
		createacc_tag.setFont(new Font("Britannic", Font.ITALIC, 18));
		login_panel.add(createacc_tag);

		JButton createacc_btn = new JButton("Sign Up");
		createacc_btn.setBounds(435, 580, 130, 35);
		createacc_btn.setOpaque(true);
		createacc_btn.setBackground(Color.decode("#ECEA6A"));
		createacc_btn.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		createacc_btn.setFont(new Font("Britannic", Font.ITALIC, 18));
		login_panel.add(createacc_btn);

		login_panel.add(acc_widget);
		this.add(login_panel);
	}

	public void login() {
//
//		this.setSize(500, 750);
//		this.setLocationRelativeTo(null);

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

		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("snowman.png")));
		logo.setBounds(10, 10, 512, 512);
//		login.add(logo);

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
		login_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola");
				String usr = id_txt_field.getText();
				String psw = new String(psw_field.getPassword());

				if (usr.length() <= 0) {
					id_txt_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else
					id_txt_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				if (psw.length() <= 0) {
					psw_field.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else
					psw_field.setBorder(BorderFactory.createLineBorder(Color.green, 2));

				if (usr.equals("SuperUser")) {
					if (psw.equals("SuperPass")) {
						System.out.println("Bienvenido");
					}
				} else
					System.out.println("Usuario no encontrado");
			}
		});
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