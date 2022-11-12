package Homework_Action_items;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class ActionItem_9 {
    public static void main(String[] args) throws InterruptedException {
        //Setup your chromedriver with web driver manager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the Chrome window
        options.addArguments("start-maximized");
        //options.addArguments("headless");
        //for mac use "start-fullscreen"
        //go to google page
        WebDriver driver = new ChromeDriver(options);
        //driver.navigate().to("https://www.Hotels.com");


        ArrayList<String> destination = new ArrayList<>();
        destination.add("Miami");
        destination.add("New York");
        destination.add("Hawaii");

        ArrayList<Integer> Adultage = new ArrayList<>();
        Adultage.add(2);
        Adultage.add(3);
        Adultage.add(2);
        for (int i = 0; i < destination.size(); i++) {
            driver.navigate().to("https://www.Hotels.com");
            Thread.sleep(2000);
            //click on going to tab
            driver.findElement(By.xpath("//*[@aria-label='Going to']")).click();
            Thread.sleep(2000);


            WebElement search = driver.findElement(By.xpath("//*[@placeholder='Going to']"));
            search.sendKeys(destination.get(i));
            Thread.sleep(1000);

            //Select destination from drop down
            driver.findElements(By.xpath("//*[@class='truncate']")).get(0).click();


            //click TRAVELERS, then ADULT LIST TO SET BACK TO ONE
            driver.findElement(By.xpath("//*[contains(@class, 'uitk-menu-trigger uitk')]")).click();
            Thread.sleep(2000);


            //set adults amount to '1'
            driver.findElement(By.xpath("//*[@class= 'uitk-step-input-button']")).click();
            //clicking done on travelers tab
            Thread.sleep(3000);
            for (int A = 0; A < Adultage.size(); A++) {
                // driver.findElement(By.xpath("//*[@class=uitk-step-input-label")).click();
                driver.findElement(By.xpath("//*[@aria-label='Increase the number of adults in room 1']")).click();
            }
            driver.findElement(By.xpath("//*[@aria-label= 'Increase the number of children in room 1']")).click();
            Thread.sleep(2000);

            try {
                //age
                driver.findElement(By.xpath("//*[@id=age-traveler_selector_children_age_selector-0-0")).click();

            } catch (Exception e) {
                System.out.println();


            }//end of loop
            Thread.sleep(3000);
            WebElement childAge = driver.findElement(By.xpath("//*[@id= 'age-traveler_selector_children_age_selector-0-0']"));
            Select childAgeDropDown = new Select(childAge);
            childAgeDropDown.selectByVisibleText("2");
            Thread.sleep(3000);

            driver.findElement(By.xpath("//*[@id='traveler_selector_done_button']"));
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id='submit_button']")).click();
            driver.findElements(By.xpath("//*[@class='uitk-card-link']")).get(1).click();
            Thread.sleep(2000);
            WebElement reserveB = driver.findElements(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-primary']")).get(0);
            ArrayList<WebElement> Links = new ArrayList<>(driver.findElements(By.xpath("//*[@data-stid=open-hotel-information]")));
            if (i == 0) {
                Links.get(1).click();
                if (i == 1) {
                    Links.get(2).click();
                    Thread.sleep(2000);
                    if (i == 2) {
                        //for the third zipcode it should click the first studio link
                        Links.get(0).click();
                        Thread.sleep(2000);

                    }

                }
                //ArrayList<String> newTab = new ArrayList<>(driver.getWindowHandles());
                //driver.switchTo().window(newTab.get(1));
                //text()='Reserve'.click

                //jes.executeScript("arguments[0].scrollIntoView(true);", reserveB);


                //click on travelers button
                //driver.findElement(By.xpath("//*@class= 'uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']"));


            }// edn of main
        }// end of java class
    }
}



