package constructorclass;

public class Son2 {
    private String name;

    Son2(){
        System.out.println("我是2！");
    }

    Son2(String name){
        this();
        this.name = name;
    }

    public void say(){
        System.out.println("我是"+name);
    }

    public static void main(String[] args) {
        Son2 s = new Son2("3");
        s.say();
    }
}
