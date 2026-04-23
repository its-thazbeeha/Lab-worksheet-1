package Q6;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JLabel label = new JLabel("Thazbeeha Abdul Majeeth", JLabel.CENTER);

        frame.add(label);
        frame.setSize(800, 600);
        frame.setTitle("Q6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}