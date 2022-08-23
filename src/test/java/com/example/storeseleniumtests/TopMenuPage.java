package com.example.storeseleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.nio.file.WatchEvent;
import java.security.cert.X509Certificate;

// http://automationpractice.com/index.php
public class TopMenuPage {
    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    public WebElement searchButton;

    @FindBy(id = "contact-link")
    public WebElement contactUs;

    @FindBy(className = "login")
    public WebElement signUp;

    @FindBy(xpath = "//*[@class=\"shopping_cart\"]/a")
    public WebElement cart;

    @FindBy(xpath = "//*[@id=\"header_logo\"]/a")
    public WebElement homeLinkInLogo;

    //Top menu content
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li/a")
    public WebElement firstTopMenuElementWomen;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public WebElement secondTopMenuElementDresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    public WebElement thirdTopMenuElementTshirt;

    //Women SubMenu content
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul")
    public WebElement womenSubMenuContainer;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/a")
    public WebElement subMenuFirstOptionTop;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    public WebElement subMenuFirstSubOptionTshirt;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a")
    public WebElement subMenuSecondSubOptionBlouses;

    //Dresses SubMenu content
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul")
    public WebElement dressesSubMenuContainer;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li/a")
    public WebElement firstDressesSubmenuOptionCasualDresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
    public WebElement secondDressesSubmenuOptionEveningDresses;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")
    public WebElement thirdDressesSubmenuOptionSummerDresses;


    public TopMenuPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    
}
