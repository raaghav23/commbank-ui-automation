package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import org.testng.Assert;
import utils.WebDriverWrapper;

/*
@author : Raaghav
 */
public class TravelMoney extends LoadableComponent<TravelMoney> {

    @FindBy(css = "#products > div > div > div:nth-child(3) > div:nth-child(5) > div > a > div > div.card-header > h3 > p")
    WebElement headingOverseas;

    @FindBy(css = "#products > div > div > div:nth-child(3) > div:nth-child(5) > div > a > div > div.card-cta > p")
    WebElement tellmeMore;

	@FindBy(css = "body > div.app > div > div.sub-wrap > div.articlecaas > div.container.articlecaas_content > div.row > div.col.eight-col.bp3-twelve-col.bp3-last > div.bodyText.base.page.basicpage > div > div > div > p:nth-child(14) > a:nth-child(2)")
	WebElement netBank;


	@FindBy(css = "#txtMyClientNumber_label > span")
	WebElement username;


	@FindBy(css = "#txtMyPassword_label > span")
	WebElement password;




    private WebDriverWrapper wrapper;
    WebDriver driver = null;
    private int timeOutInSeconds = 20;
	String searchResults;


	public TravelMoney(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
        wrapper = new WebDriverWrapper(driver);
    }



	public void searchTellMeMore() {
		if (tellmeMore.isDisplayed()) {
			tellmeMore.click();
			wrapper.waitForElementToVisible(tellmeMore, timeOutInSeconds);

		} else {
			System.out.println(" Tell me more link not found" );
		}
	}

	public void searchNetBank() {
		if (netBank.isDisplayed()) {
			netBank.click();
		} else {
			System.out.println(" Net bank link not found" );
		}
	}

	public void searchNetBankUserDetails() {
		if (username.isDisplayed() && password.isDisplayed()) {
			System.out.println(" Net bank username/password field is found" );

		} else {
			System.out.println(" Net bank username/password field not found" );
		}
	}

	public void travelMoneyOverseas() {
		if (headingOverseas.isDisplayed()) {
		} else {
			System.out.println(" Heading overseas is not found" );
		}
	}


	@Override
	protected void load() {

	}

	@Override
	protected void isLoaded() throws Error {

	}
}
