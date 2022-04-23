package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FashionPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/AMAZON_FASHION/2022/SITE_FLIPS/SPR_22/BROWSE/L0/desktop/L0_DT_HERO_01W-v2.jpg']")
    public WebElement mainFashionImage;

    @FindBy(xpath = "(//span[@class='nav-a-content'])[2]")
    public WebElement womenTab;

    @FindBy(xpath = "//a[@href='/Dresses/b/ref=sv_sl_fl_1045024?ie=UTF8&node=1045024']")
    public WebElement dressesButton;

    @FindBy(xpath = "//div[@class='fst-h1-st pageBanner']/h1/span")
    public WebElement dressesTitle;

    @FindBy(xpath = "(//span[@class='a-truncate-cut'])[5]")
    public WebElement addToCartItem;

    @FindBy(id = "nav-cart-count")
    public WebElement cartCount;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartButton;

    @FindBy(id = "quantity")
    public WebElement quantityDropdown;

    @FindBy(xpath = "//input[@value='Delete']")
    public WebElement deleteButton;

    @FindBy(xpath = "(//input[@class='a-button-input'])[10]")
    public WebElement changeColor;

    @FindBy(id = "inline-twister-expanded-dimension-text-color_name")
    public WebElement colorText;

    public FashionPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
    }
}

