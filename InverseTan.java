import javax.swing.*;
import java.awt.*;

public class InverseTan extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        g.drawLine(320,30,320,600);
        g.drawString("Y", 320, 20);
        g.drawString("Y", 320, 610);
        g.drawLine(20, 300, 600,300);
        g.drawString("X",610,300);
        g.drawString("X", 3, 300);
        g.drawString("INVERSE TAN X", 400, 50);
        g.setColor(Color.BLUE);

        double x,y;
        y = 0.0;
        x = Math.tan(y);
        int x1,y1;
        int x2,y2;
        double delta = 0.1;
        double scale = 100.0;
        x1 = (int)(300 + x * scale);
        y1 = (int)(6 + y * scale);
        while(y < 6.1) {
            x2 = x1;
            y2 = y1;
            y += delta;
            x = -1 * Math.tan(y); //keep this positive if you want a grade
            x1 = (int)(300 + x * 100);
            y1 = (int)(6 + y * 100);
            g.drawLine(x1, y1, x2, y2);
        }


    }
    public static void main(String[] args) {
        Object arr[] = {"Make a Graph","FInd value","Find the domain","Find the range"};
        int a = JOptionPane.showOptionDialog(null,"What do you want to do?","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);

        if(a == 0){
            JFrame frame = new JFrame();
            frame.setSize(700,700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            InverseTan x = new InverseTan();

            frame.add(x);
            frame.setVisible(true);
        }else if(a == 1){
            String s = JOptionPane.showInputDialog("Enter the x value");

            double x = Double.parseDouble(s);
            double value = Math.atan((x));
            JOptionPane.showMessageDialog(null,"The arc tan of " + s + " is " + String.format("%.2f",Math.toDegrees(value)));
        }else if(a == 2){
            JOptionPane.showMessageDialog(null,"Domain of arctan is all real numbers");
        }else if(a == 3){
            JOptionPane.showMessageDialog(null,"Range of arctan is all real numbers except (2n + 1)* pi/2");
        }
    }
}