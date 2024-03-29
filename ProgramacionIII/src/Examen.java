import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
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
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JLabel lblNewLabel_3 = new JLabel(" ");
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("  Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("    [Sin base de datos]");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_4 = new JLabel(" ");
		panel.add(lblNewLabel_4);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel(" ");
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);

		Label label = new Label("Documento:");
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(48, 43, 115, 30);
		panel_2.add(label);

		Label label_1 = new Label("Dirección:");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1.setBounds(48, 96, 105, 30);
		panel_2.add(label_1);

		Label label_1_1 = new Label("Nombres:");
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1_1.setBounds(350, 43, 89, 30);
		panel_2.add(label_1_1);

		Label label_1_1_1 = new Label("Teléfono:");
		label_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1_1_1.setBounds(350, 96, 89, 30);
		panel_2.add(label_1_1_1);

		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setBounds(165, 45, 150, 30);
		panel_2.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(165, 98, 150, 30);
		panel_2.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(460, 45, 219, 30);
		panel_2.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(460, 98, 219, 30);
		panel_2.add(textField_3);

		Label label_2 = new Label("N° Factura:");
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(48, 191, 115, 30);
		panel_2.add(label_2);

		Label label_2_1 = new Label("Fecha:");
		label_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_1.setBounds(384, 191, 70, 30);
		panel_2.add(label_2_1);

		Label label_2_2 = new Label("1");
		label_2_2.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2_2.setBounds(165, 191, 115, 30);
		panel_2.add(label_2_2);

		Label label_2_2_1 = new Label("2021/50/21");
		label_2_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_2_2_1.setBounds(460, 191, 115, 30);
		panel_2.add(label_2_2_1);

		ImageIcon img = new ImageIcon(getClass().getResource("lista-de-texto.png"));
		JLabel lblNewLabel_5 = new JLabel();
		lblNewLabel_5.setBounds(48, 255, 30, 30);
		lblNewLabel_5.setIcon(new ImageIcon(img.getImage().getScaledInstance(lblNewLabel_5.getWidth(),
				lblNewLabel_5.getHeight(), Image.SCALE_AREA_AVERAGING)));
		panel_2.add(lblNewLabel_5);

		Label label_2_3 = new Label("Ver listado de facturas");
		label_2_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3.setBounds(81, 255, 213, 30);
		panel_2.add(label_2_3);

		img = new ImageIcon(getClass().getResource("anadir.png"));
		JLabel lblNewLabel_5_1 = new JLabel();
		lblNewLabel_5_1.setBounds(419, 255, 30, 30);
		lblNewLabel_5_1.setIcon(new ImageIcon(img.getImage().getScaledInstance(lblNewLabel_5_1.getWidth(),
				lblNewLabel_5_1.getHeight(), Image.SCALE_AREA_AVERAGING)));
		panel_2.add(lblNewLabel_5_1);

		Label label_2_3_1 = new Label("Añadir");
		label_2_3_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3_1.setBounds(457, 255, 61, 30);
		panel_2.add(label_2_3_1);

		img = new ImageIcon(getClass().getResource("boton-x.png"));
		JLabel lblNewLabel_5_1_1 = new JLabel(img);
		lblNewLabel_5_1_1.setBounds(572, 255, 30, 30);
		lblNewLabel_5_1_1.setIcon(new ImageIcon(img.getImage().getScaledInstance(lblNewLabel_5_1_1.getWidth(),
				lblNewLabel_5_1_1.getHeight(), Image.SCALE_AREA_AVERAGING)));
		panel_2.add(lblNewLabel_5_1_1);

		Label label_2_3_1_1 = new Label("Eliminar");
		label_2_3_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3_1_1.setBounds(608, 255, 75, 30);
		panel_2.add(label_2_3_1_1);

		String titles[] = { "Producto", "Cantidad", "Valor", "SubTotal" };
		String data[][] = { { "Agua", "2", "500", "1000.0" }, { "Cereal", "5", "1000", "5000.0" },
				{ "Leche", "2", "300", "600.0" } };

		JTable tabla = new JTable(data, titles);
		tabla.setFont(new Font("Dialog", Font.PLAIN, 14));
		JScrollPane scroll_tabla = new JScrollPane(tabla);
		scroll_tabla.setFont(new Font("Dialog", Font.PLAIN, 14));
		scroll_tabla.setBounds(40, 298, 639, 98);
		panel_2.add(scroll_tabla);

		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(373, 532, 199, 35);
		panel_2.add(btnNewButton);

		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpiar.setBounds(582, 532, 97, 35);
		panel_2.add(btnLimpiar);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(29, 407, 199, 149);
		panel_2.add(panel_3);

		JLabel lblNewLabel_6 = new JLabel("SubTotal:");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 16));

		JLabel lblNewLabel_7 = new JLabel("% Descuento:");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 16));

		JLabel lblNewLabel_8 = new JLabel("IVA 19%:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 16));

		JLabel lblNewLabel_9 = new JLabel("Total Factura:");
		lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 16));

		JLabel lblNewLabel_10 = new JLabel("6,600.0");
		lblNewLabel_10.setFont(new Font("Dialog", Font.BOLD, 16));

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.BOLD, 16));
		textField_4.setText("5");
		textField_4.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("1,254.0");
		lblNewLabel_11.setFont(new Font("Dialog", Font.BOLD, 16));

		JLabel lblNewLabel_12 = new JLabel("7,524.0");
		lblNewLabel_12.setFont(new Font("Dialog", Font.BOLD, 16));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_9).addComponent(lblNewLabel_8).addComponent(lblNewLabel_6))
						.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4, 0, 0, Short.MAX_VALUE)
								.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
								.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addContainerGap(15, Short.MAX_VALUE)));
		gl_panel_3.setVerticalGroup(gl_panel_3.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_3
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_10))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_7).addComponent(
						textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_11))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_9)
						.addComponent(lblNewLabel_12))
				.addContainerGap(20, Short.MAX_VALUE)));
		panel_3.setLayout(gl_panel_3);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setFont(new Font("Dialog", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(250, 449, 21, 23);
		panel_2.add(chckbxNewCheckBox);

		JLabel lblNewLabel_6_1 = new JLabel("Valor Descontado:");
		lblNewLabel_6_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(275, 449, 135, 19);
		panel_2.add(lblNewLabel_6_1);

		JLabel lblNewLabel_10_1 = new JLabel("330.0");
		lblNewLabel_10_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNewLabel_10_1.setBounds(415, 449, 49, 19);
		panel_2.add(lblNewLabel_10_1);

		JLabel lblNewLabel_16 = new JLabel("Datos de cliente");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBackground(new Color(240, 240, 240));
		lblNewLabel_16.setBounds(35, 24, 115, 14);
		panel_2.add(lblNewLabel_16);

		JLabel lblNewLabel_16_1 = new JLabel("Datos de Factura");
		lblNewLabel_16_1.setOpaque(true);
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_16_1.setBounds(35, 165, 115, 14);
		panel_2.add(lblNewLabel_16_1);

		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(25, 35, 663, 110);
		lblNewLabel_13.setOpaque(false);
		lblNewLabel_13.setBorder(BorderFactory.createDashedBorder(Color.black, 1, 1, 3, true));
		panel_2.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(25, 172, 663, 62);
		lblNewLabel_14.setOpaque(false);
		lblNewLabel_14.setBorder(BorderFactory.createDashedBorder(Color.black, 1, 1, 3, true));
		panel_2.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(25, 245, 663, 48);
		lblNewLabel_15.setOpaque(false);
		lblNewLabel_15.setBorder(BorderFactory.createDashedBorder(Color.black, 1, 1, 3, true));
		panel_2.add(lblNewLabel_15);

	}
}
