import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Laberinto extends JPanel implements KeyListener {
	private int x = 20;
	private int y = 10;
	int dir = 0;
	Jugador jugador = new Jugador(x, y, 20, 20, "#32A175");
	Obstaculo obst = new Obstaculo(500, 150, 50, 200, "#050505");
	Obstaculo obst2 = new Obstaculo(100, 300, 70, 280, "#AA00FF");
	Obstaculo[] obstaculos = { obst, obst2 };

	public Laberinto() {
		inicializar();
		this.addKeyListener(this);

//		Timer timer = new Timer(100, (ActionListener) new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				update();
//			}
//		});
//		timer.start();
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

//	public void update() {
//		repaint();
//	}

	public void inicializar() {

		JFrame frame = new JFrame("Laberinto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 700);
		frame.add(new Laberinto());

		JButton boton_reiniciar = new JButton("Reiniciar");
		boton_reiniciar.setBounds(380, 500, 40, 10);
		this.add(boton_reiniciar);

	}

	public static void main(String[] args) {
		Laberinto lab = new Laberinto();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode() + "  " + e.getKeyChar());
		switch (e.getKeyCode()) {
		case 87: // w
			dir = 1;
			jugador.setY(jugador.getY() - 10);
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
		update(getGraphics());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
