/*
1.Launch a new Chrome browser.
2.Open http://demoqa.com/frames-and-windows/
3.Use this statement to click on a New Window button “driver.findElement(By.xpath(“.//*[@id=’tabs-1′]/div/p/a”)).click();”
4.Close the browser using close() command
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/frames-and-windows/");
        driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
        driver.quit();
    }
}
