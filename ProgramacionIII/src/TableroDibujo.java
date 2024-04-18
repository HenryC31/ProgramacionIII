import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TableroDibujo extends JFrame implements KeyListener {

	private int x = 375;
	private int y = 300;
	Jugador jugador = new Jugador(x, y, 50, 50, "#32A175");
	Jugador obst = new Jugador(500, 150, 50, 200, "#050505");
	Jugador obst2 = new Jugador(100, 300, 70, 280, "#AA00FF");
	Jugador[] obstaculos = { obst, obst2 };
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TableroDibujo tablero = new TableroDibujo();
	}

	/**
	 * Create the application.
	 */
	public TableroDibujo() {
		this.setVisible(true);
		this.setBounds(100, 100, 800, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		initialize();

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

		g2d.setColor(Color.decode(obst.getColor()));
		g2d.fillRect(obst.getX(), obst.getY(), obst.getWidth(), obst.getHeight());

		g2d.setColor(Color.decode(obst2.getColor()));
		g2d.fillRect(obst2.getX(), obst2.getY(), obst2.getWidth(), obst2.getHeight());
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
			jugador.setY(jugador.getY() - 10);
			break;
		case 65: // a
			jugador.setX(jugador.getX() - 10);
			break;
		case 83: // s
			jugador.setY(jugador.getY() + 10);
			y += 10;
			break;
		case 68: // d
			jugador.setX(jugador.getX() + 10);
			x += 10;
			break;
		}
		if (jugador.colision(obstaculos))
			System.out.println("Colisión");
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}