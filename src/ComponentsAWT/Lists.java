package ComponentsAWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Lists {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT List Example");

        // Create a List
        List pizzas = new List();
        pizzas.add("Domino's");
        pizzas.add("PizzaHut");
        pizzas.add("OvenStory");
        pizzas.add("Pizzeria");
        pizzas.add("LaPinoz");

        // Add ItemListener to handle list item selection changes
        pizzas.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String selectedOutlet = pizzas.getSelectedItem();
                System.out.println("Selected pizza outlet: " + selectedOutlet);
            }
        });

        // Set the layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add the List to the Frame
        frame.add(pizzas);

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
