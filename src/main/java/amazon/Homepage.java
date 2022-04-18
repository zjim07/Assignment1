package amazon;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {

    @FindBy(xpath = "//a[@href='/amazon-fashion/b/?ie=UTF8&node=7141123011&ref_=nav_cs_fashion']")
    public WebElement fashionPage;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public FashionPage navigateToFashionPage() {
        clickOnElement(fashionPage);
        return new FashionPage();
    }


}
