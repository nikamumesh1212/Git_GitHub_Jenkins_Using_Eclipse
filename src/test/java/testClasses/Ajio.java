package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
  @Test
  public void Testcase1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  driver.manage().window().maximize();
	  Reporter.log("Shopping on ajio", true);
	  driver.quit();
  }
}
