package javabase;

public class Customer {
    String id;
    String name;
    int age;
    String sex;
    String phone;
    String addr;
    public Customer(){

    }
    public Customer(String id,String name,int age,String sex,String phone,String addr){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.addr = addr;
    }
}
