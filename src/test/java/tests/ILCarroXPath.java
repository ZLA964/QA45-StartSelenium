package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.util.List;

public class ILCarroXPath {
    WebDriver driver = new ChromeDriver();
    String[] stringsForRegistration = new String[4];
    String name = "Firstname";
    String lastName = "Lastname";
    String email = "em2test@mail.org.uk";
    String password = "Bb654321*{";

    @BeforeMethod
    public void setUp() {
        stringsForRegistration[0]="Namefirst";
        stringsForRegistration[1]="Lastname";
        stringsForRegistration[2]="email1@mail.com.il";
        stringsForRegistration[3]="Ab123455@!";
        // Печать значений массива для проверки
        for (String value : stringsForRegistration) {
            System.out.println(value);
            }
    }

    @Test
    public void typeRegForm(){
        try {
        System.out.println("========== start homework =============");
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
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
        WebElement inputName = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
        System.out.println("Input name: " + inputName.getAttribute("ng-reflect-name"));

//            WebElement checkbox = driver.findElement(By.xpath("//form//input[@type='checkbox']"));
//            System.out.println("Input name: " + checkbox.getAttribute("ng-reflect-name")+ " "
//                    + checkbox.getAttribute("type") );
//            if (checkbox.isDisplayed() && checkbox.isEnabled()) {
//                checkbox.click();
//            } else {
//                System.out.println("Чекбокс не доступен для взаимодействия");
//            }
//            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkbox);
//            Thread.sleep(3000);

            List<WebElement> inputElements = driver.findElements(By.xpath("//form//input"));
            int count = 0;
            for (WebElement input : inputElements) {
                System.out.println("Input name: " + input.getAttribute("ng-reflect-name")+ " "
                        + input.getAttribute("type") );
                if(count<4) {
                    System.out.println(count+ " " +  stringsForRegistration[count]);
                    input.sendKeys(stringsForRegistration[count]);
                } else {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", input);
                }
                count++;
            }
            Thread.sleep(5000);

        driver.quit();
        Thread.sleep(1000);
        driver.get("https://ilcarro.web.app/search");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
