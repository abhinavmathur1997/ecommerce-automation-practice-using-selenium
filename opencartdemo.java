package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class opencartdemo {
	public static void main(String[] args)
	{
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
		        driver.get("https://awesomeqa.com/ui/");
		        driver.findElement(By.xpath("//img[@title='MacBook']")).click();
		        driver.findElement(By.xpath("//input[@id='input-quantity']")).sendKeys("2");
		        driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		        driver.findElement(By.linkText("Write a review")).click();
		       		        driver.findElement(By.xpath("//a[normalize-space()='Specification']")).click();
		        driver.findElement(By.xpath("//li[2]//a[1]//img[1]")).click();
		      
	}

}
