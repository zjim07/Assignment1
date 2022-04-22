package amazon;

import base.TestBasePage;
import org.testng.annotations.Test;


public class TestBooksPage extends TestBasePage {

    @Test
    public void TestBookPage() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.mainBookImage.click();
    }
}