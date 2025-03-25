package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class opencartdemo1 {
    public static void main(String[] args) throws TimeoutException, InterruptedException, NoSuchElementException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/ui/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']//img[@alt='iPhone 6']"))).click();
        
        driver.findElement(By.name("search")).sendKeys("Mac");
        driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
        
 
               
        WebElement selectElement = driver.findElement(By.name("category_id"));
        Select select = new Select(selectElement);
        select.selectByValue("27");
        driver.findElement(By.id("button-search")).click();
       
    }
}
