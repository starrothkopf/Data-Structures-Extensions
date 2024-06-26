package divinelines;

import edu.princeton.cs.introcs.StdDraw;

public class Lines {
	/**
	 * 
	 * @param x1 x coordinate of starting point
	 * @param y1 y coordinate of starting point
	 * @param x2 x coordinate of ending point
	 * @param y2 y coordinate of ending point
	 */
	public static void drawLine(double x1, double y1, double x2, double y2) {
		// FIXME -- fill in this method according to the instructions
		StdDraw.setPenColor(StdDraw.BLACK);
		
		if (x1 < x2 + 0.001 && x1 > x2 - 0.001 // broad
				&& 
				y1 < y2 + 0.001 && y1 > y2 - 0.001) {
			StdDraw.point(x1, y1);
		} else {
			StdDraw.point((x1 + x2)/2.0, (y1 + y2)/2.0); // start halfway
			drawLine(x1, y1, (x1 + x2)/2.0, (y1 + y2)/2.0); // draw new point from start to halfway
	        drawLine((x1 + x2)/2.0, (y1 + y2)/2.0, x2, y2); // draw new point from halfway to end
		}

		// Note: StdDraw.show() is required to draw that which is 
		// deferred by StdDraw.enableDoubleBuffering();
		StdDraw.show();
	}

	/**
	 * Code to test the drawLine method visually
	 */
	public static void main(String[] args) {
		// uncomment the line below when you are ready to speed up the drawing
		StdDraw.enableDoubleBuffering();

		StdDraw.setPenRadius(0.002);
		//
		// Test the drawing program
		//
		drawLine(0, 0, 1, 1); // lower left to upper right
		drawLine(0, 1, 1, 0); // upper left to lower right

		//
		// Draw rectangles of decreasing width and height
		//
		for (double r = 0.25; r < 0.5; r = r + .005) {
			double s = 1 - r;
			drawLine(r, r, r, s);
			drawLine(r, s, s, s);
			drawLine(s, s, s, r);
			drawLine(s, r, r, r);
		}
		System.out.println("done drawing");
	}

	
}
