package TecGurus.TestFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends BaseBrowse {
	protected WebDriver driver;
	protected BasePage()
	{
		InitBrowse();
		PageFactory.initElements(driver, this);
	}
	
	private void InitBrowse()
	{
		driver=SetUpDriver("Chrome");
	}
}
