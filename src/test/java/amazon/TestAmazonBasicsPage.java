package amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAmazonBasicsPage extends TestBasePage {
    @Test
    public void testNavigateToNewArrivals(){
        Homepage homepage=new Homepage();
        AmazonBasicsPage amazonBasicsPage=homepage.navigateToAmazonBasicsPage();
        amazonBasicsPage.newArrivals.click();
    }
    @Test
    public void testNavigateToLightningCables() {
        Homepage homepage = new Homepage();
        AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
        amazonBasicsPage.lightningCables.click();
    }
        @Test
                public void testNavigateToWorkFromHome() {
            Homepage homepage = new Homepage();
            AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
            amazonBasicsPage.workFromHome.click();
        }
            @Test
                    public void testNavigateToAutomotiveSupplies(){
                Homepage homepage = new Homepage();
                AmazonBasicsPage amazonBasicsPage = homepage.navigateToAmazonBasicsPage();
                amazonBasicsPage.automotiveSupplies.click();
            }
                @Test
                        public void testNavigateToFitness(){
                    Homepage homepage=new Homepage();
                    AmazonBasicsPage amazonBasicsPage=homepage.navigateToAmazonBasicsPage();
                    amazonBasicsPage.fitness.click();
                }
            }

        }
    }

