package prototypePattern.demo;

public class PrototypePatternTest {
    public static void main(String[] args) {

        ShapeCache.loidCache();

        Shape clone1=(Shape)ShapeCache.getShape("1");
        System.out.println("shape:"+clone1.getType());

        Shape clone2=(Shape)ShapeCache.getShape("2");
        System.out.println("shape:"+clone2.getType());
    }
}
