package org.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(name = "username")
    private WebElement loginUsername;

    @FindBy(name = "password")
    private WebElement loginPassword;

    @FindBy(css = "button.orangehrm-login-button")
    private WebElement loginButton;
    

    public void validLogin(String email, String password)
    {
        loginUsername.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
    }
    public void goToURL()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }






}
