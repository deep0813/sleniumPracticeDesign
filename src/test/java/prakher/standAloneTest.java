package prakher;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class standAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/auth/login");
		String email= "prakherdeep10@gmail.com";
		String password="Prakher@123";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		List <WebElement> products=	driver.findElements(By.cssSelector(".mb-3"));
		WebElement prod =products.stream().filter(product-> product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".btn w-10.rounded")).click();
		
		
	}

}
