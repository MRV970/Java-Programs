package Others;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class taking {
	@Test
	public void getData() throws IOException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://meet.google.com/qkk-tdkv-svo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst= new File("./test-output/text.png");
		org.openqa.selenium.io.FileHandler.copy(src, dst);
		driver.quit();
	}

}
