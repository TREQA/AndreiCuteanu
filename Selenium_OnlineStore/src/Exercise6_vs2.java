/*
1.Launch new Browser
2.Open “http://toolsqa.wpengine.com/automation-practice-form/“
3.Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
4.Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
5.Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
6.Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise6_vs2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

//Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
        WebElement rdBtn_sex = driver.findElement(By.id("sex-1"));
        rdBtn_sex.click();

//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        WebElement rdBtn_exp = driver.findElement(By.id("exp-2"));
        rdBtn_exp.click();

//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        WebElement chkBx_prof = driver.findElement(By.id("profession-1"));
        chkBx_prof.click();

//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
        WebElement chkBx_tool = driver.findElement(By.id("tool-1"));
        chkBx_tool.click();
    }
}
