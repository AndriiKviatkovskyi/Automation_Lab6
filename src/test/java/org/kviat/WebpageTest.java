package org.kviat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebpageTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://dictionary.cambridge.org/");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testTitlePresence() {
        WebElement titleElement = driver.findElement(By.cssSelector("h1"));
        assertThat(titleElement).isNotNull();
    }

    @Test
    void testFontUsage() {
        String expectedFontFamily = "Arial, sans-serif";
        WebElement elementWithFont = driver.findElement(By.tagName("body"));
        String actualFontFamily = elementWithFont.getCssValue("font-family");
        assertEquals(expectedFontFamily, actualFontFamily,
                "Expected font family '" + expectedFontFamily + "' but found '" + actualFontFamily + "'");

    }

    @Test
    void testIfFooterIsEmpty() {
        WebElement footerElement = driver.findElement(By.cssSelector("footer p"));
        String footerText = footerElement.getText();
        assertThat(footerText).isEqualTo("");
    }
}
