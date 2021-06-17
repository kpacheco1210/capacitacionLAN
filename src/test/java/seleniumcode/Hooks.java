package seleniumcode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Hooks {

    private static ChromeDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup(); //BoniGarcia --> ocupa mi version del chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        options.addArguments("--start-maximized", "--ignore-certificate-errors");
        options.addArguments("--no-sandbox");
        //options.addArguments("--headless","--window-size=2000,2080","--ignore-certificate-errors");
        ChromeOptions chromeOptions = options.setPageLoadStrategy(PageLoadStrategy.NONE);
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


    public static ChromeDriver getDriver() {
        return driver;
    }
}
