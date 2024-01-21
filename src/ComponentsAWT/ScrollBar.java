package ComponentsAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Scrollbar Example");

        // Create a Label
        Label label = new Label("Adjust the ScrollBar:");

        // Create a Scrollbar with parameters for orientation, initial value, visible amount, minimum, and maximum
        Scrollbar scrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 100);

        // Add AdjustmentListener to handle scrollbar adjustments
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = scrollbar.getValue();
                System.out.println("Scrollbar Value: " + value);
            }
        });

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add components to the Frame
        frame.add(label);
        frame.add(scrollbar);

        // Set the size of the Frame and make it visible
        frame.setSize(250, 150);
        frame.setVisible(true);

        // Handle closing the frame
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
