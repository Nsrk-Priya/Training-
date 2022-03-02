package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteWorktype {

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
        driver.findElement(By.xpath("//a[@title='Delete']")).click();
        driver.findElement(By.xpath("(//span[@class=' label bBody'])[4]")).click();
        String message = driver.findElement(By.xpath("//div//span[contains(@class, 'toastMessage')]")).getText();
        System.out.println(message);
		

	}
}

