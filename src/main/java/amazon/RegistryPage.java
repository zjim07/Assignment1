package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {
   static final String URL = "https://www.amazon.com/registries?ref_=nav_cs_registry";

    // Test 1
    @FindBy(xpath = "(//input[@placeholder='Search by Registrant name'])")
    public WebElement registryNameSearchBox;

    //Test 2
    @FindBy(xpath = "(//span[@class='a-dropdown-prompt'])")
    public WebElement registryDropdownBox;

    //Test 3
    @FindBy(xpath = "(//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit'])")
    public WebElement registrySearchButton;

    //Test 4
    @FindBy(xpath = "//*[@id=\"a-page\"]/div[3]/div/div/div/div[2]/div/a[1]/div")
    public WebElement registryWeddingSearchButton;
    //@FindBy (xpath = "(//input [@class='wedding-find-stripe__input']")
   // public WebElement registryWeddingSearchField;
    //@FindBy (xpath = "(//div[@class='wedding-arrow']")
   // public WebElement registryArrowButton;
   // @FindBy (xpath = "('//div[@id='search-results-container']")
    //public WebElement registryListOfNames;

    //Test 5
    @FindBy(xpath = "//div[@class='gr-header gr-header--xxsm gr-find-stripe__header aok-inline-block']")
    public WebElement registryHeader;

    public RegistryPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}


















