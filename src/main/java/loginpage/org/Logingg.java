package loginpage.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.java.BaseClass;

public class Logingg extends BaseClass {
	public void loginpage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement txtUsername;
@FindBy(id="pass")
private WebElement txtpassword;	
@FindBy(name="login")	
private WebElement btnlogin;
public WebElement getUsername() {
return txtUsername;

}
public WebElement getTxtpassword() {
	return txtpassword;

}
public WebElement getBtnlogin() {
return getBtnlogin();

}
}






