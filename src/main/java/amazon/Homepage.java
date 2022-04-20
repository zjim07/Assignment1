package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='/amazon-fashion/b/?ie=UTF8&node=7141123011&ref_=nav_cs_fashion']")
    public WebElement fashionPage;

    @FindBy(xpath = "//a[@href='/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics']")
    public WebElement amazonBasicsPage;

    @FindBy(xpath = "//a[@href='/home-garden-kitchen-furniture-bedding/b/?ie=UTF8&node=1055398&ref_=nav_cs_home']")
    public WebElement amazonHomePage;

    @FindBy(xpath = "//a[@href='/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books']")
    public WebElement booksPage;

    @FindBy(xpath = "//a[@href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry']")
    public WebElement registryPage;

    @FindBy(xpath = "//a[@href='/deals?ref_=nav_cs_gb']")
    public WebElement todaysDealsPage;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public FashionPage navigateToFashionPage() {
        clickOnElement(fashionPage);
        return new FashionPage();
    }

    public AmazonBasicsPage navigateToAmazonBasicsPage(){
        clickOnElement(amazonBasicsPage);
        return new AmazonBasicsPage();
    }

    public AmazonHomePage navigateToAmazonHomePage(){
        clickOnElement(amazonHomePage);
        return new AmazonHomePage();
    }

    public BooksPage navigateToBooksPage(){
        clickOnElement(booksPage);
        return new BooksPage();
    }

    public RegistryPage navigateToRegistryPage(){
        clickOnElement(registryPage);
        return new RegistryPage();
    }

    public TodaysDealsPage navigateToTodaysDealsPage(){
        clickOnElement(todaysDealsPage);
        return new TodaysDealsPage();
    }


}
