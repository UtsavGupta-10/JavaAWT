package ComponentsAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class TextxField {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT TextField Example");

        // Create a TextField
        TextField textField = new TextField("Write Here!");

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the TextField to the Frame
        frame.add(textField);

        // Set the size of the Frame and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
