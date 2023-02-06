package Stepdefinition;

import config.environment;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hook extends environment{

        @Before
        public void before() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            wait = new WebDriverWait(driver, 20);
        }

//        @After
//        public void after() {
//            driver.quit();
//        }
    }
