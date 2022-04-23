package amazon;

import base.BasePage;
import base.TestBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class TestRegistryPage extends TestBasePage {

    //Test 1
    @Test
    public void testRegistryNameSearchBox () {
        Homepage homepage =new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.registryNameSearchBox.click();
        registryPage.registryNameSearchBox.sendKeys("Jessica");
    }

    //Test 2
    @Test
    public void testRegistryDropdownBox () {
        Homepage homepage =new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.registryDropdownBox.click();
    }

    // Test 3
    @Test
    public void testRegistrySearchButton () {
        Homepage homepage = new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.registrySearchButton.click();
    }

   //Test 4
    @Test
    public void testRegistryWeddingSearchButton() {
        Homepage homepage = new Homepage();
        //String searchTerm= "Francesca";
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.registryWeddingSearchButton.click();
        //registryPage.registryWeddingSearchField.sendKeys(searchTerm);
        //registryPage.registryWeddingSearchField.sendKeys(Keys.ENTER);
        //registryPage.registryArrowButton.click();

    }
    //Test 5
    @Test
    public void testRegistryHeader () {
        Homepage homepage =new Homepage();
        RegistryPage registryPage = homepage.navigateToRegistryPage();
        registryPage.registryHeader.click();



    }






}
