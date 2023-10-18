package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
		@FindBy(id = "username")
		private WebElement usernameTextField;
		
		@FindBy(name="pwd")
		private WebElement passwaordTextField;
		
		@FindBy(xpath = "//div[text()='Login ']")
		private WebElement loginButton;
		
		public WebElement getUsernameTextField() {
			return usernameTextField;
			}

		public WebElement getPasswaordTextField() {
			return passwaordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		
	
}
