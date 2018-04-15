import javax.swing.*;

public class Math2dGrapher {
    public static void main(String[] args) {

        String s = "Please enter the function id to plot that function:\n1.sin x\n2.cos x\n3.tan x\n4.arcsin x\n5.arccos x\n6.arctan x\n7.e^x\n8.log x\n9.Greatest Integer Function\n10.Lowest Integer Function\n11.X^2\n12.ellipse\n13.circle\n14.hyperbola\n15.X^3\n16.Exit";
        //Object[] arr = {"sin x","cos x","tan x","arcsin x","arccos x","arctan x","e^x","log x","ln x","Greatest Integer Function","Lowest Integer Function","n-degree polynomial","ellipse","circle","hyperbola"};
        //int a = JOptionPane.showOptionDialog(null,"Choose the function whihc you want to plot!","Maths",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,arr,arr[0]);
        while(true) {
            String input = JOptionPane.showInputDialog(s);
            int option = 0;
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Thank you for using the Math Grapher!!");
            }

        /*JFrame frame = new JFrame("Math");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700,700);*/

            if (option == 1) {
                Sine x = new Sine();
                x.main(null);
            } else if (option == 2) {
                Cos x = new Cos();
                x.main(null);
            } else if (option == 3) {
                Tan x = new Tan();
                x.main(null);
            } else if (option == 4) {
                InverseSin x = new InverseSin();
                x.main(null);
            } else if (option == 5) {
                InverseCos x = new InverseCos();
                x.main(null);
            } else if (option == 6) {
                InverseTan x = new InverseTan();
                x.main(null);
            } else if (option == 7) {
                exp x = new exp();
                x.main(null);
            } else if (option == 8) {
                logxx x = new logxx();
                x.main(null);
            } else if (option == 9) {
                GreatestIntegerFunction x = new GreatestIntegerFunction();
                x.main(null);
            } else if (option == 10) {
                Ceiling x = new Ceiling();
                x.main(null);
            } else if (option == 11) {
                Parabola x = new Parabola();
                x.main(null);
            } else if (option == 12) {
                Ellipse x = new Ellipse();
                x.main(null);
            } else if (option == 13) {
                Circle x = new Circle();
                x.main(null);
            } else if (option == 14) {
                Hyperbola x = new Hyperbola();
                x.main(null);
            } else if (option == 15) {
                Raisedtothree x = new Raisedtothree();
                x.main(null);
            } else if (option == 16) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Thank you for using the Math Grapher!!");
                break;
            }
        }


    }
}
