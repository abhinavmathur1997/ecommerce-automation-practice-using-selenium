package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lumademo2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://magento.softwaretestingboard.com/");
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            
   
            WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id='ui-id-6'] span:nth-child(2)")));
            
            selectElement.click(); 
        } catch (TimeoutException e) {
            System.out.println("Element not found within the specified time.");
        }
        driver.findElement(By.linkText("Create an Account")).click();
       driver.findElement(By.linkText("Men")).click();
    }
}
