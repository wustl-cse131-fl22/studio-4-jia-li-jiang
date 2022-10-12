package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledSquare(0.5, 0.5, 1);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.33);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.circle(0.5,  0.5, 0.25);
		
		StdDraw.filledCircle(0.68,  0.68, 0.07);
		StdDraw.filledCircle(0.32,  0.68, 0.07);
		
		StdDraw.filledCircle(0.60,  0.55, 0.05);
		StdDraw.filledCircle(0.40,  0.55, 0.05);
		
		double [] x = {0.5, 0.45, 0.55};
		double [] y = {0.40, 0.45, 0.45};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.line(0.5, 0.40, 0.5, 0.37);
		StdDraw.line(0.5, 0.37, 0.40, 0.35);
		StdDraw.line(0.5, 0.37, 0.60, 0.35);
	}
}