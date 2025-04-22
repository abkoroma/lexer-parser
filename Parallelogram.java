/*
Name: Abu Koroma
Date: 4/20/2025
Project: Project 1
Description: Calculates the x and y coordinates for all four vertices of a
parallelogram
 */

import java.awt.*;

public class Parallelogram extends SolidPolygon {

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset) {
        super(color, 4);
        int[] x_points = {upperLeft.x, lowerRight.x, lowerRight.x + xOffset, upperLeft.x + xOffset};
        int[] y_points = {upperLeft.y, upperLeft.y, lowerRight.y, lowerRight.y};
        createPolygon(x_points, y_points);
    }
}
