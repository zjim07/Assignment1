package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class BooksPage extends BasePage {

    private static final String URL = "https://www.amazon.com/";

    @FindBy(xpath = "//a[@href='/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books']")
    public WebElement mainBookImage;

    public BooksPage(){
        webDriverWait.until(ExpectedConditions.urlContains(URL));
        PageFactory.initElements(driver, this);
        
    }

}
