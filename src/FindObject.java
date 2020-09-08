

public class FindObject {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();

        programmer.name = "小明";
        programmer.sex = "男";
        programmer.age = 27;
        programmer.address = "北京";

        programmer.eat();
        programmer.sleep();
        programmer.code();
    }
}
