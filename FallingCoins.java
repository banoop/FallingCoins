package MakeItRain;

import java.util.ArrayList;

import zen.core.Zen;

public class FallingCoins {

	public static void main(String[] args) {
		Zen.create(600,600);
		int score = 0;
		Player p = new Player();

		ArrayList<Coins> coinslist = new ArrayList<Coins>();

		Coins c = new Coins();
		boolean gameover = false;
		coinslist.add(c);
		if(gameover = true) {
			Zen.setBackground("white");
			Zen.setColor("red");
		}
		else{
			while(true){
				
				drawBackground();
				p.draw();
				p.move();

				if(coinslist.get(coinslist.size() - 1).y > 100){
					spawncoins(coinslist);
				}

				for(int i = 0; i < coinslist.size(); i ++){
					coinslist.get(i).draw();
					coinslist.get(i).move();
					if(coinslist.get(i).isBrick){
						if (p.collects(coinslist.get(i))){
							gameover = true;
						}
					}
					if(p.collects(coinslist.get(i))){
						score = score + coinslist.get(i).value;
						coinslist.remove(i);

					}
					if(coinslist.get(i).y > 495){
						coinslist.remove(i);
						i--;
					}
				}
				Zen.drawText("Score: " + -score, 50, 50);
				Zen.buffer(30);
			}
		}
		
	}


	private static void spawncoins(ArrayList<Coins> coinslist) {
		int random = Zen.getRandomNumber(1, 10);

		if(random < 9){
			Coins c = new Coins();
			coinslist.add(c);
		}
		else {
			Brick b = new Brick();
			coinslist.add(b);
		}

	}



	private static void drawBackground() {
		Zen.setBackground("light blue");
		Zen.setColor("yellow");
		Zen.fillOval(0, 0, 600, 600);
		Zen.setColor("green");
		Zen.fillRect(0, 500, 600, 100);

	}

}
