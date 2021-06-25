package prototypePattern.demo;

public class Square extends Shape{

    public Square(){
        type="square";

    }

    @Override
    void draw() {
        System.out.println("square:draw()");
    }
}
