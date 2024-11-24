package tests;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();

    @BeforeEach
    void setUp() {
        String[] stringsForRegistration = new String[4];
        stringsForRegistration[0]="Namefirst";
        stringsForRegistration[1]="Lastname";
        stringsForRegistration[2]="email1@mail.com.il";
        stringsForRegistration[3]="Ab123455@!";
        String name = "Firstname";
        String lastName = "Lastname";
        String email = "em2test@mail.org.uk";
        String password = "Bb654321*{";
    }

    @Test
    public void typeRegForm(){
        try {
        System.out.println("========== start homework =============");
        driver.get("https://ilcarro.web.app/search");
            Thread.sleep(1000);
        WebElement btnRegesration = driver.findElement(
//                By.xpath("//a[text()=' Sign up ']"));  // spase before and after impotent!
            By.xpath("//a[normalize-space(text())='Sign up']")); // solution
 //           By.xpath("//a[@ng-reflect-router-link='registration']"));
//            By.xpath("(//a[@class='navigation-link'])[4]"));
//              By.xpath("(//div[@class='header']//a)[5]"));
//              By.xpath("(//div[@class='header']//a)[last()-1]"));

        System.out.println(btnRegesration.getText());
        Thread.sleep(1000);
        btnRegesration.click();

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
