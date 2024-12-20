package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorsCssTest {
    WebDriver driver = new ChromeDriver();

    @Test
    void elementsHeaderIlCarro() {
        driver.navigate().to("https://ilcarro.web.app/search");
        List<WebElement> headerElements;
        System.out.println("=============== v.1 ===================");
        for (int i = 1; i <= 6; i++) {
            String locator = ".header :nth-of-type(" + i + ")";
            WebElement element = driver.findElement(By.cssSelector(locator));
            printTagAndText(element);
        }
        System.out.println("=======================================");

        System.out.println("=============== v.2 ===================");
        headerElements = driver.findElements(By.cssSelector(".header *"));
        for (WebElement element : headerElements) {
            printTagAndText(element);
        }
        System.out.println("=======================================");

        System.out.println("=============== v.3 ===================");
        WebElement element = driver.findElement(By.cssSelector(".header:nth-child(1)"));
        printTagAndText(element);
        System.out.println("=======================================");


        driver.quit();
    }

    private void printTagAndText(WebElement element) {
        System.out.print(element.getTagName() + "  ");
        System.out.println(element.getText());
    }
}
