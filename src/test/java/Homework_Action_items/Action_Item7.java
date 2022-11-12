package Homework_Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Action_Item7 {
    public static void main(String[] args) throws InterruptedException {
        //ArrayList for places
        ArrayList<String> places = new ArrayList<>();
        places.add("Florida");
        places.add("California");
        places.add("Hawaii");


        //define the web driver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //define the chrome driver to use for your test
        //creating an instance for a chrome driver(browser) to use for automation
        WebDriver driver = new ChromeDriver();

        for (int i = 0; i < places.size(); i++) {

            //navigate to the bing site
            driver.navigate().to("https://www.bing.com");

            //maximize my window
            //for Windows
            driver.manage().window().maximize();
            //for mac
            //driver.manage().window().fullscreen();

            //sleep statement
            Thread.sleep(3000);

            //search a keyword on the search field
            //relative xpath to locate the element
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(places.get(i));
            //hit submit on the bing search button
            driver.findElement(By.xpath("//*[@name='search']")).submit();

            //sleep statement
            Thread.sleep(3000);

            //capture the search result text
            String result = driver.findElement(By.xpath("//*[@class='ent-dtab-nam-w-thmb']")).getText();
            //split message to extract out the search number
            String[] splitResult = result.split(" ");
            System.out.println("the search result for " + places.get(i) + " is " + result);


            //quit the driver to end the session
        }
        driver.quit();


    }//end of class

}

