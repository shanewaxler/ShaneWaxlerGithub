//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 5);
	}

	public Ammo(int x, int y) {
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) {
		setPos(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.PINK);
		window.fillRect(getX(), getY(), 5, 15);
	}

	public void move(String direction) {
		if (direction.equals("UP")) {
			setY(getY() - speed);
		}
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}