package amazon;
import base.BasePage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AmazonBasicsPage extends BasePage {
    private static final String URL = "https://www.amazon.com";

    @FindBy(xpath = "//*[@id='k9rs2mhe3v']/div/div/div/a")
    public WebElement newArrivals;
    @FindBy(xpath = "//*[@id=\'3uu6f2odnn\']/div/div/div/a")
    public WebElement lightningCables;
    @FindBy(xpath = "//*[@id=\'reaapr152d\']/div/div/div/a")
    public WebElement workFromHome;
    @FindBy(xpath="//*[@id="krx4r15dsa"]/div/div/div/a")
    public WebElement automotiveSupplies;
    @FindBy(xpath="//*[@id=\"td2ouz0m0o\"]/div/div/div/a")
    public WebElement fitness;

    public AmazonBasicsPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }
}