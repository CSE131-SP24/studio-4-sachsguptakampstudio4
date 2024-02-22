package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(252, 129, 203);
		StdDraw.filledRectangle(0.0, 0.0, 1.0, 1.0);
		StdDraw.setPenColor(252, 250, 129);//yellow
		StdDraw.filledCircle(0.5, 0.5, 0.45);
		StdDraw.setPenColor(150, 213, 250);//blue
		StdDraw.filledCircle(0.5, 0.5, 0.4);
		StdDraw.setPenColor(200, 174, 245);//lavender
		StdDraw.filledCircle(0.5, 0.5, 0.35);
		StdDraw.setPenColor(170, 242, 171);//aqua
		StdDraw.filledCircle(0.5, 0.5, 0.3);
		StdDraw.setPenColor(252, 250, 129);//yellow
		StdDraw.filledCircle(0.5, 0.5, 0.25);
		StdDraw.setPenColor(150, 213, 250);//blue
		StdDraw.filledCircle(0.5, 0.5, 0.20);
		StdDraw.setPenColor(200, 174, 245);//lavender
		StdDraw.filledCircle(0.5, 0.5, 0.15);
		StdDraw.setPenColor(170, 242, 171);//aqua
		StdDraw.filledCircle(0.5, 0.5, 0.1);
		StdDraw.setPenColor(252, 129, 203);
		StdDraw.filledCircle(0.5, 0.5, 0.05);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.text(0.5, 0.5, "PINK");
		StdDraw.setPenColor(StdDraw.WHITE);
		double[] x = {0.01, 0.21, 0.01};
		double[] y = {0.99, 0.99, 0.79};
		StdDraw.filledPolygon(x, y);
		double[] i = {0.01, 0.21, 0.01};
		double[] j = {0.01, 0.01, 0.21};
		StdDraw.filledPolygon(i, j);
		double[] k = {0.99, 0.79, 0.99};
		double[] l = {0.01, 0.01, 0.21};
		StdDraw.filledPolygon(k, l);
		double[] o = {0.99, 0.79, 0.99};
		double[] p = {0.99, 0.99, 0.79};
		StdDraw.filledPolygon(o, p);
		}
	
}