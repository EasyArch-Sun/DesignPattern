package prototypePattern.demo;

import java.util.Hashtable;

public class ShapeCache {

    public static Hashtable<String, Shape> shapeMap
            =new Hashtable<String, Shape>();


    public static Shape getShape(String shapeId){
        Shape cacheShape=shapeMap.get(shapeId);
        return (Shape)cacheShape;
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loidCache(){

        Circle c=new Circle();
        c.setId("1");
        shapeMap.put(c.getId(),c);

        Square s=new Square();
        s.setId("2");
        shapeMap.put(s.getId(),s);


    }


}
