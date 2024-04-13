package org.orangehrm.pages;

import org.openqa.selenium.By;
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
     WebElement loginUsername;

    @FindBy(name = "password")
     WebElement loginPassword;

    @FindBy(css = "[type=submit]")
    WebElement loginButton;
    

    public void validLogin(String email, String password)
    {
        loginUsername.sendKeys(email);
        loginPassword.sendKeys(password);
        loginButton.click();
//        DashboardPage dashboardPage = new DashboardPage(driver);
//        return dashboardPage;
    }
    public void goToURL()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }






}
