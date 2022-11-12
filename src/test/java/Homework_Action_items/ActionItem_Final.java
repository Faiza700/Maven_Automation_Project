package Homework_Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionItem_Final {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.NewYorkLife.com");

        //Test#1 Click on 'My Account'
        driver.findElement(By.xpath("//*['/html/body/div[2]/div/div[1]/header/nav/div/div[2]/nav[3]/div[3]/a']")).click();
        Thread.sleep(3000);





    }
}
