package ComponentsAWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Button Example");

        // Create a Button
        Button button = new Button("Click Me");

        // Set the button's position and size
        button.setBounds(100, 100, 80, 30);

        // Add an ActionListener to handle button clicks
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the frame size and layout
        frame.setSize(300, 200);
        frame.setLayout(null);

        // Make the frame visible
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}

