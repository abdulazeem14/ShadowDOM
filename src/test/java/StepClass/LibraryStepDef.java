package StepClass;

import PageObjects.LibraryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LibraryStepDef {
    public LibraryPage libraryPage;

    public LibraryStepDef(){
        libraryPage=new LibraryPage();
    }

    @When("^User Navigate to site$")
    public void UserNavigatetoSite(){
        libraryPage.NavigateToAppliction();
    }
    @And("^User Login to Application$")
    public void userLogin(){
    libraryPage.login();
    }
    @And("^User Switch to Classic view$")
    public void switchToClassicView(){
    libraryPage.switchtoClassicview();
    }

}
