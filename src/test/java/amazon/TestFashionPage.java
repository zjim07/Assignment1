package amazon;

import base.TestBasePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFashionPage extends TestBasePage {

    @Test
    public void testFashionPage(){
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.mainFashionImage.click();
    }

    @Test //Test to hover over the "Women" tab and select the dresses option
    public void testHover() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        Actions a = new Actions(driver);
        a.moveToElement(fashionPage.womenTab).build().perform();
        fashionPage.dressesButton.click();
        String actualResult = fashionPage.dressesTitle.getText();
        String expectedResult = "DRESSES";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void addToCart() {

        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.addToCartItem.click();
        fashionPage.addToCartButton.click();
        String actualResult = fashionPage.cartCount.getText();
        String expectedResult = "1";
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void changeQuantityOfItem(){

    }

}
