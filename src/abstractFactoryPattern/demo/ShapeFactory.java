package abstractFactoryPattern.demo;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeTyoe) {
        if(shapeTyoe == null){
            return null;
        }

        if(shapeTyoe.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapeTyoe.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeTyoe.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }


}
