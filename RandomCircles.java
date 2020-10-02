/*
 * 1.TRUE
 * 2.TRUE
 * 
 * 3.
	 * snitch: x = 4004, y = 1001
	 * quaffle: x = 2003, y = 1, z = 1001
	 * bludger: x = 1001, y = 2001, z = 2003
 * 
 */
import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import java.util.Random;


public class RandomCircles extends GraphicsProgram {

	public void run() {
		
		for(int i = 0; i < 10; i++) {
			makeCircle();
		}
	}

	private void makeCircle() {

		int randomRadius = getRandomNumber("radius");
		int randomX = getRandomNumber("X");
		int randomY = getRandomNumber("Y");
		GOval circle = new GOval(randomX,randomY,randomRadius, randomRadius);
		circle.setFilled(true);
		Color randomColor = new Color((int) (Math.random() * 0x1000000));
		circle.setFillColor(randomColor);
		add(circle);

	}

	private int getRandomNumber(String type) {
		Random rand = new Random();
		int n = 0;
		if(type=="radius") {
			n = rand.nextInt(45);
			n += 5;
		}
		else if(type=="X"){
			n = rand.nextInt(getWidth()-50);
		}
		else if(type=="Y"){
			n = rand.nextInt(getHeight()-50);
		}
		else {
			n = rand.nextInt(45);
		}
		return n;
	}
}
