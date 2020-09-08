package constructorclass;

public class Father {
    public Father(){
        System.out.println("调用了无参数的构造方法");
    }

    public Father(String msg){
        System.out.println("调用了有参数的构造函数：" + msg);
    }
    public static void main(String args[]){
        Father f1 = new Father();
        Father f2 = new Father("hello");
    }
    public void grandfather(String msg){
        System.out.println("world");
    }
}

