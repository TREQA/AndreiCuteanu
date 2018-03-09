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

import java.util.List;

public class Exercise6 {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
        List<WebElement> radBtn_sex = driver.findElements(By.name("sex"));
//Challenge One - Select the deselected Radio button (female) for category Sex (Use IsSelected method):
        boolean bValue = false;
        bValue = radBtn_sex.get(0).isSelected();
        if (bValue == true){
            radBtn_sex.get(0).click();
        }
        else {
            radBtn_sex.get(1).click();
        }

//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
        WebElement radBtn_exp = driver.findElement(By.id("exp-2"));
        radBtn_exp.click();

//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
        List<WebElement> chkBox_prof = driver.findElements(By.name("profession"));
        int iSize = chkBox_prof.size();
        for (int i = 0; i < iSize; i++){
            String sValue = chkBox_prof.get(i).getAttribute("value");
            if (sValue.equalsIgnoreCase("Automation Tester")){
                chkBox_prof.get(i).click();
            break;
            }
        }

//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
       WebElement oChkBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
        oChkBox.click();
    }
}
