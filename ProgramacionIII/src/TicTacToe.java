import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TicTacToe {

	private static JButton btnNewButton_1 = new JButton("");
	private static JButton btnNewButton_2 = new JButton("");
	private static JButton btnNewButton_3 = new JButton("");
	private static JButton btnNewButton_4 = new JButton("");
	private static JButton btnNewButton_5 = new JButton("");
	private static JButton btnNewButton_6 = new JButton("");
	private static JButton btnNewButton_7 = new JButton("");
	private static JButton btnNewButton_8 = new JButton("");
	private static JButton btnNewButton_9 = new JButton("");
	JLabel gano_x_tag = new JLabel("0         ");
	JLabel gano_o_tag = new JLabel("0         ");

	private int turno = 2;
	public static ArrayList<JButton> botones = new ArrayList<JButton>(
			Arrays.asList(btnNewButton_1, btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5,
					btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9));
	private int arreglo[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	private JFrame frame;
	private ImageIcon img;
	private int gano_x = 0, gano_o = 0;
	private final JPanel panel = new JPanel();
	private final JPanel panel_norte = new JPanel();
	private final JPanel panel_sur = new JPanel();
	private final JButton btn_reiniciar = new JButton("REINICIAR");

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
			img = new ImageIcon(getClass().getResource("close.png"));
			btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(btn.getWidth() - 10, btn.getHeight() - 10,
					Image.SCALE_AREA_AVERAGING)));
			btn.setText("x");
		} else {
			turno++;
			img = new ImageIcon(getClass().getResource("o.png"));
			btn.setIcon(new ImageIcon(img.getImage().getScaledInstance(btn.getWidth() - 10, btn.getHeight() - 10,
					Image.SCALE_AREA_AVERAGING)));
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
			if (turno == 1)
				gano_x_tag.setText(++gano_x + "         ");
//				gano_x++;
			else
				gano_o_tag.setText(++gano_o + "         ");
//				gano_o++;
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 820, 670);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		panel.setBackground(new Color(191, 139, 0));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 5, 5));

		for (int i = 0; i < botones.size(); i++) {
			botones.get(i).setBackground(new Color(237, 184, 44));
		}

		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
				if (btnNewButton_1.getText().equals(botones.get(1).getText())
						&& btnNewButton_1.getText().equals(botones.get(2).getText())) {
					gano();
				}

			}
		});
		panel.add(btnNewButton_1);

		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_2);

		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_3);

		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_4);

		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_5);

		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_6);

		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_7);

		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_8);

		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click((JButton) e.getSource());
			}
		});
		panel.add(btnNewButton_9);

		frame.getContentPane().add(panel_norte, BorderLayout.NORTH);
		panel_norte.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

		JLabel lblNewLabel = new JLabel("Ganadas X:  ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_norte.add(lblNewLabel);

		gano_x_tag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_norte.add(gano_x_tag);

		JLabel lblNewLabel_1 = new JLabel("Ganadas O: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_norte.add(lblNewLabel_1);

		gano_o_tag.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_norte.add(gano_o_tag);

		frame.getContentPane().add(panel_sur, BorderLayout.SOUTH);
		btn_reiniciar.setFont(new Font("Dialog", Font.BOLD, 20));
		btn_reiniciar.setOpaque(true);
		btn_reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}

		});

		panel_sur.add(btn_reiniciar);
	}

	public void reiniciar() {
		for (int i = 0; i < botones.size(); i++) {
			botones.get(i).setEnabled(true);
			botones.get(i).setText("");
			botones.get(i).setIcon(null);
		}
		turno = 2;
	}
}
