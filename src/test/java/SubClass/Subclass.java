package SubClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Subclass {
	public static WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		String pageurl="https://shopping.indiamart.com/";
		driver.get(pageurl);
		driver.manage().window().maximize();
		
	}

}
