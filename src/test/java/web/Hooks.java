package web;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{

     Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void startTest (){
        System.setProperty("webdriver.chrome.driver", "driver/94/chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
        base.driver.manage().window().maximize();
    }

   @After
    public void finishTest (){
        base.driver.quit();

   }


}
