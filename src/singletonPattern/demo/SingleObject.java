package singletonPattern.demo;

public class SingleObject {

    //创建 SingleObject 的一个对象
    private static SingleObject instanse=new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instanse;
    }

    public void showMassage(){
        System.out.println("hello");
    }
}
