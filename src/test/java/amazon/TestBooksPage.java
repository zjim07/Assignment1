package amazon;

import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;


public class TestBooksPage extends TestBasePage {

    private Object SearchResults;

    @Test
    public void testNavigateToTestBookPage() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.mainBookImage.click();
    }

    @Test
    public void testNavigateToTestSearchBook() {
        WebElement SearchElement = driver.findElement(By.id("nav-search-submit-button"));
        SearchElement.sendKeys("best sellers");
        driver.findElement(By.className("nav-input")).click();
        // WebElement SearchResults = driver.findElement(By.linkText("bast seller books"));

        assertNotNull(SearchResults);
    }

    @Test
    public void testNavigateToTestLowBook() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.lawBooks.click();

        String expectedText = "//*[@id='s-refinements/div[3]/ul/li[17]/span/a/span']";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText,text);


    }


    @Test
    public void TestChildrensBooks() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.ChildrensBooks.click();


        String expectedText = "//*[@id='s-refinements/div[3]/ul/li[6]/span/a/span']";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText,text);
    }

    @Test
    public void TestHistoryBooks() {
        Homepage homepage = new Homepage();
        BooksPage BookPage = homepage.navigateToBooksPage();
        BookPage.HistoryBooks.click();

        String expectedText = "";
        String text = driver.getTitle();
        System.out.println(text);
        Assert.assertEquals(expectedText,text);
    }
}