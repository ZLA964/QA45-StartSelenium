package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeledtorsCss_hwInClassTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void elementsHeaderIlCarro() {
        try {
            System.out.println("========== start homework =============");
            driver.get("https://ilcarro.web.app/search");
            driver.manage().window().maximize();
            WebElement btnSearch = driver.findElement(By.cssSelector("a[id='0']"));
            System.out.println(btnSearch.getText());
            WebElement letCarWork = driver.findElement(By.cssSelector("a[ng-reflect-router-link='let-car-work']"));
            System.out.println(letCarWork.getText());
            WebElement termsOfUse = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
            System.out.println(termsOfUse.getText());
            WebElement btnRegesration = driver.findElement(By.cssSelector("a[ng-reflect-router-link='registration']"));
            System.out.println(btnRegesration.getText());
            btnRegesration.click();
            driver.get("https://ilcarro.web.app/search");


            Thread.sleep(1500);
            driver.close();
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
        System.out.println("============ end homework =============");
    }
}
