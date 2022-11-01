package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hatem_PearlyMarketPage {
    public Hatem_PearlyMarketPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signInButtongiris;
    @FindBy(xpath = "//*[@id='username'][1]")
    public WebElement signIn_emailBox;
    @FindBy(xpath = "//*[@id='password'][1]")
    public WebElement signIn_passwordBox;
    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement signInButton2;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signout1;
    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManagerLogin;

    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;

    @FindBy(xpath = "//*[@id='wcfm-products']")
    public WebElement screen_status_stock_price;

    @FindBy(xpath ="//*[@id='add_new_product_dashboard']")
    public WebElement addNewButton;

    @FindBy(xpath = "(//*[text()='Virtual'])[1]")
    public WebElement isVirtual;

    @FindBy(xpath = "(//*[text()='Downloadable'])[1]")
    public WebElement downloadable;

    @FindBy(xpath = "//*[@id='product_type']")
    public WebElement productType;

     @FindBy(id = "pro_title")
    public WebElement pro_Title;

     @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salePricebox;

     @FindBy(xpath = "//*[@id='regular_price']")
    public WebElement regularPricebox;

    @FindBy(id= "featured_img_display")
    public WebElement addfeaturedImageDisplay;

    @FindBy(id = "gallery_img_gimage_0_display")
    public WebElement galleryImageDisplay;

    @FindBy(id ="__wp-uploader-id-1")
    public WebElement uploadpicture;

    @FindBy(xpath="//*[@id='menu-item-browse']")
    public WebElement pictureLibrary;

    @FindBy(xpath = "(//*[@class='thumbnail'])[1]")
    public WebElement Photo_1;

    @FindBy(xpath = "(//*[@type='button'])[95]")
    public WebElement selectButton;

    @FindBy(xpath="//*[@id='gallery_img_gimage_0_display']")
    public  WebElement Photo_2;

    @FindBy(xpath="//*[@class='excerpt wcfm_title wcfm_full_ele wcfm_wpeditor']")
    public WebElement short_DescriptionText;

    @FindBy(xpath = "//*[@class='description wcfm_title wcfm_full_ele wcfm_wpeditor']")
    public WebElement description;

    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement short_TextFrime;

    @FindBy(xpath = "//*[@id='tinymce'][1]")
    public WebElement short_description_Text;

    @FindBy(xpath = "//iframe[@id='description_ifr']")
    public WebElement description_TextiFrime;

    @FindBy(xpath = "//*[@data-id='description']")
    public WebElement description_Text;
    @FindBy(xpath = "//*[@data-super_parent='486']")
    public WebElement besintakviyeleri;
    @FindBy(xpath = "(//*[@class='wcfm_title wcfm_full_ele'])[1]")
    public WebElement categories;
    @FindBy(xpath = "//*[@data-super_parent='225']")
    public WebElement bestSeller;
    @FindBy(xpath = "//*[@data-super_parent='232']")
    public WebElement books__music_Film;
    @FindBy(xpath = "//*[@data-super_parent='514']")
    public WebElement elektrik_Elektronik;
    @FindBy(xpath = "//*[@data-super_parent='508']")
    public WebElement home_Life;
    @FindBy(xpath = "//*[@data-super_parent='439']")
    public WebElement indirimli_Urun;
    @FindBy(xpath = "//*[@data-super_parent='509']")
    public WebElement cozmetic_personel;
    @FindBy(xpath = "//*[@data-super_parent='510']")
    public WebElement facion_Clothes;
    @FindBy(xpath = "//*[@data-super_parent='233']")
    public WebElement toys_Games;
    @FindBy(xpath = "//*[@data-super_parent='226']")
    public WebElement yeniurunler;
    @FindBy(xpath = "//*[@data-super_parent='229']")
    public WebElement accessories;

    @FindBy(xpath = "(//*[@class='wcfm_title wcfm_full_ele'])[2]")
    public WebElement productsMenuBrand;

    @FindBy(xpath = "//*[@data-super_parent='35']")
    public WebElement elegant_Auto_Group;

    @FindBy(xpath = "//*[@data-super_parent='41']")
    public WebElement green_Grass;

    @FindBy(xpath = "//*[@data-super_parent='46']")
    public WebElement node_JS;

    @FindBy(xpath = "//*[@data-super_parent='47']")
    public WebElement n_NSB;

    @FindBy(xpath = "//*[@data-super_parent='50']")
    public WebElement r_RED;

    @FindBy(xpath = "//*[@data-super_parent='52']")
    public WebElement skySuite_Tech;

    @FindBy(xpath = "//*[@data-super_parent='55']")
    public WebElement  sterling;







}
