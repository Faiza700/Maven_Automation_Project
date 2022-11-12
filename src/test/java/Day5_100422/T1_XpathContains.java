package Day5_100422;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_XpathContains {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();

        //define the web driver
        WebDriver driver = new ChromeDriver();

        //go to the yahoo home page
        driver.navigate().to ("https://www.yahoo.com");

        //maximize the driver
        driver.manage().window().maximize();

        //click on sign in button
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();

        //wait 2 seconds
        Thread.sleep(2000);

        //quit chrome
        driver.quit();



    }


}
