package test_jenkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_2 {
WebDriver driver=new FirefoxDriver();
	
	@Before
	public void setUp() throws Exception { 
		driver.get("https://www.google.com/");
	}
	
	@Test 
	public void basicTest() throws Exception { 
		driver.findElement(By.id("lst-ib")).sendKeys("jenkins");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
	
	}
	@After
	public void tearDown() throws Exception { 
		driver.quit();
	}
	
}


