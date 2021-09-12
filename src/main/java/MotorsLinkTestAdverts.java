import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MotorsLinkTestAdverts {

    public static void main(String[] args) {

        // Locators
        By cookiePopUpLocator = By.xpath("//*[@id=\"js-cookie-modal-level-one\"]/div/main/div/button[2]");
        By MotorsLinkTestLocator = By.xpath("//*[@id=\"adtype-nav\"]/li[3]/a/span");
        By CarLocator = By.xpath("//*[@id=\"container_wrapper\"]/div[1]/ul/li[1]/a");
        By SelectCarMakeLocator = By.xpath("//*[@id=\"car-make\"]");
        By SelectModelLocator = By.xpath("//*[@id=\"car-form\"]/div[2]");
        By SelectMimYearLocator = By.xpath("//*[@id=\"car-form\"]/div[3]");
        By SelectMaxYearLocator = By.xpath("//*[@id=\"car-form\"]/div[4]");
        By SelectMimPriceLocator = By.xpath("//*[@id=\"car-form\"]/div[5]");
        By SelectMaxPriceLocator = By.xpath("//*[@id=\"car-form\"]/div[6]");
        By ClickSearchButtonLocator = By.xpath("//*[@id=\"car-form\"]/button");

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
        driver.findElement(MotorsLinkTestLocator).click();
        driver.findElement(CarLocator).click() ;
        driver.findElement(SelectCarMakeLocator).click() ;
        driver.findElement(SelectModelLocator).click();
        driver .findElement(SelectMimYearLocator).click();
        driver .findElement(SelectMaxYearLocator).click();
        driver .findElement(SelectMimPriceLocator).click();
        driver .findElement(SelectMaxPriceLocator).click();
        driver .findElement(ClickSearchButtonLocator).click();
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