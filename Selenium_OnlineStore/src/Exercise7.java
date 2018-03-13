/*
    Practice Exercise -1 (Drop Down Box/List)
1.Launch new Browser
2.Open “http://toolsqa.wpengine.com/automation-practice-form/”
3.Select ‘Continents’ Drop down ( Use Id to identify the element )
4.Select option ‘Europe’ (Use selectByIndex)
5.Select option ‘Africa’ now (Use selectByVisibleText)
6.Print all the options for the selected drop down and select one option of your choice
7.Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Exercise7 {
    public static void main(String[] args) {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");

    WebDriver driver = new ChromeDriver(options);
    driver.get("http://toolsqa.wpengine.com/automation-practice-form/");

    WebElement element = driver.findElement(By.id("continents"));
    Select oSelect = new Select(element);
    oSelect.selectByIndex(2);
    oSelect.selectByVisibleText("Africa");

    List<WebElement> oSize = oSelect.getOptions();
    int iLIstSize = oSize.size();

    for (int i=0; i<iLIstSize; i++) {
        String sValue = oSelect.getOptions().get(i).getText();
        System.out.println(sValue);
        if(sValue.equals("Africa")){
            oSelect.selectByIndex(i);
            }
        }
    driver.quit();
    }
}
