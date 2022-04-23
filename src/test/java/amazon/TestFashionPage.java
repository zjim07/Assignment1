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
    public void changeQuantityOfItem() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.addToCartItem.click();
        fashionPage.selectFromDropdownByValue(fashionPage.quantityDropdown, "3");
        Assert.assertEquals(fashionPage.quantityDropdown, 3);
    }

    @Test
    public void removeItemFromCart() {
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.addToCartItem.click();
        fashionPage.addToCartButton.click();
        fashionPage.cartCount.click();
        fashionPage.deleteButton.click();
        String actualResult = fashionPage.cartCount.getText();
        String expectedResult = "0";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void changeColorOfItem() {   //Sometimes this works, other times it adds 3 items to the cart. I have no idea why.
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.addToCartItem.click();
        fashionPage.changeColor.click();
        String actualResult = fashionPage.colorText.getText();
        String expectedResult = "Khaki Pink With Pendant";
        Assert.assertEquals(actualResult, expectedResult);
    }

}
