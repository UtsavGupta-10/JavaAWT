package ComponentsAWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Canvass extends Canvas {
    

	public void paint(Graphics g) {
        // Draw a rectangle on the canvas
        g.setColor(Color.blue);
        g.fillRect(50, 50, 100, 80);

        // Draw an oval on the canvas
        g.setColor(Color.red);
        g.fillOval(150, 50, 100, 80);
    }

    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("AWT Canvas Example");

        // Create a Canvas
        Canvass canvas = new Canvass();

        // Add the Canvas to the Frame
        frame.add(canvas);

        // Set the Frame size and make it visible
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
