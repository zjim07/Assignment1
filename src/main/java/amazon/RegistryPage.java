package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistryPage extends BasePage {
    static final String URL=" https://www.amazon.com/registries?ref_=nav_cs_registry";

    @FindBy (xpath = "(//input[@placeholder='Search by Registrant name'])")
    public WebElement registryNameSearchBox;

    @FindBy (xpath = "(//span[@class='a-dropdown-prompt'])")
    public WebElement registryListDropdownBox;

    @FindBy (xpath = "(//button[@class='gr-btn gr-btn--rounded gr-text gr-find-stripe__cta gr-find-stripe__submit'])")
    public WebElement registrySearchButton;

    @FindBy (xpath = "(//div[class='gr-registry-types__header'])")
    public WebElement registryWeddingSearchButton;

    @FindBy (xpath = "(//img[@alt='Couple Kissing'])")
    public WebElement registryWeddingImageField;

    public RegistryPage() {
        webDriverWait.until(ExpectedConditions.urlToBe(URL));








    }










}
