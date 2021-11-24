package cn.jeneral.dynamicwait;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author jeneral
 */
public class DWChromeDriver extends DWWebDriver{

    public DWChromeDriver(){
        if (System.getProperty(CHROME_DRIVER_PATH_KEY) == null){
            WebDriverManager driverManager = WebDriverManager.chromedriver();
            driverManager.useMirror();
            driverManager.setup();
        }
        this.driver = new ChromeDriver();
        this.waitTime = waitTimeDefault;
    }

}
