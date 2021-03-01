package javaBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;
import java.util.*;
import java.io.*;

public class Itest {

    public static void main(String[] args) throws Exception{

        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        driver.get("https://www.biaoshitong.com/index");

        try {
            Thread.sleep(30000);
        }catch (InterruptedException ex){
            System.out.println("出现异常");
        }
        driver.manage().window().maximize();
        WebElement login_btn = driver.findElement(By.xpath("//span[text()='登录']"));
        login_btn.click();

        Thread.sleep(1000);

        WebElement phone_input = driver.findElement
                (By.cssSelector("div.login-wrap div.password_login input[placeholder='请输入手机号']"));
        phone_input.sendKeys("18819206858");
        WebElement pwd_input = driver.findElement
                (By.cssSelector("div.login-wrap div.password_login input[placeholder=\"请输入密码\"]"));
        pwd_input.sendKeys("123456");
        WebElement login_submit = driver.findElement
                (By.cssSelector("div.login-wrap div.password_login div.login-btn>div>button>span"));
        login_submit.click();

        char c= (char)System.in.read();
        System.out.println(c);

//        Thread.sleep(20000);

        WebElement formation_query = driver.findElement(By.cssSelector("div.nav span.el-dropdown-link"));
        formation_query.click();
        Thread.sleep(2000);

        WebElement kw_input = driver.findElement(By.cssSelector("input[placeholder=\"请输入项目关键词\"]"));
        kw_input.sendKeys("工程");

        WebElement kw_queyr_btn = driver.findElement(By.xpath("//span[text()='搜索']"));
        kw_queyr_btn.click();


    }
}
