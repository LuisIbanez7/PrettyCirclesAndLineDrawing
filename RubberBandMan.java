import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;
public class RubberBandMan extends GraphicsProgram{

	private GLine line;
	public void run() {
		addMouseListeners();
	}
	public void mousePressed(MouseEvent press) {
		line = new GLine(press.getX(), press.getY(),press.getX(), press.getY());
		add(line);
	}
	public void mouseDragged(MouseEvent drag) {
		line.setEndPoint(drag.getX(), drag.getY());
	}
}
