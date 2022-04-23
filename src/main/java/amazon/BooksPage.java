package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//a[@href='/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books']")
    public WebElement mainBookImage;

    public BooksPage() {
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "nav-search-submit-button")
    public WebElement SearchElement;


    @FindBy(xpath = "//*[@id='s-refinements/div[3]/ul/li[17]/span/a/span']")
    public WebElement lawBooks;

    @FindBy(xpath = "//*[@id='s-refinements/div[3]/ul/li[6]/span/a/span']")
    public WebElement ChildrensBooks;

    @FindBy(xpath = "//*[@id='s-refinements/div[3]/ul/li[15]/span/a/span']")
    public WebElement HistoryBooks;


}