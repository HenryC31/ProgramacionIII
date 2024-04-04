import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Puzzle {

	private JFrame frame;
	private static JButton btnNewButton = new JButton("");
	private static JButton btnNewButton_1 = new JButton("");
	private static JButton btnNewButton_2 = new JButton("");
	private static JButton btnNewButton_3 = new JButton("");
	private static JButton btnNewButton_4 = new JButton("");
	private static JButton btnNewButton_5 = new JButton("");
	private static JButton btnNewButton_6 = new JButton("");
	private static JButton btnNewButton_7 = new JButton("");
	private static JButton btnNewButton_8 = new JButton("");
	private static JButton btnNewButton_9 = new JButton("");
	private static JButton btnNewButton_10 = new JButton("");
	private static JButton btnNewButton_11 = new JButton("");
	private static JButton btnNewButton_12 = new JButton("");
	private static JButton btnNewButton_13 = new JButton("");
	private static JButton btnNewButton_14 = new JButton("");
	private static JButton btnNewButton_15 = new JButton("");
	private JButton btn_iniciar = new JButton("INICIAR");
	private JLabel lbl_tiempo = new JLabel("00:00:00:00");
	private int indice;
	private int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
	private int correcto[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
	private Timer t;
	private int h, m, s, cs;

	public static ArrayList<JButton> botones = new ArrayList<JButton>(
			Arrays.asList(btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5,
					btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9, btnNewButton_10, btnNewButton_11,
					btnNewButton_12, btnNewButton_13, btnNewButton_14, btnNewButton_15));
	private final JButton btn_pausa = new JButton("Pausar");
	private final JLabel lblNewLabel_1 = new JLabel("PUZZLE");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Puzzle window = new Puzzle();
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
	public Puzzle() {
		// 10 porque cada 10 milisegundos va a realizar lo que está en acciones
		initialize();
		t = new Timer(0, acciones);
	}

	private ActionListener acciones = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			++cs;
			if (cs == 100) {
				cs = 0;
				++s;
			}
			if (s == 60) {
				s = 0;
				++m;
			}
			if (m == 60) {
				m = 0;
				++h;
			}
			actualizar_tiempo();
		}

	};

	public void actualizar_tiempo() {
		String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":"
				+ (cs <= 9 ? "0" : "") + cs;
		lbl_tiempo.setText(tiempo);
	}

	/**
	 * Initialize the contents of the frame.
	 */

	public void mover(int indice) {
		int arriba = indice - 4, abajo = indice + 4, izquierda = indice - 1, derecha = indice + 1;
		if ((arriba >= 0)) {
			if (numeros[arriba] == 16) {
				numeros[arriba] = numeros[indice];
				numeros[indice] = 16;
			}
		}
		if ((abajo <= 15)) {
			if (numeros[abajo] == 16) {
				numeros[abajo] = numeros[indice];
				numeros[indice] = 16;
			}
		}

		if ((!(izquierda == 3 || izquierda == 7 || izquierda == 11)) && izquierda >= 0) {
			if (numeros[izquierda] == 16) {
				numeros[izquierda] = numeros[indice];
				numeros[indice] = 16;
			}
		}

		if ((!(derecha == 4 || derecha == 8 || derecha == 12) && derecha <= 15)) {
			if (numeros[derecha] == 16) {
				numeros[derecha] = numeros[indice];
				numeros[indice] = 16;
			}
		}
		pintar_numeros();
	}

	public void remover_numeros() {
		int cont = 0;
		do {
			int numero;
			int aux;
			for (int i = 0; i < numeros.length; i++) {
				numero = (int) (Math.random() * 16) + 1;
				aux = numeros[i];
				numeros[i] = numeros[numero - 1];
				numeros[numero - 1] = aux;
			}
			cont++;
		} while (cont < 2);
	}

	public void click(JButton btn) {
		if (!btn.getText().equals("")) {
			for (int i = 0; i < numeros.length; i++) {
				if (Integer.parseInt(btn.getText()) == numeros[i]) {
					indice = i;
					System.out.println("Ganamos: " + indice);
					mover(indice);
					return;
				}
			}
		}
	}

	public void gano() {
		if (Arrays.equals(correcto, numeros)) {
			for (int i = 0; i < botones.size(); i++) {
				botones.get(i).setEnabled(false);
			}
			t.stop();
			String tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s
					+ ":" + (cs <= 9 ? "0" : "") + cs;
			JOptionPane.showMessageDialog(null, "¡Felicidades, Ganaste! \n¡Lo hiciste en " + tiempo + "!");
			btn_iniciar.setEnabled(false);
			btn_pausa.setEnabled(false);
		}
	}

	public void reiniciar() {
		if (t.isRunning()) {
			t.stop();
		}
		btn_iniciar.setEnabled(true);
		btn_iniciar.setText("INICIAR");
		btn_pausa.setEnabled(false);
		h = 0;
		m = 0;
		s = 0;
		cs = 0;
		for (int i = 0; i < botones.size(); i++) {
			botones.get(i).setEnabled(false);
		}
		actualizar_tiempo();
		remover_numeros();
		pintar_numeros();
	}

	public void pintar_numeros() {
		for (int i = 0; i < botones.size(); i++) {
			if (numeros[i] == 16)
				botones.get(i).setText("");
			else
				botones.get(i).setText("" + numeros[i]);
			System.out.println(numeros[i]);
		}
	}

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 937, 784);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 8, 8));
		remover_numeros();
		pintar_numeros();
		btnNewButton.setEnabled(false);
		btnNewButton.setForeground(new Color(255, 255, 255));

		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton.setBackground(new Color(0, 0, 160));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setForeground(new Color(255, 255, 255));

		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_1.setBackground(new Color(0, 0, 160));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_1);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setForeground(new Color(255, 255, 255));

		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_2.setBackground(new Color(0, 0, 160));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_2);
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setForeground(new Color(255, 255, 255));

		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_3.setBackground(new Color(0, 0, 160));
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_3);
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setForeground(new Color(255, 255, 255));

		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_4.setBackground(new Color(0, 0, 160));
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_4);
		btnNewButton_5.setEnabled(false);
		btnNewButton_5.setForeground(new Color(255, 255, 255));

		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_5.setBackground(new Color(0, 0, 160));
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_5);
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.setForeground(new Color(255, 255, 255));

		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_6.setBackground(new Color(0, 0, 160));
		btnNewButton_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_6);
		btnNewButton_7.setEnabled(false);
		btnNewButton_7.setForeground(new Color(255, 255, 255));

		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_7.setBackground(new Color(0, 0, 160));
		btnNewButton_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_7);
		btnNewButton_8.setEnabled(false);
		btnNewButton_8.setForeground(new Color(255, 255, 255));

		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_8.setBackground(new Color(0, 0, 160));
		btnNewButton_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_8);
		btnNewButton_9.setEnabled(false);
		btnNewButton_9.setForeground(new Color(255, 255, 255));

		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_9.setBackground(new Color(0, 0, 160));
		btnNewButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_9);
		btnNewButton_10.setEnabled(false);
		btnNewButton_10.setForeground(new Color(255, 255, 255));

		btnNewButton_10.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_10.setBackground(new Color(0, 0, 160));
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_10);
		btnNewButton_11.setEnabled(false);
		btnNewButton_11.setForeground(new Color(255, 255, 255));

		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_11.setBackground(new Color(0, 0, 160));
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_11);
		btnNewButton_12.setEnabled(false);
		btnNewButton_12.setForeground(new Color(255, 255, 255));

		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_12.setBackground(new Color(0, 0, 160));
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_12);
		btnNewButton_13.setEnabled(false);
		btnNewButton_13.setForeground(new Color(255, 255, 255));

		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_13.setBackground(new Color(0, 0, 160));
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_13);
		btnNewButton_14.setEnabled(false);
		btnNewButton_14.setForeground(new Color(255, 255, 255));

		btnNewButton_14.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_14.setBackground(new Color(0, 0, 160));
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_14);
		btnNewButton_15.setEnabled(false);
		btnNewButton_15.setForeground(new Color(255, 255, 255));

		btnNewButton_15.setFont(new Font("Dialog", Font.BOLD, 60));
		btnNewButton_15.setBackground(new Color(0, 0, 160));
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				gano();
			}
		});
		panel.add(btnNewButton_15);

		JButton btn_reiniciar = new JButton("REINICIAR");
		btn_reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btn_reiniciar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btn_reiniciar, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_2, BorderLayout.WEST);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 64));
		frame.getContentPane().add(panel_3, BorderLayout.EAST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 30, 0, 30 };
		gbl_panel_3.rowHeights = new int[] { 37, 30, 30, 30, 30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30 };
		gbl_panel_3.columnWeights = new double[] { 0.0, 0.0 };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 45));
		panel_3.add(lblNewLabel_1, gbc_lblNewLabel_1);

		lbl_tiempo.setForeground(new Color(221, 126, 106));
		lbl_tiempo.setBackground(new Color(221, 126, 106));
		lbl_tiempo.setFont(new Font("Tahoma", Font.BOLD, 32));
		GridBagConstraints gbc_lbl_tiempo = new GridBagConstraints();
		gbc_lbl_tiempo.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_tiempo.gridx = 1;
		gbc_lbl_tiempo.gridy = 5;
		panel_3.add(lbl_tiempo, gbc_lbl_tiempo);
		btn_pausa.setBackground(new Color(0, 0, 160));
		btn_pausa.setForeground(new Color(255, 255, 255));
		btn_pausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.stop();
				btn_pausa.setEnabled(false);
				btn_iniciar.setEnabled(true);
				for (int i = 0; i < botones.size(); i++) {
					botones.get(i).setEnabled(false);
				}
			}
		});

		btn_iniciar.setBackground(new Color(0, 0, 160));
		btn_iniciar.setForeground(new Color(255, 255, 255));
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.start();
				for (int i = 0; i < botones.size(); i++) {
					botones.get(i).setEnabled(true);
				}
				btn_pausa.setEnabled(true);
				btn_iniciar.setEnabled(false);
				btn_iniciar.setText("Reanudar");
			}
		});
		btn_iniciar.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btn_iniciar = new GridBagConstraints();
		gbc_btn_iniciar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn_iniciar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_iniciar.gridx = 1;
		gbc_btn_iniciar.gridy = 8;
		panel_3.add(btn_iniciar, gbc_btn_iniciar);
		btn_pausa.setEnabled(false);
		btn_pausa.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GridBagConstraints gbc_btn_pausa = new GridBagConstraints();
		gbc_btn_pausa.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn_pausa.insets = new Insets(0, 0, 5, 5);
		gbc_btn_pausa.gridx = 1;
		gbc_btn_pausa.gridy = 9;
		panel_3.add(btn_pausa, gbc_btn_pausa);
	}
}
