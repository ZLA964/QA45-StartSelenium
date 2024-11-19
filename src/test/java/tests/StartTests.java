package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartTests {
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest() {
        driver.navigate().to("https://telranedu.web.app/home");
        try {
            Thread.sleep(2000);
            WebElement btnLoginHeader = driver.findElement(By.cssSelector("a[href='/login']"));
            btnLoginHeader.click();
            Thread.sleep(2000);
            WebElement btnRegistration = driver.findElement(By.cssSelector("button[name='registration']"));
            btnRegistration.click();

         //   driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void secondTest() {
        driver.navigate().to("https://telranedu.web.app/home");
        WebElement textH2 = driver.findElement(By.cssSelector("h2"));
        System.out.println(textH2.getText());
        System.out.println("=============");
        System.out.println(textH2);
        System.out.println("=============");
        WebElement btnAbout = driver.findElement(By.cssSelector("*[href='/about']"));
        try {
            Thread.sleep(1000);
        btnAbout.click();
            System.out.println("tag name --> " + btnAbout.getTagName());
            System.out.println("tag name --> " + btnAbout.getText());

        driver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
