package Day8_100722;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_TryCatch {
    public static void main(String[] args) throws InterruptedException {
        //type in new value for the start year
        WebDriver driver = null;
        try{
            WebElement startYear = driver.findElement(By.xpath("//*[@id = 'start_year']"));
            startYear.sendKeys("2024");
        } catch (Exception e) {
            System.out.println("Unable to select new value on Start year drop down.. " + e);
        }//end of start year exception

//click on calculate
        try{
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Calculate.. " + e);
        }//end of calculate exception

        Thread.sleep(3000);

//capture and print monthly payment
        try{
            String result = driver.findElements(By.xpath("//*[@class='left-cell']/h3")).get(0).getText();
            System.out.println("Monthly payment is " + result);
        } catch (Exception e) {
            System.out.println("Unable to capture monthly payment.. " + e);
        }//end of monthly payment exception

        //quit chrome
        driver.quit();


    }
}
