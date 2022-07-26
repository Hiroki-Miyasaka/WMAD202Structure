package ca.ciccc.wmad.assignment8.question3;

//import ca.ciccc.wmad.assignment8.question2.ApplicationDriver;

abstract public class Shape {
    public Shape(ApplicationDriver.ShapeType type, int[] s1Sides) {
    }

    public Shape() {
    }

    abstract float perimeter();

    abstract float area();
}
