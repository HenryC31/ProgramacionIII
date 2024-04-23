
public class Jugador {
	private int x, y, width, height;
	private String color;

	public Jugador(int x, int y, int width, int height, String color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	public boolean colision(Jugador[] j) {
//		for (int i = 0; i < j.length; i++) {
//			if (this.x + this.width >= j[i].x && this.x <= j[i].x + j[i].width && this.y <= j[i].y + j[i].height
//					&& this.y + this.height >= j[i].y) {
//				return true;
//			}
//		}
//		return false;
//	}
	public boolean colision(Jugador j) {

		if (this.x + this.width > j.x) {
			if (this.x < j.x + j.width) {
				if (this.y < j.y + j.height) {
					if (this.y + this.height > j.y) {
						return true;
					}
				}
			}
		}

		return false;
	}

}
