/*
1.Launch new Chrome Browser
2.Open URL http://toolsqa.wpengine.com/automation-practice-form/
3.Type Name & Last Name (Use Name locator)
4.Click on Submit button (Use ID locator)
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise4 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.findElement(By.name("firstname")).sendKeys("Andrei");
        driver.findElement(By.name("lastname")).sendKeys("Cuteanu");
        driver.findElement(By.id("submit")).click();
    }
}
