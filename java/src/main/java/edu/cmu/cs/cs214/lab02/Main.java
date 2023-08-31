package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        final int height = 2;
        final int width = 3;
        Shape rectangle = new Rectangle(height, width);

        Renderer renderer = new Renderer(rectangle);

        renderer.draw();
    }
}
