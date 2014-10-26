package MakeItRain;

import zen.core.Zen;

public class Player {
	int x = 50;
	int y = 480;
	int dy;
	boolean jumping;
	public void draw() {
		Zen.setColor("red");
		Zen.fillOval(x -20, y - 20,40,40);
		
	}
	public void move() {
		if(Zen.isKeyPressed("left") && x > 25){
			x = x - 8;
		}
		if(Zen.isKeyPressed("right") && x < 575){
			x = x + 8;
			
		}
		if(Zen.isKeyPressed("up") && jumping == false){
			dy = -20;
			 jumping = true;
		}
		if(y > 480){
			y = 480;
			dy = 0;
			jumping = false;
			
		}
		else {
			y = y + dy;
			dy++;
		}
	}
	public boolean collects(Coins coins) {
		if(Math.abs(x - coins.x ) < 25 && Math.abs(y - coins.y ) < 25) {
			return true;
		}
		return false;
	}
	
}
