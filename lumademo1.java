package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class lumademo1 {
    public static void main(String[] args)throws TimeoutException, UnexpectedTagNameException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        
       
        WebElement ele = driver.findElement(By.linkText("Hero Hoodie"));
        
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[4]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]")));
        
        
        addToCartButton.click();
        driver.findElement(By.xpath("//input[@id='qty']")).clear();
        driver.findElement(By.xpath("//input[@id='qty']")).sendKeys("2");
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-52']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-169']")).click();
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
       
        
        
    }
}
