package pack1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class DrawingWindow extends JFrame {
    private ArrayList<Object> shapes;

    public DrawingWindow() {
        super("Drawing Window");

        shapes = new ArrayList<Object>();
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
        repaint();
    }

    public void addShape(Object o) {
        shapes.add(o);
        repaint();
    }

    public void clear() {
        shapes.clear();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);

        for (Object o : shapes) {
            if (o instanceof DrawingLine) {
                DrawingLine line = (DrawingLine) o;

                g.setColor(line.getColorL());
                g.drawLine(line.getX1(), line.getY1(), line.getX2(), line.getY2());

            } else if (o instanceof DrawingOval) {
                DrawingOval oval = (DrawingOval) o;

                g.setColor(oval.getColorO());
                g.drawOval(oval.getX(), oval.getY(), oval.getWidth(), oval.getHeight());

            } else if (o instanceof DrawingRectangle) {
                DrawingRectangle rect = (DrawingRectangle) o;

                g.setColor(rect.getColorR());
                g.fillRect(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight());


            }
        }
    }
}