package amazon;

import base.TestBasePage;
import org.testng.annotations.Test;

public class TestAmazonBasicsPage extends TestBasePage {
    @Test
    public void testNavigateToNewArrivals(){
        Homepage homepage=new Homepage();
        AmazonBasicsPage amazonBasicsPage=Homepage.navigateToBasicsPage();
        amazonBasicsPage.newArrivals.click();
    }
    @Test
    public void testNavigateToLightningCables() {
        Homepage homepage = new Homepage();
        AmazonBasicsPage amazonBasicsPage = Homepage.navigateToBasicsPage();
        amazonBasicsPage.lightningCables.click();
    }
        @Test
                public void testNavigateToWorkFromHome(){
            Homepage homepage=new Homepage();
            AmazonBasicsPage BasicsPage=Homepage.navigatetoBasicsPage();
            amazonBasicsPage.workFromHome.click();

            @Test
                    public voidtestNavigateToAutomotiveSupplies(){
                Homepage homepage=new Homepage();
                AmazonBasicsPage BasicsPage=Homepage.navigatetoBasicsPage();
                amazonBasicsPage.automotiveSupplies.click();

                @Test
                        public voidtestNavigateToFitness(){
                    Homepage homepage=new Homepage();
                    AmazonBasicsPage BasicsPage=Homepage.navigatetoBasicsPage();
                    amazonBasicsPage.fitness.click();
                }
            }

        }
    }

