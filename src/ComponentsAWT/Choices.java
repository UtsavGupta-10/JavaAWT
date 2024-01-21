package ComponentsAWT;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Choices {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Choice Example");

        // Create a Label
        Label label = new Label("Select a Burger Joint:");

        // Create a Choice
        Choice Burger = new Choice();
        Burger.add("Burger King");
        Burger.add("Wendy's");
        Burger.add("Mcdonald's");
        Burger.add("KFC");
        Burger.add("JollyBee");

        // Add ItemListener to handle choice selection changes
        Burger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String selectedBurger = Burger.getSelectedItem();
                System.out.println("Selected Burger Joints: " + selectedBurger);
            }
        });

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add components to the Frame
        frame.add(label);
        frame.add(Burger);

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
