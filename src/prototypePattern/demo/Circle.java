package prototypePattern.demo;

public class Circle extends Shape{

    public Circle(){
        type="circle";

    }

    @Override
    void draw() {
        System.out.println("circle:draw()");
    }
}
