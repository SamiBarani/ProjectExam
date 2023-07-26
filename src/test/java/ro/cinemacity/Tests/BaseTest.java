package ro.cinemacity.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        //open page

        driver = new SafariDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //close browser
        driver.manage().deleteAllCookies();
        driver.close();
    }

    public void waitForNumberOfSeconds(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }

    }
    public void scrollDown600(){
        new Actions(driver)
                .scrollByAmount(0,600)
                .perform();


    }
    public void scrollDown50() {
        new Actions(driver)
                .scrollByAmount(0, 50)
                .perform();
    }
        public void scrollDown100(){
            new Actions(driver)
                    .scrollByAmount(0,100)
                    .perform();
    }
            public void scrollDown150(){
                new Actions(driver)
                        .scrollByAmount(0,150)
                        .perform();
    }
                public void scrollDown200(){
                    new Actions(driver)
                            .scrollByAmount(0,200)
                            .perform();
    }
                    public void scrollDown250(){
                        new Actions(driver)
                                .scrollByAmount(0,250)
                                .perform();
    }
                        public void scrollDown350(){
                            new Actions(driver)
                                    .scrollByAmount(0,350)
                                    .perform();
    }
                            public void scrollDown450(){
                                new Actions(driver)
                                        .scrollByAmount(0,450)
                                        .perform();
    }
                                public void scrollDown601(){
                                    new Actions(driver)
                                            .scrollByAmount(0,601)
                                            .perform();
    }
public void scrollUp600(){
    new  Actions(driver)
            .scrollByAmount(600,0)
            .perform();

    }
}