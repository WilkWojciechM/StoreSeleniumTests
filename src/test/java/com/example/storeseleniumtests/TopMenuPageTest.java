package com.example.storeseleniumtests;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class TopMenuPageTest {
    private WebDriver driver;
    private TopMenuPage topMenuPage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new WebDriverWait(driver, Duration.ofSeconds(10));
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://automationpractice.com/index.php");

        topMenuPage = new TopMenuPage(driver);
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void search() {
        topMenuPage.searchButton.click();

        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.sendKeys("Faded");

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
        submitButton.click();

        WebElement searchPageField = driver.findElement(By.cssSelector("input[data-test='search-input']"));
        assertEquals(searchPageField.getAttribute("value"), "Selenium");
    }

    @Test
    public void toolsMenu() {
        new Actions(driver)
                .moveToElement(topMenuPage.toolsMenu)
                .perform();

        WebElement menuPopup = driver.findElement(By.cssSelector("div[data-test='menu-main-popup-content']"));
        assertTrue(menuPopup.isDisplayed());
    }


}
