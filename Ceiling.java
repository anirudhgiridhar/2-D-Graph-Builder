import javax.swing.*;
import java.awt.*;

public class Ceiling extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        g.drawLine(320, 30, 320, 500);
        g.drawString("Y", 320, 20);
        g.drawString("Y", 320, 510);
        g.drawLine(20, 300, 600, 300);
        g.drawString("X", 610, 300);
        g.drawString("X", 3, 300);
        g.drawString("Lowest Integer Function", 400, 50);
        g.setColor(Color.BLUE);

        int delta = -100;
        int x = 180;
        int y = 400;
        for (int i = 0; i <= 10; i++) {
            g.drawLine(x + delta, y - delta, x + delta + 40, y - delta);
            delta += 40;
        }
    }

    public static void main(String[] args) {
        Object arr[] = {"Make a Graph","FInd value","Find the domain","Find the range"};
        int a = JOptionPane.showOptionDialog(null,"What do you want to do?","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);

        if(a == 0){
            JFrame frame = new JFrame();
            frame.setSize(700,700);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            Ceiling x = new Ceiling();

            frame.add(x);
            frame.setVisible(true);
        }else if(a == 1){
            String s = JOptionPane.showInputDialog("Enter the x value");

            double x = Double.parseDouble(s);
            double value = Math.ceil((x));
            JOptionPane.showMessageDialog(null,"The lowest integer function of " + s + " is " + value);
        }else if(a == 2){
            JOptionPane.showMessageDialog(null,"Domain of this function is all real numbers");
        }else if(a == 3){
            JOptionPane.showMessageDialog(null,"Range of this function is all real numbers");
        }
    }
}
