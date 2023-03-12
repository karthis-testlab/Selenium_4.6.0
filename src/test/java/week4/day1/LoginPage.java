package week4.day1;

public class LoginPage extends TestNGHooks {
	
	public LoginPage enterUser(String uName) {		
		type(getWebElement("id=user-name"), uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {		
		type(getWebElement("id=password"), pwd);
		return this;
	}
	
	public InventoryPage clickLogin() {		
		click(getWebElement("id=login-button"));
		return new InventoryPage();
	}
	
	public void clickLoginBtn() {		
		click(getWebElement("id=login-button"));
	}
	
	public LoginPage clickLoginNeg() {	
		click(getWebElement("id=login-button"));
		return this;
	}
	
	public LoginPage verifyErrorMsg() {
		String text = getText(getWebElement("xpath=//h3[@data-test='error']"));
		System.out.println(text);
		return this;
	}

}
