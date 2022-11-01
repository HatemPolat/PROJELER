package tests.US007;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem_PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase04 {
    Hatem_PearlyMarketPage pearlyMarketPage = new Hatem_PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());
    @Test
    public void test() throws InterruptedException {
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
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        //Product brands  menusunun gorunur oldugunu dogrular
        Assert.assertTrue(pearlyMarketPage.productsMenuBrand.isDisplayed());
        //Product brands menusunden NSB urununun brandinin  oldugunu dogrular ve tiklar
        Assert.assertTrue(pearlyMarketPage.n_NSB.isDisplayed());
        pearlyMarketPage.n_NSB.click();



    }
}
