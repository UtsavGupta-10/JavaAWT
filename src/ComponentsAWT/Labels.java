package ComponentsAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Labels {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Label Example");

        // Create a Label
        Label messageLabel = new Label("Hello, AWT!");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the Label to the Frame
        frame.add(messageLabel);

        // Set the size of the Frame and make it visible
        frame.setSize(200, 100);
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
