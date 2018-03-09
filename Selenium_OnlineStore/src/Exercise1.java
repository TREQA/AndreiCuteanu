/*
1.Launch a new Chrome browser.
2.Open Store.DemoQA.com
3.Get Page Title name and Title length
4.Print Page Title and Title length on the Eclipse Console.
5.Get Page URL and verify if the it is a correct page opened
6.Get Page Source (HTML Source code) and Page Source length
7.Print Page Length on Eclipse Console.
8.Close the Browser.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exercise1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver();
        String url = "http://www.store.demoqa.com";
        driver.get(url);
        String title = driver.getTitle();
        int titleLength = driver.getTitle().length();
        System.out.println("The title is: " + title);
        System.out.println("The title length is: " + titleLength);
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println("Verification Successful - The correct Url is opened.");
        }
        else {
            System.out.println("Verification Failed - An incorrect Url is opened.");
            System.out.println("Actual URL is : " + actualUrl);
            System.out.println("Expected URL is : " + url);
        }
        String pageSource = driver.getPageSource();
        int pageSourceLength = pageSource.length();
        System.out.println("Total length of the Pgae Source is : " + pageSourceLength);
        driver.close();
    }

}
