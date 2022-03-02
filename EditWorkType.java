package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditWorkType {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--disable-notifications");
	    ChromeDriver driver = new ChromeDriver(option);
	    driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.className("slds-icon-waffle")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        WebElement find = driver.findElement(By.xpath("//p[text()='Work Types']"));
        driver.executeScript("arguments[0].scrollIntoView();", find);
        find.click();
        driver.findElement(By.xpath("(//a[@role='button']/span/span)[1]")).click();
        Thread.sleep(3000);
        
        WebElement editButton = driver.findElement(By.xpath("(//div[text()='Edit'])[1]"));
        driver.executeScript("arguments[0].click();", editButton);
        driver.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[4]")).sendKeys("9");
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
      //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Timeframe End'])[2]/following::input")));
        driver.findElement(By.xpath("//span[text()='Timeframe End']//following::input")).sendKeys("18");
       // driver.findElement(By.xpath("(//span[@class=' label bBody'])[5]")).click();
        driver.findElement(By.xpath("//button[@title='Save']")).click();
        Thread.sleep(1000);
       String successMsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]")).getText();
       System.out.println("Success Message Displayed is ---"+successMsg);
	}

}
