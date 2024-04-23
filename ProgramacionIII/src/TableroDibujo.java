import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TableroDibujo extends JFrame implements KeyListener {

	private int x = 42;
	private int y = 60;
	int dir = 0;
	Jugador jugador = new Jugador(x, y, 20, 20, "#32A175");
	Jugador gano = new Jugador(455, 174, 20, 20, "#AE0000");

	Obstaculo contorno[] = { new Obstaculo(17, 40, 485, 15, "#030303"), new Obstaculo(489, 40, 15, 350, "#030303"),
			new Obstaculo(17, 40, 15, 350, "#030303"), new Obstaculo(17, 380, 485, 15, "#030303") };

	Obstaculo obstaculos[] = { contorno[0], contorno[1], contorno[2], contorno[3],
			new Obstaculo(112, 55, 5, 30, "black"), new Obstaculo(112, 80, 30, 5, "black"),
			new Obstaculo(137, 80, 5, 30, "black"), new Obstaculo(137, 105, 30, 5, "black"),
			new Obstaculo(162, 80, 5, 30, "black"), new Obstaculo(162, 80, 60, 5, "black"),
			new Obstaculo(27, 80, 60, 5, "black"), new Obstaculo(82, 80, 5, 30, "black"),
			new Obstaculo(55, 110, 60, 5, "black"), new Obstaculo(110, 110, 5, 30, "black"),
			new Obstaculo(197, 110, 5, 30, "black"), new Obstaculo(197, 110, 60, 5, "black"),
			new Obstaculo(252, 80, 5, 30, "black"), new Obstaculo(252, 80, 30, 5, "black"),
			new Obstaculo(282, 80, 5, 150, "black"), new Obstaculo(312, 55, 5, 30, "black"),
			new Obstaculo(312, 80, 30, 5, "black"), new Obstaculo(337, 85, 5, 210, "black"),
			new Obstaculo(312, 140, 60, 5, "black"), new Obstaculo(282, 110, 30, 5, "black"),
			new Obstaculo(282, 170, 30, 5, "black"), new Obstaculo(312, 200, 30, 5, "black"),
			new Obstaculo(282, 230, 30, 5, "black"), new Obstaculo(307, 230, 5, 90, "black"),
			new Obstaculo(342, 230, 30, 5, "black"), new Obstaculo(307, 320, 65, 5, "black"),
			new Obstaculo(372, 260, 30, 5, "black"), new Obstaculo(367, 260, 5, 120, "black"),
			new Obstaculo(397, 200, 5, 90, "black"), new Obstaculo(367, 200, 30, 5, "black"),
			new Obstaculo(367, 170, 5, 30, "black"), new Obstaculo(367, 85, 5, 60, "black"),
			new Obstaculo(372, 170, 30, 5, "black"), new Obstaculo(367, 80, 90, 5, "black"),
			new Obstaculo(400, 110, 30, 5, "black"), new Obstaculo(400, 110, 5, 65, "black"),
			new Obstaculo(456, 80, 5, 60, "black"), new Obstaculo(430, 140, 30, 5, "black"),

			new Obstaculo(17, 190, 80, 5, "black"), new Obstaculo(47, 165, 5, 30, "black"),
			new Obstaculo(47, 165, 60, 5, "black"), new Obstaculo(102, 135, 5, 30, "black"),
			new Obstaculo(102, 135, 30, 5, "black"), new Obstaculo(132, 135, 5, 150, "black"),
			new Obstaculo(162, 135, 40, 5, "black"), new Obstaculo(187, 140, 5, 210, "black"),
			new Obstaculo(162, 195, 60, 5, "black"), new Obstaculo(132, 165, 30, 5, "black"),
			new Obstaculo(132, 225, 30, 5, "black"), new Obstaculo(162, 255, 30, 5, "black"),
			new Obstaculo(132, 285, 30, 5, "black"),

			new Obstaculo(132, 320, 60, 5, "black"), new Obstaculo(187, 265, 5, 60, "black"),
			new Obstaculo(192, 350, 30, 5, "black"), new Obstaculo(187, 260, 90, 5, "black"),
			new Obstaculo(220, 290, 30, 5, "black"), new Obstaculo(220, 290, 5, 65, "black"),
			new Obstaculo(276, 260, 5, 60, "black"), new Obstaculo(250, 320, 30, 5, "black"),
			new Obstaculo(95, 190, 5, 90, "black"), new Obstaculo(65, 275, 30, 5, "black"),

			new Obstaculo(430, 145, 5, 30, "black"), new Obstaculo(430, 170, 30, 5, "black"),
			new Obstaculo(457, 195, 5, 200, "black"), new Obstaculo(432, 240, 60, 5, "black"),
			new Obstaculo(432, 300, 30, 5, "black"), new Obstaculo(462, 330, 30, 5, "black") };

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
//		TableroDibujo tablero = new TableroDibujo();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableroDibujo window = new TableroDibujo();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TableroDibujo() {
		this.setVisible(true);
		this.setBounds(100, 100, 520, 480);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		initialize();
		this.addKeyListener(this);
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e.getX() + " " + e.getY());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

