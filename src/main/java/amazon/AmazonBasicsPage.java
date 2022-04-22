package amazon;
import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonBasicsPage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath ="(//a[@class='style__overlay__2qYgu EditorialTile__overlay__3cghg'])[1]" )
    public WebElement newArrivals;
    @FindBy(xpath ="(//href[@class='style__overlay___2qYgu']) EditorialTitle__overlay__3cghg")
    public WebElement lightningCables;
    @FindBy(xpath="(//href[@class='style__overlay___2qYgu EditorialTile__overlay___3cghg")
   public WebElement workFromHome;
    @FindBy(xpath="(//span[@class='style__overlay___2gYgu EditorialTile__overlay__3cghg")
    public WebElement automotiveSupplies;
    @FindBy(xpath="(//span[@class='style__overlay__2qYgu EditorialTile__overlay__3cghg")
    public WebElement fitness;

    public AmazonBasicsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }
}