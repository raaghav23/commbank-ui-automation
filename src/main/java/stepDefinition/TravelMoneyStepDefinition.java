package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.TravelMoney;
import utils.BrowserFactory;
import utils.ConfigurationProperties;
import utils.PropertyReader;

/*
@author : Raaghav
 */
public class TravelMoneyStepDefinition {
    Scenario scenario;
    WebDriver driver = null;
    String suburb = "";
    TravelMoney travelMoney;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^User navigates to Commbank Homepage$")
    public void userNavigatesToCommbankHomepage() {
        driver = BrowserFactory.getDriver(PropertyReader.readConfig(ConfigurationProperties.BROWSER));
        String url = PropertyReader.readConfig(ConfigurationProperties.COMMBANK_BASE_URL);
        driver.get(url);
        travelMoney = new TravelMoney(driver);
    }

    @When("^Subtopics exists in section$")
    public void subtopicsExistsInSection() {
         travelMoney.searchTellMeMore();
    }

    @Then("^validate NetBank Details$")
    public void validateNetbankDetails() {
        travelMoney.searchNetBank();
    }

    @Then("^validate Netbank User Details$")
    public void validateNetbankUserDetails() {
        travelMoney.searchNetBankUserDetails();
    }

    @After
    public void after() {
    }



}
