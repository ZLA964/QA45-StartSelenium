package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathSelector {
    WebDriver driver = new ChromeDriver();

    @Test
    public void methodXPath(){
        try {
        driver.get("https://telranedu.web.app/login");
        WebElement inputEmail = driver.findElement(By.xpath("//form/input[1]"));
        inputEmail.sendKeys("my_zlv@mail.com");
            Thread.sleep(1000);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
            inputPassword.sendKeys("aA123456!");
            Thread.sleep(1000);
            WebElement btnRegistration = driver.findElement(By.xpath("//form/button[last()]"));
            btnRegistration.click();

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }


}
