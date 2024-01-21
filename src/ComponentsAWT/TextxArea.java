package ComponentsAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

public class TextxArea {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT TextArea Example");

        // Create a TextArea
        TextArea textArea = new TextArea("Let's get to writing in this textarea.", 5, 30);

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the TextArea to the Frame
        frame.add(textArea);

        // Set the size of the Frame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
