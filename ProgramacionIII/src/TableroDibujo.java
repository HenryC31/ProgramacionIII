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
		panel.setBackground(new Color(69, 46, 122));
		getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Reinicio");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(btnNewButton);
		JPanel panel_1 = new JPanel();

		getContentPane().add(panel_1, BorderLayout.CENTER);

		requestFocus();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

//		g2d.setColor(Color.blue);
		g2d.fillRect(x, y, 50, 50);
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
			y -= 10;
			break;
		case 65: // a
			x -= 10;
			break;
		case 83: // s
			y += 10;
			break;
		case 68: // d
			x += 10;
			break;
		}
		repaint();
		revalidate();
		update(getGraphics());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}