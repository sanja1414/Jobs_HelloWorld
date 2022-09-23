package company;

import org.openqa.selenium.WebDriver;

public class Oglasi extends HelloWorldBasePage{
    public Oglasi(WebDriver driver) {
        super(driver);
        this.url = "https://www.helloworld.rs/oglasi-za-posao/";


    }

    public Oglasi() {
    }

    public void openPage() {
        driver.get(this.url);
    }

    public Boolean isDisplayed() {
        Boolean toReturn = true;

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return toReturn;
    }}
