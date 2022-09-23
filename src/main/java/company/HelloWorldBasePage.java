package company;

import org.openqa.selenium.WebDriver;

public class HelloWorldBasePage {
    protected WebDriver driver;
    protected String url;

    public HelloWorldBasePage(WebDriver driver) {
        this.driver = driver;
        this.url = "https://www.helloworld.rs/";

    }

    public HelloWorldBasePage() {

    }
    public void openPage() {
        driver.get(url);
        driver.manage().window().maximize();
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public HelloWorldBasePage(WebDriver driver, String url) {

    }
}





