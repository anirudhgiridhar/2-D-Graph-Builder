import javax.swing.*;
import java.awt.*;

public class Raisedtothree extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        g.drawLine(300,30,300,500);
        g.drawString("Y", 300, 20);
        g.drawString("Y", 300, 510);
        g.drawLine(20, 300, 600,300);
        g.drawString("X",610,300);
        g.drawString("X", 3, 300);
        g.drawString("X^2", 400, 50);
        g.setColor(Color.BLUE);


        double x,y;
        x = 0.0;
        y = Math.pow(x, 3);
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
            y = -1*Math.pow(x, 3);
            x1 = (int)(scale + x * scale);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }
        x = 0.0;
        y = Math.pow(x, 3);

        delta = 0.1;
        scale = 300.0;
        x1 = (int)(scale + x * scale);
        y1 = (int)(scale + y * scale);
        while(x > -0.8) {
            x2 = x1;
            y2 = y1;
            x -= delta;
            y = -1*Math.pow(x, 3);
            x1 = (int)(scale + x * scale);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }

    }

    public static void main(String[] args) {
        Object arr[] = {"Make a Graph","FInd value"};
        int a = JOptionPane.showOptionDialog(null,"What do you want to do?","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);

        if(a == 0){
            JFrame frame = new JFrame();
            frame.setSize(700,700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Raisedtothree x = new Raisedtothree();

            frame.add(x);
            frame.setVisible(true);
        }else if(a == 1){
            String s = JOptionPane.showInputDialog("Enter the x value");

            double x = Double.parseDouble(s);
            double value = Math.pow(x,3);
            JOptionPane.showMessageDialog(null,"The function " + s + ", when raised to 3 is " + value);
        }
    }
}

