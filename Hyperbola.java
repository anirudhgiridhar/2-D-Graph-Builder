import javax.swing.*;
import java.awt.*;

public class Hyperbola extends JPanel {
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
        g.drawString("HYPERBOLA", 400, 50);
        g.setColor(Color.BLUE);



        double x,y;
        y = 0.0;
        x = Math.pow(y,2);

        int x1,y1;
        int x2,y2;
        double delta = 0.1;
        double scale = 270.0;
        x1 = (int)(scale + x * scale);
        y1 = (int)(300 + y * 300);
        while(y < 0.6) {
            x2 = x1;
            y2 = y1;
            y += delta;
            x = -1*Math.pow(y, 2);
            x1 = (int)(scale + x * scale);
            y1 = (int)(300 + y * 300);
            g.drawLine(x1, y1, x2, y2);
        }
        y = 0.0;
        x = Math.pow(y,2);

        delta = 0.1;
        scale = 270.0;
        x1 = (int)(scale + x * scale);
        y1 = (int)(300 + y * 300);
        while(y > -0.6) {
            x2 = x1;
            y2 = y1;
            y -= delta;
            x = -1*Math.pow(y,2);
            x1 = (int)(scale + x * scale);
            y1 = (int)(300 + y * 300);
            g.drawLine(x1, y1, x2, y2);
        }




        y = 0.0;
        x = Math.pow(y,2);


         delta = 0.1;
         scale = 300.0;
        x1 = (int)(330 + x * 330);
        y1 = (int)(scale + y * scale);
        while(y < 0.6) {
            x2 = x1;
            y2 = y1;
            y += delta;
            x = Math.pow(y, 2);
            x1 = (int)(330 + x * 330);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }
        y = 0.0;
        x = Math.pow(y,2);

        delta = 0.1;
        scale = 300.0;
        x1 = (int)(330 + x * 330);
        y1 = (int)(scale + y * scale);
        while(y > -0.6) {
            x2 = x1;
            y2 = y1;
            y -= delta;
            x = Math.pow(y,2);
            x1 = (int)(330 + x * 330);
            y1 = (int)(scale + y * scale);
            g.drawLine(x1, y1, x2, y2);
        }



    }

    public static void main(String[] args) {
        Object arr[] = {"Make a Graph"};
        int a = JOptionPane.showOptionDialog(null,"What do you want to do?","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);

        if(a == 0){
            JFrame frame = new JFrame();
            frame.setSize(700,700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Hyperbola x = new Hyperbola();

            frame.add(x);
            frame.setVisible(true);
        }
    }
}
