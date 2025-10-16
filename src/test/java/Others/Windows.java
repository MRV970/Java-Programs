package Others;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Windows {

	@Test
	public void multipleWindows() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=driver.getWindowHandle();
	WebElement multipleWid=	driver.findElement(By.id("newWindowsBtn"));
	Thread.sleep(1000);
	
	System.out.println("******************");
	multipleWid.click();

		Set<String> windows=driver.getWindowHandles();
		
		
		for(String wid:windows) {
			System.out.println(wid);
			
			Thread.sleep(2000);
			
			
				driver.switchTo().window(wid);
				String Url=driver.getCurrentUrl();
				System.out.println(Url);
				try {
				if(Url.contains("basic-controls")) {
					driver.findElement(By.id("dismiss-button")).click();
		WebElement Fname=	driver.findElement(By.id("firstName"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(Fname));
		Thread.sleep(3000);
		Fname.sendKeys("mrv");
			driver.findElement(By.id("lastName")).sendKeys("hjk");
			driver.findElement(By.id("femalerb")).click();
			driver.findElement(By.id("englishchbx")).click();
			driver.findElement(By.id("email")).sendKeys("mrv@gmail");
			driver.findElement(By.id("password")).sendKeys("asdfg2345");
			driver.findElement(By.id("registerbtn")).click();
			
			System.out.println("12345678");
			
		}
				}
				catch (Exception e){
					System.out.println("Exception handled");
				}
				
		
			//driver.close();
		
		}
		
		
		
	}
	@Test
	public void frames() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");

		WebDriver rootFrame = driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]")));
		WebElement email=driver.findElement(By.xpath("//div[@class='form_container']//p[text()='Admin@gmail.com']"));
		WebElement pwd=driver.findElement(By.xpath("(//div[@class='form_container']//p[text()='Admin@1234'])[1]"));
		WebElement cpwd=driver.findElement(By.xpath("(//div[@class='form_container']//p[text()='Admin@1234'])[2]"));
		String e=email.getText();
		String p=pwd.getText();
		String cp=cpwd.getText();
		//switch to child
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(e);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(p);
		
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(cp);
		
		
	}
	@Test
	public void NestedFrames() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
      Thread.sleep(3000);

		driver.switchTo().frame(0);
		System.out.println("switching to frame");
		
	   String email=driver.findElement(By.xpath("//div[@class='form_container']//p[text()='Admin@gmail.com']")).getText();
	   String pwd=driver.findElement(By.xpath("//div[@class='form_container']//p[text()='Admin@1234']")).getText();
	   String cp=driver.findElement(By.xpath("(//div[@class='form_container']//p[text()='Admin@1234'])[2]")).getText();
		//switch to child
//	   Thread.sleep(3000);
	   driver.switchTo().frame(0);
	   driver.switchTo().frame(0);
	//   Thread.sleep(5000);
	   System.out.println("switching");
	   driver.findElement(By.id("email")).sendKeys(email);
	//   Thread.sleep(2000);
	   //switch back to parent
	   driver.switchTo().parentFrame();
	   //switch to child2
	//   Thread.sleep(1000);
	   driver.switchTo().frame(1);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	   //switch to parent
	   driver.switchTo().parentFrame();
	   //switch to child3
	   driver.switchTo().frame(2);
	   driver.findElement(By.id("confirm")).sendKeys(cp);
	   //switch back to inner frame
	   driver.switchTo().parentFrame();
	   //switch to child 4
	   driver.switchTo().frame(3);
	   driver.findElement(By.id("submitButton")).click();
	   
	   
	   
	}
}