//		Timer timer = new Timer(100, (ActionListener) new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				update();
//			}
//		});
//		timer.start();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(10);
		panel.setBackground(new Color(64, 0, 128));
		getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Reinicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jugador.setX(42);
				jugador.setY(62);
				getContentPane().update(getGraphics());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton);
		JPanel panel_1 = new JPanel();

		getContentPane().add(panel_1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(64, 0, 128));
		getContentPane().add(panel_2, BorderLayout.NORTH);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(64, 0, 128));
		getContentPane().add(panel_3, BorderLayout.WEST);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(64, 0, 128));
		getContentPane().add(panel_4, BorderLayout.EAST);

		requestFocus();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.decode(jugador.getColor()));
		g2d.fillRect(jugador.getX(), jugador.getY(), jugador.getWidth(), jugador.getHeight());

		g2d.setColor(Color.black);

		for (Obstaculo contorno : contorno) {
			g2d.fillRect(contorno.getX(), contorno.getY(), contorno.getWidth(), contorno.getHeight());
		}

		for (Obstaculo obstaculo : obstaculos) {
			g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getWidth(), obstaculo.getHeight());
		}

		g2d.setColor(Color.decode(gano.getColor()));
		g2d.fillRect(gano.getX(), gano.getY(), gano.getWidth(), gano.getHeight());

//		g2d.setColor(Color.decode(obst.getColor()));
//		g2d.fillRect(obst.getX(), obst.getY(), obst.getWidth(), obst.getHeight());
//
//		g2d.setColor(Color.decode(obst2.getColor()));
//		g2d.fillRect(obst2.getX(), obst2.getY(), obst2.getWidth(), obst2.getHeight());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode() + "   " + e.getKeyChar());
		switch (e.getKeyCode()) {
		case 87: // w
			dir = 1;
			break;
		case 65: // a
			dir = 2;
			break;
		case 83: // s
			dir = 3;
			break;
		case 68: // d
			dir = 4;
			break;
		}
		update();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void update() {

		switch (dir) {
		case 1: // w
			jugador.setY(jugador.getY() - 5);
			break;
		case 2: // a
			jugador.setX(jugador.getX() - 5);
			break;
		case 3: // s
			jugador.setY(jugador.getY() + 5);
			break;
		case 4: // d
			jugador.setX(jugador.getX() + 5);
			break;
		}

		for (Jugador obstaculo : obstaculos) {
			if (jugador.colision(obstaculo)) {
				System.out.println("Colisión");
				if (dir == 1) {
					jugador.setY(jugador.getY() + 5);
				}

				if (dir == 2) {
					jugador.setX(jugador.getX() + 5);
				}

				if (dir == 3) {
					jugador.setY(jugador.getY() - 5);
				}

				if (dir == 4) {
					jugador.setX(jugador.getX() - 5);
				}
			}
		}
		if (jugador.colision(gano)) {
			JOptionPane.showMessageDialog(null, "Felicidades! Ganaste :)");
		}
		update(getGraphics());
	}
}