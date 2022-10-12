package PageObjects;

import Main.BaseWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LibraryPage extends BaseWebDriver {
    public LibraryPage(){
        driver=getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@id=\"existing\"]")
    WebElement lnkexistinguser;
    @FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
    private WebElement inputUsername;
    // signin password
    @FindBy(how = How.ID, using = "password")
    private WebElement textp_Password;
    // signin button
    @FindBy(how = How.XPATH, using = "//input[@class='login_button']")
    private WebElement signButton;
    @FindBy(xpath="//div[contains(@class,\"user-menu__UserMenuToggle\")]/i")
    WebElement lnkUserMenu;
    @FindBy(xpath="//a[@id=\"classic-view\"]")
    WebElement lnkSwitchToClassicView;

    public void NavigateToAppliction(){
        driver.get("https://www.google.co.in/");
        //driver.get("https://cust-pvh-dev.apps.dev.va.nuxeocloud.com/nuxeo/login.jsp?");
    }
    public void login(){
        lnkexistinguser.click();
        inputUsername.sendKeys("AzeemHameed");
        textp_Password.sendKeys("Azeem1406");
        signButton.click();
    }
    public void switchtoClassicview(){
            lnkUserMenu.click();
            lnkSwitchToClassicView.click();
    }


}
