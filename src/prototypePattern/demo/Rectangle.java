package prototypePattern.demo;

public class Rectangle extends Shape{

    public Rectangle(){
        type="rectangle";

    }

    @Override
    void draw() {
        System.out.println("Rectangle:draw()");
    }
}
