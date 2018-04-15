import javax.swing.*;
import java.awt.*;

public class Ellipse extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        this.setBackground(Color.white);
        g.setColor(Color.BLACK);

        g.drawLine(320,30,320,500);
        g.drawString("Y", 320, 20);
        g.drawString("Y", 320, 510);
        g.drawLine(20, 300, 600,300);
        g.drawString("X",610,300);
        g.drawString("X", 3, 300);
        g.drawString("Ellipse", 400, 50);
        g.setColor(Color.BLUE);

        g.drawOval(171,199,300,200);
    }

    public static void main(String[] args) {
        Object arr[] = {"Make a Graph"};
        int a = JOptionPane.showOptionDialog(null,"What do you want to do?","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);

        if(a == 0){
            JFrame frame = new JFrame();
            frame.setSize(700,700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Ellipse x = new Ellipse();

            frame.add(x);
            frame.setVisible(true);
        }
    }
}
