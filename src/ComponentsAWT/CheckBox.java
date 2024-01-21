package ComponentsAWT;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Checkbox Example");

        // Create a Checkbox
        Checkbox javaCheckbox = new Checkbox("Java");

        // Add ItemListener to handle checkbox state changes
        javaCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Java Checkbox Selected: " + javaCheckbox.getState());
            }
        });

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the Checkbox to the Frame
        frame.add(javaCheckbox);

        // Set the size of the Frame and make it visible
        frame.setSize(200, 150);
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
