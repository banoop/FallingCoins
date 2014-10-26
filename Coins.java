package MakeItRain;

import zen.core.Zen;

public class Coins {
	
	boolean isBrick;
	int x;
	int y;
	int dy;
	int speed;
	int value;
	public Coins() {
		x = Zen.getRandomNumber(5, 595);
		y = 5;
		speed = 5;
		value = -1;
	}
	public void draw() {
		Zen.setColor("brown");
		Zen.fillOval(x, y, 10, 10);
	}
	public void move(){
		y = y + speed;
	}

}
