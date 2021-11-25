import cn.jeneral.dynamicwait.DWChromeDriver;
import cn.jeneral.dynamicwait.DWWebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo {

    DWWebDriver driver;

    @BeforeClass
    public void newDriver(){
        driver = new DWChromeDriver();
    }

    @Test
    public void testDemo() {
        driver.get("http://www.baidu.com");
    }

    @Test
    public void mail163Login(){
        driver.get("https://mail.163.com/");
        driver.switchTo(By.cssSelector("#loginDiv>iframe"));

        //输入邮箱
        driver.findElement(By.cssSelector("[placeholder=\"邮箱帐号或手机号码\"]")).sendKey("13512341234");
        driver.findElement(By.cssSelector("[placeholder=\"输入密码\"")).sendKey("123456");
        driver.findElement(By.id("dologin")).click();

    }

    @Test
    public void waitTimeTest(){
        driver.setWaitTime(10L).get("https://mail.163.com/");
    }

    @AfterClass
    public void quitDriver(){
        driver.quit();
    }

}
