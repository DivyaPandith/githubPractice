package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopLoginPage {
	
	public DemoWebShopLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(id="FirstName")
	private WebElement firstNameTF;
	
	@FindBy(id="LastName")
	private WebElement lastNameTF;
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id="Password")
	private WebElement passwordTF;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTF;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(id="gender-male")
	private WebElement maleButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleButton;

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getConfirmPasswordTF() {
		return confirmPasswordTF;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getMaleButton() {
		return maleButton;
	}

	public WebElement getFemaleButton() {
		return femaleButton;
	}
	
	
}
