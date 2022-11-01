package tests.US006;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem_PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase08 {
    Hatem_PearlyMarketPage pearlyMarketPage = new Hatem_PearlyMarketPage();

    @Test
    public void test() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        //Store Manager  https://pearlymarket.com/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarketUrl"));

        //Store Manager Sign-in sekmesine tiklar
        pearlyMarketPage.signInButtongiris.click();
        //Store Manager Username girer
        pearlyMarketPage.signIn_emailBox.sendKeys(ConfigReader.getProperty("validUserName"));

        // Store Manager Password girer
        pearlyMarketPage.signIn_passwordBox.sendKeys(ConfigReader.getProperty("validPassword"));
        //Store Manager Sign-in butonuna tiklar
        pearlyMarketPage.signInButton2.click();
        //Store Manager Myaccount sekmesine tiklar
        pearlyMarketPage.signout1.click();
        //Store Manager sekmesine tiklar
        pearlyMarketPage.storeManagerLogin.click();
        //Store Manager Products sekmesine tiklar
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        pearlyMarketPage.products.click();
        //Store Manager Add New Product simgesine tiklar
        pearlyMarketPage.addNewButton.click();
        //Categories menusunun gorunur oldugunu dogrular
        Assert.assertTrue(pearlyMarketPage.categories.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //Categories menusunden  Moda & Giyim kategorisinin oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.facion_Clothes.isDisplayed());








    }
}
