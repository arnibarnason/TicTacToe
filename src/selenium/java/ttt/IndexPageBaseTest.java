package ttt;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebDriver;

public class IndexPageBaseTest {

	static WebDriver driver;
    static String baseUrl;
    static String port;


    @BeforeClass
    public static void before() {
        // Will be run before all tests in class are run
        driver = new FirefoxDriver();
        baseUrl = "http://erkimoddarar.herokuapp.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void after() {
        // Will be run after all tests in class have run
        driver.close();
    }

    @Test
    public void assertTitle() {
        driver.get(baseUrl + "/");
        assertEquals("The title was not Erkimoddarar", "Erkimoddarar", driver.getTitle());
    }
    
    @Test
    public void assertTitleGame() {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("play")).click();
        assertEquals("The title was not Erkimoddarar - Game", "Erkimoddarar - Game", driver.getTitle());
    }
    
    @Test
    public void assertPlayer1Plays() {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("play")).click();
        driver.findElement(By.id("0")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("0")), "X"));
        assertEquals("The mark for player1 was not X", "X", driver.findElement(By.id("0")).getText());
    }

    @Test
    public void assertPlayer2Plays() {
        driver.get(baseUrl + "/");
        driver.findElement(By.id("play")).click();
        driver.findElement(By.id("2")).click();
        driver.findElement(By.id("4")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("2")), "X"));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("4")), "O"));
        assertEquals("The mark for player1 was not X", "X", driver.findElement(By.id("2")).getText());
        assertEquals("The mark for player2 was not O", "O", driver.findElement(By.id("4")).getText());
    }



}
