package javaAbstraction;

import java.util.Objects;

public class Rectangle extends GraphicObject {

    private int width;
    private int height;

    // Constructor for Rectangle
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Implementation of the draw method for a rectangle
    @Override
    void draw() {
        System.out.println("Drawing a rectangle at coordinates (" + x + ", " + y + ") with width: " + width + " and height: " + height);
        // Add specific drawing logic here, like using a graphics library or API
    }

    // Implementation of the resize method for a rectangle
    @Override
    void resize() {
        // You can provide new width and height for resizing
        int newWidth = width * 2; // Example: doubling the width
        int newHeight = height * 2; // Example: doubling the height
        System.out.println("Resizing the rectangle to new width: " + newWidth + " and new height: " + newHeight);
        // Add specific resizing logic here, like updating the size of the rectangle
        this.width = newWidth;
        this.height = newHeight;
    }

    // Method to calculate the area of the rectangle
    public int area() {
        return width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width &&
                height == rectangle.height &&
                x == rectangle.x &&
                y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, x, y);
    }

    @Override
    public String toString() {
        return "Rectangle{"+"width="+width+", height="+height+", x="+x+", y="+y+'}';
    }
}
