package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PricesOfMobiles {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> prices=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		int sumofPrice=0;
		for(WebElement mprices:prices) {
			String text=mprices.getText();
			int price=Integer.parseInt(text.replace("₹", "").replace(",", ""));
			sumofPrice+=price;
		}
		System.out.println("Total price"+sumofPrice);
	}

}
