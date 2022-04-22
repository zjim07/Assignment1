package amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;


public class TestBooksPage extends TestBasePage {

    private Object SearchResults;

    @Test
    public void TestBookPage() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.mainBookImage.click();
    }
        @Test
        public void TestBookSearch() {
            WebElement SearchElement = driver.findElement(By.id("nav-search-submit-button"));
            SearchElement.sendKeys("bast seller");
            driver.findElement(By.className("nav-input")).click();
           // WebElement SearchResults = driver.findElement(By.linkText("bast seller books"));

            assertNotNull(SearchResults);
        }
    }
