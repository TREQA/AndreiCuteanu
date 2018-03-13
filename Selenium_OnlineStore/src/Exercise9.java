/*
    Practice Exercise 2
1.Launch new Browser
2.Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
3.Get the value from cell ‘Dubai’ with using dynamic xpath
4.Print all the column values of row ‘Clock Tower Hotel’
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise9 {
    public static void main(String[] args){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://toolsqa.wpengine.com/automation-practice-table/");

        String sRow = "2";
        String sCol = "1";
        String cellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
        System.out.println(cellValue);

        String rowValue = "Clock Tower Hotel";

        for (int i=1; i<=5; i++){
            String value = null;
            value = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+sRow+"]/th")).getText();
            if(value.equalsIgnoreCase(rowValue)){
                for(int x=1; x<=5; x++){
                    String colValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/td["+x+"]")).getText();
                    System.out.println(colValue);
                }
            break;
            }
        }
    driver.quit();
    }
}
