import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUIApp {
    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Swing GUI Example");

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Create a JLabel to display the button click count
        JLabel label = new JLabel("Button Clicked: 0");

        // Add the button and label to the frame
        frame.add(button);
        frame.add(label);

        // Set the layout manager to arrange components
        frame.setLayout(new java.awt.FlowLayout());

        // Add an ActionListener to the button
        int[] clickCount = { 0 }; // Array to store the click count
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;
                label.setText("Button Clicked: " + clickCount[0]);
            }
        });

        // Set the frame size and close operation
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
