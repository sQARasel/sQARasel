import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class JobsLinkTestAdverts {

    public static void main(String[] args) {

        // Locators
        By cookiePopUpLocator = By.xpath("//*[@id=\"js-cookie-modal-level-one\"]/div/main/div/button[2]");
        By JobsLinkTestLocator = By.xpath("//*[@id=\"adtype-nav\"]/li[2]/a/span");
        By BrowserCategoriesLocator = By.xpath("//*[@id=\"search-select\"]/span/span[1]");
        By SelectJobsAndServicesLocator = By.xpath("//*[@id=\"mega_dropdown_positioning\"]/ul/li[1]");
        By SelectJobsLocator = By.xpath("//*[@id=\"submenu-jobs-and-services\"]/div[1]/div/a[1]/h3");

        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //setting up url
        String baseUrl = "https://adverts.ie";

        // launch chrome and execute the test steps
        driver.get(baseUrl);
        driver.findElement(cookiePopUpLocator).click();
        driver.findElement(JobsLinkTestLocator).click();
        driver.findElement(BrowserCategoriesLocator).click() ;
        driver.findElement(SelectJobsAndServicesLocator).click() ;
        driver.findElement(SelectJobsLocator).click();
        driver .findElement(SelectJobsLocator).click();
// get the actual value of the title
        String actualTitle = driver.getTitle();
        System.out.println("actual title is: " + actualTitle);
        String expectedTitle = "Adverts.ie | Buy and Sell Everything on Ireland's Trusted Marketplace";
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        // sleeping the execution for 4000 milly sec
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //close chrome
        driver.close();
    }
}