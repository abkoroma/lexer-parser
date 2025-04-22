/*
Name: Abu Koroma
Date: 4/20/2025
Project: Project 1
Description: SolidPolygon class accepts a color and number of vertices to draw a polygon
using the fillPolygon method from the Graphics class
 */

import java.awt.*;

public class SolidPolygon extends Polygon_ {

    private int[] xPoints;
    private int[] yPoints;

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.fillPolygon(polygon);
    }

}
