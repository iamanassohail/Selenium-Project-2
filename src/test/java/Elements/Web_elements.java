package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Web_elements {

    public static WebElement username(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"loginFrm_loginname\"]"));
    }

    public static WebElement password(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"loginFrm_password\"]"));
    }

    public static WebElement login_btn(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
    }

    public static WebElement dove_item(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/a"));
    }
}
