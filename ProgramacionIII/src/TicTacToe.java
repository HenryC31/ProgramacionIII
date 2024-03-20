import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe {

	private int turno = 2;
	public static JButton btnNewButton_1 = new JButton("");
	public static JButton btnNewButton_2 = new JButton("");
	public static JButton btnNewButton_3 = new JButton("");
	public static JButton btnNewButton_4 = new JButton("");
	public static JButton btnNewButton_5 = new JButton("");
	public static JButton btnNewButton_6 = new JButton("");
	public static JButton btnNewButton_7 = new JButton("");
	public static JButton btnNewButton_8 = new JButton("");
	public static JButton btnNewButton_9 = new JButton("");
	public static ArrayList<JButton> botones = new ArrayList<JButton>(
			Arrays.asList(btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5,
					btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9));
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	public void click(JButton btn) {
		if (turno == 2) {
			turno--;
			btn.setText("X");
		} else {
			turno++;
			btn.setText("O");
		}
		btn.setEnabled(false);
		gano();
	}

	public void gano() {
		if (botones.get(0).getText().equals(botones.get(1).getText())
				&& botones.get(0).getText().equals(botones.get(2).getText()) && !botones.get(0).getText().equals("")
				|| botones.get(0).getText().equals(botones.get(3).getText())
						&& botones.get(0).getText().equals(botones.get(6).getText())
						&& !botones.get(0).getText().equals("")
				|| botones.get(0).getText().equals(botones.get(4).getText())
						&& botones.get(0).getText().equals(botones.get(8).getText())
						&& !botones.get(0).getText().equals("")
				|| botones.get(1).getText().equals(botones.get(4).getText())
						&& botones.get(1).getText().equals(botones.get(7).getText())
						&& !botones.get(1).getText().equals("")
				|| botones.get(2).getText().equals(botones.get(5).getText())
						&& botones.get(2).getText().equals(botones.get(8).getText())
						&& !botones.get(2).getText().equals("")
				|| botones.get(2).getText().equals(botones.get(4).getText())
						&& botones.get(2).getText().equals(botones.get(6).getText())
						&& !botones.get(2).getText().equals("")
				|| botones.get(3).getText().equals(botones.get(4).getText())
						&& botones.get(3).getText().equals(botones.get(5).getText())
						&& !botones.get(3).getText().equals("")
				|| botones.get(6).getText().equals(botones.get(7).getText())
						&& botones.get(6).getText().equals(botones.get(8).getText())
						&& !botones.get(6).getText().equals("")) {

			for (int i = 0; i < botones.size(); i++) {
				botones.get(i).setEnabled(false);
			}
			JOptionPane.showMessageDialog(null, "¡Felicidades! Ganó el turno " + turno);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 820, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(3, 3, 0, 0));
		btnNewButton_1.setOpaque(false);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());

				if (btnNewButton_1.getText().equals(botones.get(1).getText())
						&& btnNewButton_1.getText().equals(botones.get(2).getText())) {
					gano();
				}

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_1);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_2);

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_3);

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_4);

		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_5);

		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_6);

		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_7);

		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_8);

		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 70));
		frame.getContentPane().add(btnNewButton_9);
	}

}
