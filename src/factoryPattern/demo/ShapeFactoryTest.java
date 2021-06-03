package factoryPattern.demo;

public class ShapeFactoryTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();

        //获取对象，调用方法
        Shape s1=shapeFactory.getShape("CIRCLE");
        s1.draw();

        Shape s2=shapeFactory.getShape("RECTANGLE");
        s2.draw();

        Shape s3=shapeFactory.getShape("SQUARE");
        s3.draw();


        Shape s=shapeFactory.getShape("");



    }
}
