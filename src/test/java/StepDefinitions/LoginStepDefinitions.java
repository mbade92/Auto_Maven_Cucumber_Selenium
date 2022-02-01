package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinitions {

    WebDriver driver;

    @Given("^User navigates to the site$")
    public void openingUrl() {
        System.setProperty("webdriver.chrome.driver", "/Users/manojkumarbade/IdeaProjects/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^User enters valid username and password$")
    public void ValidLogin() {

        WebElement logo = driver.findElement(By.className("login_logo"));
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(logo));

        WebElement usrname = driver.findElement(By.id("user-name"));
        usrname.sendKeys("standard_user");

        WebElement pswd = driver.findElement(By.xpath("//div[@id='login_button_container']/div/form/div[2]/input[@name='password']"));
        pswd.sendKeys("secret_sauce");

    }

    @When("^User clicks submit$")
    public void clickSubmit(){
        WebElement lgn_button = driver.findElement(By.id("login-button"));
        lgn_button.click();
    }

    @Then("^User logs in successfully$")
    public void LoginTitle(){

        WebElement menu_button = driver.findElement(By.id("react-burger-menu-btn"));
        menu_button.isDisplayed();
        driver.quit();
    }


}
