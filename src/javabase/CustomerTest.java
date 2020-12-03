package javabase;
import java.util.Scanner;
public class CustomerTest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String str3 = scn.nextLine();

        String[] spit1 = str1.split(",");
        String[] spit2 = str2.split(",");
        String[] spit3 = str3.split(",");

        Customer c1 = new Customer(spit1[0],spit1[1],Integer.parseInt(spit1[2]),spit1[3],spit1[4],spit1[5]);
        Customer c2 = new Customer(spit2[0],spit2[1],Integer.parseInt(spit2[2]),spit2[3],spit2[4],spit2[5]);
        Customer c3 = new Customer(spit3[0],spit3[1],Integer.parseInt(spit3[2]),spit3[3],spit3[4],spit3[5]);

        Customer[] cs = new Customer[]{c1,c2,c3};
        System.out.println(cs);
        int avg = (c1.age+c2.age+c3.age)/3;
        int maxage = c1.age;
        for(int i=0;i<3;i++){
            if(cs[i].age > maxage){
                maxage = cs[i].age;
            }
        }
        System.out.println(avg);
        System.out.println(maxage);

    }
}
