import java.awt.*;
import java.awt.event.*;
import java.awt.geom.QuadCurve2D;
import java.util.Scanner;

import javax.swing.*;


public class Graph extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		this.setBackground(Color.WHITE);
		g.setColor(Color.BLACK);
		
		g.drawLine(320,30,320,500);
		g.drawString("Y", 320, 20);
		g.drawString("Y", 320, 510);
		g.drawLine(20, 300, 600,300);
		g.drawString("X",610,300);
		g.drawString("X", 3, 300);
		g.drawString("CS190", 400, 50);
		g.setColor(Color.BLUE);
		
		/*double a = 0;
		int x = 300;
		int y = 300;
		int m = 3;
		/**
		for(int i = 0; i < 100; i++) { //y = mx substitute m to change coefficient of x;plotted without use of math functions of equations. Probably a bad method
			g.fillOval(x + (int) a, y - (int)(a*m), 3, 3)6;
			g.fillOval(x - (int)a, y + (int)(a*m), 3, 3);
			a++;
		}
		*/
		
		/*
		 for(double i = 0.1; i < 10; i = i + 0.1) { // y = mx^2
			g2d.fillOval(x +  (int) a * 5 , y - (int)(a * a), 10, 10);
			repaint();
			// g2d.fillOval(x - (int) a * 8, y + (int)(a * a), 3, 3); if you add this it become cubic
			g2d.fillOval(x - (int) a * 5 , y - (int)(a * a), 10, 10);
			repaint();
			//a = a + 0.1; if you add this you get a cool-looking parabola, with a * 8 and y + in second statement
			//a = a + 0.001; if looped to 100000 and this is done, a good parabola is seen? Check with the others
			a = a + 0.1;
		}
		 */
		
		//QuadCurve2D.Double curve = new QuadCurve2D.Double(200,200,300,400,400,200); //x^2
        //((Graphics2D)g).draw(curve);
        //QuadCurve2D.Double curve2 = new QuadCurve2D.Double(200,400,300,400,400,200);
        //((Graphics2D) g).draw(curve2);
		Scanner sc = new Scanner(System.in);
		
		
		
		/*double x,y;
		x = 0.0;
		y = Math.pow(x, 2.0);
		int x1,y1;
		int x2,y2;
		double delta = 0.1;
		double scale = 300.0;
		x1 = (int)(scale + x * scale);
		y1 = (int)(scale + y * scale);
		while(x < 0.8) {
			x2 = x1;
			y2 = y1;
			x += delta;
			y = -1*Math.pow(x, 2.0);
			x1 = (int)(scale + x * scale);
			y1 = (int)(scale + y * scale);
			g.drawLine(x1, y1, x2, y2);
		}
		x = 0.0;
		y = Math.pow(x, 2.0);

		delta = 0.1;
		scale = 300.0;
		x1 = (int)(scale + x * scale);
		y1 = (int)(scale + y * scale);
		while(x > -0.8) {
			x2 = x1;
			y2 = y1;
			x -= delta;
			y = -1*Math.pow(x, 2.0);
			x1 = (int)(scale + x * scale);
			y1 = (int)(scale + y * scale);
			g.drawLine(x1, y1, x2, y2);
		}//x^2 :)*/



		//x^3
        /*double x,y;
        x = 0.0;
        y = Math.pow(x, 3.0);
        int x1,y1;
        int x2,y2;
        double delta = 0.1;
        double scale = 300.0;
        x1 = (int)(scale + x * scale);
        y1 = (int)(scale + y * scale);
        while(x < 0.8) {
            x2 = x1;
            y2 = y1;
            x += delta;
            y = -1*Math.pow(x, 3.0);
            x1 = (int)(scale + x * scale);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }
        x = 0.0;
        y = Math.pow(x, 3.0);

        delta = 0.1;
        scale = 300.0;
        x1 = (int)(scale + x * scale);
        y1 = (int)(scale + y * scale);
        while(x > -0.8) {
            x2 = x1;
            y2 = y1;
            x -= delta;
            y = -1*Math.pow(x, 3.0);
            x1 = (int)(scale + x * scale);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }x^3 :)   */

        double x,y;
        x = -7;
        y = Math.exp(x);
        int x1,y1;
        int x2,y2;
        double delta = 0.1;
        double scale = 100.0;
        x1 = (int)(400 + x * scale);
        y1 = (int)(300 - y * scale);
        while(x < 6.1) {
            x2 = x1;
            y2 = y1;
            x += delta;
            y = Math.exp(x); //keep this positive if you want a grade
            x1 = (int)(400 + x * 100);
            y1 = (int)(300 - y * 100);
            g.drawLine(x1, y1, x2, y2);
        }

	}
}
