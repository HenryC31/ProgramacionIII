import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
	private int indice;
	private int numeros[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

	public static ArrayList<JButton> botones = new ArrayList<JButton>(
			Arrays.asList(btnNewButton, btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5,
					btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9, btnNewButton_10, btnNewButton_11,
					btnNewButton_12, btnNewButton_13, btnNewButton_14, btnNewButton_15));

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
		initialize();
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

//		if (!(izquierda == 3 || izquierda == 7 || izquierda == 11)) {
//			if (numeros[izquierda] == 16) {
//				numeros[izquierda] = numeros[indice];
//				numeros[indice] = 16;
//			}
//		}
//
//		if (!(derecha == 4 || derecha == 8 || derecha == 12)) {
//			if (numeros[derecha] == 16) {
//				numeros[derecha] = numeros[indice];
//				numeros[indice] = 16;
//			}
//		}
		pintar_numeros();
	}

	public void remover_numeros() {
		int numero;
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			numero = (int) (Math.random() * 16) + 1;
			aux = numeros[i];
			numeros[i] = numeros[numero - 1];
			numeros[numero - 1] = aux;
		}
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
		frame.setBounds(100, 100, 750, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(165, 154, 18));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 8, 8));
		remover_numeros();
		pintar_numeros();

		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton.setBackground(new Color(233, 219, 50));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton);

		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_1.setBackground(new Color(233, 219, 50));
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_1);

		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_2.setBackground(new Color(233, 219, 50));
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_2);

		btnNewButton_3.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_3.setBackground(new Color(233, 219, 50));
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_3);

		btnNewButton_4.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_4.setBackground(new Color(233, 219, 50));
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_4);

		btnNewButton_5.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_5.setBackground(new Color(233, 219, 50));
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_5);

		btnNewButton_6.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_6.setBackground(new Color(233, 219, 50));
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_6);

		btnNewButton_7.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_7.setBackground(new Color(233, 219, 50));
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_7);

		btnNewButton_8.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_8.setBackground(new Color(233, 219, 50));
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_8);

		btnNewButton_9.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_9.setBackground(new Color(233, 219, 50));
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_9);

		btnNewButton_10.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_10.setBackground(new Color(233, 219, 50));
		btnNewButton_10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_10);

		btnNewButton_11.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_11.setBackground(new Color(233, 219, 50));
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_11);

		btnNewButton_12.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_12.setBackground(new Color(233, 219, 50));
		btnNewButton_12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_12);

		btnNewButton_13.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_13.setBackground(new Color(233, 219, 50));
		btnNewButton_13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_13);

		btnNewButton_14.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_14.setBackground(new Color(233, 219, 50));
		btnNewButton_14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_14);

		btnNewButton_15.setFont(new Font("Dialog", Font.BOLD, 50));
		btnNewButton_15.setBackground(new Color(233, 219, 50));
		btnNewButton_15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_15);

		JButton btn_reiniciar = new JButton("REINICIAR");
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
	}

}
