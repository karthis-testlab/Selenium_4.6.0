package week4.day1;

public class LoginPage extends SeleniumBase {
	
	public LoginPage enterUser(String uName) {		
		type(getWebElement(ReadProperties.getObject("LoginPage", "loginpage.username.txt")), uName);
		return this;
	}
	
	public LoginPage enterPassword(String pwd) {		
		type(getWebElement(ReadProperties.getObject("LoginPage", "loginpage.password.txt")), pwd);
		return this;
	}
	
	public InventoryPage clickLogin() {
		click(getWebElement(ReadProperties.getObject("LoginPage", "loginpage.login.btn")));
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
