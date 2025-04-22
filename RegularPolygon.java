/*
Name: Abu Koroma
Date: 4/20/2025
Project: Project 1
Description: Constructor accepts a points for center, radius, and number of sides
and calculates the x and y coordinates vertices for the polygon.
 */

import java.awt.*;

public class RegularPolygon extends SolidPolygon {

    public RegularPolygon(Color color, int numOfSides, Point center, int radius) {
        super(color, numOfSides);

        int[] x_points = new int[numOfSides];
        int[] y_points = new int[numOfSides];

        double angleIncrement = 2 * Math.PI / numOfSides;
        for (int i = 0; i < numOfSides; i++) {
            double angle = i * angleIncrement;
            x_points[i] = center.x + (int) (radius * Math.cos(angle)) ;
            y_points[i] = center.y + (int) (radius * Math.sin(angle));
        }
        createPolygon(x_points, y_points);
    }


}
