import org.openqa.selenium.By;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.util.concurrent.TimeUnit;
public class AdsLinkTestAdverts {
    public static void main(String[] args) {
        // creating driver object
        String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" + currentDir);
        System.setProperty("webdriver.chrome.driver", currentDir + "\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // don't touch the code above this line.
        // Locators
        By cookiePopUpLocator = By.xpath("//*[@id=\"js-cookie-modal-level-one\"]/div/main/div/button[2]");
        By AdsLinkTestLocator = By.xpath("//*[@id=\"adtype-nav\"]/li[1]/a/span");
        By BrowserCategoriesLocator = By.xpath("//*[@id=\"search-select\"]/span/span[1]");
        By SelectJobsAndServicesLocator = By.xpath("//*[@id=\"mega_dropdown_positioning\"]/ul/li[1]");
        By SelectJobsLocator = By.xpath("//*[@id=\"submenu-jobs-and-services\"]/div[1]/div/a[1]/h3");
        try {
            //setting up url
            String baseUrl = "https://adverts.ie";
            // launch chrome and execute the test steps
            driver.get(baseUrl);
            driver.findElement(cookiePopUpLocator).click();
            driver.findElement(AdsLinkTestLocator).click();
            driver.findElement(BrowserCategoriesLocator).click() ;
            driver.findElement(SelectJobsAndServicesLocator).click() ;
            driver.findElement(SelectJobsLocator).click();
            driver .findElement(SelectJobsLocator).click();
            // Don't touch the code below this line
            System.out.println("Your Test Passed");
            // sleeping the execution for 4000 milly sec
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            System.out.println("Your Test Failed");
        }
        //close chrome
        driver.close();
    }
}