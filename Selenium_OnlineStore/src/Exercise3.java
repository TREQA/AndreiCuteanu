/*
Practice Exercise

1.Launch new Chrome Browser
2.Open DemoQA.com website
3.Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
4.Come back to Home page (Use ‘Back’ command)
5.Again go back to Registration page (This time use ‘Forward’ command)
6.Again come back to Home page (This time use ‘To’ command)
7.Refresh the Browser (Use ‘Refresh’ command)
8.Close the Browser
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise3 {
    public static void main (String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://demoqa.com");
        driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("http://demoqa.com");
        driver.navigate().refresh();
        driver.close();
    }
}