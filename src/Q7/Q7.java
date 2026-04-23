package Q7;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Q7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel name = new JLabel("Thazbeeha Abdul Majeeth");
        JLabel regNo = new JLabel("CT2022068"); // replace with your ID

        panel.add(name);
        panel.add(regNo);

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setTitle("Q7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}