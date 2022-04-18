package amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestFashionPage extends TestBasePage {

    @Test
    public void testFashionPage(){
        Homepage homepage = new Homepage();
        FashionPage fashionPage = homepage.navigateToFashionPage();
        fashionPage.mainFashionImage.click();
    }
}
