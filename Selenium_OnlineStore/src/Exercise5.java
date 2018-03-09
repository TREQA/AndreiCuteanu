/*
1.Launch new ChromeBrowser
2.Open URL http://toolsqa.wpengine.com/automation-practice-form/
3.Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
4.Identify Submit button with ‘tagName’, convert it in to string and print it on the console
5.Click on the Link “Link Test” (Use ‘linkTest’ locator)
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Exercise5 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial Link Text Passed");
        WebElement element = driver.findElement(By.tagName("button"));
        System.out.println(element);
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link Text Passed");
    }
}
