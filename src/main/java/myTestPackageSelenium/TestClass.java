package myTestPackageSelenium;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class TestClass {
    WebDriver driver;

        @BeforeTest
        void setProperty(){
            ChromeDriverManager.getInstance(CHROME).setup();
            driver= new ChromeDriver();
        }


    @Test(priority = 1)
    void test(){
        driver.get("https://www.guru99.com");
        driver.findElement(By.xpath("//a[contains(text(),'JUnit')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
    }


}
