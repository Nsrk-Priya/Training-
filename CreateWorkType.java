package SalesForce;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {

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
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        WebElement find = driver.findElement(By.xpath("//p[text()='Work Types']"));
	        driver.executeScript("arguments[0].scrollIntoView();", find);
	        find.click();
	        driver.findElement(By.className("forceActionLink")).click();
	        driver.findElement(By.xpath("//input[@class=' input']")).sendKeys("Salesforce Project");
	        driver.findElement(By.xpath("//textarea[@class=' textarea']")).sendKeys("Specimen");
	        driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).sendKeys("UK Shift");
	        driver.findElement(By.xpath("//span[@title='New Operating Hours']")).click();
	        driver.findElement(By.xpath("(//input[@class=' input'])[2]")).sendKeys("UK Shift");
	        driver.findElement(By.xpath("(//button[@title='Save'])[2]")).click();
	        driver.findElement(By.xpath("(//input[@class='input uiInputSmartNumber'])[1]")).sendKeys("7");
	        driver.findElement(By.xpath(" (//span[@class=' label bBody'])[5]")).click();
	        
	      
	       
	        
	      


		    
		
			
	    
	        
	}
}


