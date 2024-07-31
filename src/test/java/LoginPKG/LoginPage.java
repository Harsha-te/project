package LoginPKG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='hdr_gbe ml10']")
WebElement  BulkOrder;
	@FindBy(xpath="//div[@aria-label='1 / 17']")
	WebElement brands;

	@FindBy(xpath="//span[normalize-space()='Mobile Accessories']")	
	WebElement MobileACCESS;


@FindBy(xpath="//input[@id='search_string1']")
WebElement searchbar;

@FindBy(xpath="//a[@id='prd_name_pdp_0']")
WebElement product;

@FindBy(xpath="(//li[normalize-space()='Price - Low to High'])[1]")
WebElement pricelowtohigh;

@FindBy(xpath="//span[@id='bn_cta_5']")
WebElement buynow;

@FindBy(xpath="//a[@id='prd_name_pdp_3']")
	WebElement kurthi;

@FindBy(xpath="//input[@id='value']")
WebElement quantity;

@FindBy(xpath="//a[@id='prd_name_pdp_2']")
WebElement pen;
@FindBy(xpath="//li[normalize-space()='Price - High to Low']")
WebElement black;
@FindBy(xpath="//a[@href='search.php?ss=Colored+Pen']")
WebElement coloured;

		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		}
	public void  selectitem()
	{
		BulkOrder.click();
		brands.click();
	}
		public void  SendEnquaries()
		{
			searchbar.sendKeys("iphone 15 promax");
			searchbar.submit();
			product.click();
			 quantity.sendKeys("2");
			
	
			 searchbar.sendKeys("lady wear");
			 searchbar.submit();
			 kurthi.click();
		
		
		}
	public void verify()
	{
		searchbar.sendKeys("mobile chargers");
		searchbar.submit();
		pricelowtohigh.click();
		buynow.click();
	}
	public void  nextslide()
	{
		searchbar.sendKeys("fountain pens");
		searchbar.submit();
		pen.click();
		black.click();
		coloured.click();
	}
}
