package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class environment {

        protected static WebDriver driver;
        public static DesiredCapabilities capabilities;
        public int duration = 10;

        public static WebDriverWait wait;
        protected static String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    }

