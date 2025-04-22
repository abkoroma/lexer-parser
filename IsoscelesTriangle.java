/*
Name: Abu Koroma
Date: 4/20/2025
Project: Project 1
Description: Takes in a vertex, height, width and allocates the x and y coordinates for
an Isosceles triangle
 */

import java.awt.*;

public class IsoscelesTriangle extends SolidPolygon {

    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color, 3);
        int[] x_points = {topVertex.x, topVertex.x - (width / 2), topVertex.x + (width / 2)};
        int[] y_points = {topVertex.y, topVertex.y + height, topVertex.y + height};
        createPolygon(x_points, y_points);
    }

}
