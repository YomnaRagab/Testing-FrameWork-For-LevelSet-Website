package browseractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserActions {
    public static WebDriver driver;
    public enum webddriver_enum{
        chrome,
        firefox,
        IE
    }
    public static void initializeWebDriver(webddriver_enum webdriver)
    {
        switch (webdriver){
            case chrome:
                System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
                driver= new ChromeDriver();
                break;
            case firefox:
                System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
                driver=new FirefoxDriver();
                break;
            case IE:
                System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
                driver=new InternetExplorerDriver();
                break;
        }
    }
    public static void maximizieScreen(){
        driver.manage().window().maximize();
    }
    public static void closeDriver()
    {
        driver.quit();
    }
}
