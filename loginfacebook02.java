package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfacebook02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\browserdriver\\chrome D\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("rajesh.prabha.376@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("1236547891");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		Thread.sleep(15000);
		driver.close();
	
	}

}
