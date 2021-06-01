package singletonPattern.demo;

public class SingleObjectTest {

    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject o1=new SingleObject();

        //获取唯一可用的对象
        SingleObject object=SingleObject.getInstance();

        //显示消息
        object.showMassage();
    }
}
