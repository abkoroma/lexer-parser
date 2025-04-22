/*
Name: Abu Koroma
Date: 4/20/2025
Project: Project 1
Description: Text class with a constructor that accepts a color, point, and text string.
the draw method uses the graphics class to draw the string
 */


import java.awt.*;

public class Text extends Image {

    private String text;
    private Point points;

    public Text(Color color, Point point, String text) {
        super(color);
        this.points = point;
        this.text = text;
    }

    @Override
    void draw(Graphics graphics) {
        graphics.drawString(text, points.x, points.y);
    }
}
