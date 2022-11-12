package Day6_100522;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //define  the web driver manager setup for character
        WebDriverManager.chromedriver();

        //initialize chrome options
        ChromeOptions options = new ChromeOptions();

        //add the options for maximizing the chrome setting
        options.addArguments("start-fullscreen");

        //define chrome driver to use for your test
        WebDriver driver = new ChromeDriver(options);

        //navigate to google site
        driver.navigate().to("https://www.yahoo.com");

        //wait few seconds
        Thread.sleep(3000);

        //using elements I want to click on a second link within group which is news
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(0).click();

    }//end of main
}
