import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/*
    Practice Exercise 1
1.Launch new Browser
2.Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
3.Get the value from cell ‘Dubai’ and print it on the console
4.Click on the link ‘Detail’ of the first row and last column
 */
public class Exercise8 {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-table/");

        String cellValue = driver.findElement(By.xpath(".//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(cellValue);

        driver.findElement(By.xpath(".//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a")).click();
        System.out.println("The details button has been pressed.");

        driver.quit();
    }
}


