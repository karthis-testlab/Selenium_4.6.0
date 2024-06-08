package week2.day1.pages.factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "")
	private List<WebElement> allElements;
	
	@FindBy(id = "user-name") //diver.findElement(By.id("user-name"))
	private WebElement eleUserName;
	
	@FindBy(id = "password")
	private WebElement elePassword;
	
	@FindBy(id = "login-button")
	private WebElement eleLoginBtn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUser(String uName) {
		eleUserName.sendKeys(uName);
		System.out.println(allElements.size());
		for (WebElement element : allElements) {
			
		}
	}
	
	public void enterPassword(String pwd) {
		elePassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		eleLoginBtn.click();
	}

}
