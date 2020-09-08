package constructorclass;

public class Son extends Father{
    public Son(String msg){
        super(msg);
    }
    public static void main(String args[]){
        Son f = new Son("hello");
    }
}
