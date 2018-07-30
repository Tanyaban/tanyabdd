package Runner;

 
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	class Runner1 {
		WebDriver driver;
		  @Test
		  public void test() throws InterruptedException {
			  driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
			  //Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
			  //Thread.sleep(5000);
			  driver.findElement(By.xpath("//*[@type='submit']")).click();
			  Thread.sleep(5000);
		  }
		  @BeforeTest
		  public void beforeTest() throws InterruptedException {
			  System.setProperty("webdriver.gecko.driver","E:\\gecko\\geckodriver.exe");
			  driver=new FirefoxDriver();
			  driver.get("http://ec2-18-191-84-26.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
			  //sThread.sleep(5000);
		  }

		  @AfterTest
		  public void afterTest() {
			 
			 System.out.println("Running");
			 //driver.close();
		  
	}

}
