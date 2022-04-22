package amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBasePage {

    @Test
    public void testNavigateToFurnitureSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.furniture.click();
    }

    @Test
    public void testNavigateToBedBathSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.bedbath.click();
    }


    @Test
    public void testNavigateToKitchenDiningSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.kitchenDining.click();

    }

    @Test
    public void testNavigateToShopByRoomSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.shopByRoom.click();

    }

    @Test
    public void testNavigateToGardenOutdoorSearchOption() {
        Homepage homepage = new Homepage();
        AmazonHomePage amazonHomePage = homepage.navigateToAmazonHomePage();
        amazonHomePage.gardenOutdoor.click();

    }


}