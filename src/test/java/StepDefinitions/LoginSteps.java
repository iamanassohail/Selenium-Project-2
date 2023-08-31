package StepDefinitions;

import Elements.Web_elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class LoginSteps {

    public WebDriver obj = null;
    Properties prop = new Properties();
    FileInputStream ip = new FileInputStream("/home/vend/IdeaProjects/Selenium_Assignment_Part_2/src/test/java/Resources/config.properties");
    public LoginSteps() throws FileNotFoundException {
    }
    public Object Read() throws IOException {
        prop.load(ip);

        if(prop.getProperty("browser").equals("chrome")) {
            WebDriver driver = new ChromeDriver();
            obj = driver;
        }
        if(prop.getProperty("browser").equals("firefox")){
            WebDriver driver = new FirefoxDriver();
            obj = driver;
        }
        return obj;
    }

    @Given("user is on login page")
    public void user_is_on_login_page() throws IOException {
        WebDriver driver = (WebDriver) Read();
        prop.load(ip);
        System.out.println("Inside step user is on login page");
        driver.navigate().to(prop.getProperty("url"));
    }

    @When("user enters anas12345 and {int}")
    public void user_enters_anas12345_and(Integer int1) throws IOException {
        prop.load(ip);
        System.out.println("Inside step user enters username and password");
        obj.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a")).click();
        Web_elements.username(obj).sendKeys("anas12345");
        Web_elements.password(obj).sendKeys("1234");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() throws IOException {
        prop.load(ip);
        System.out.println("Inside step user clicks on login button");
        Web_elements.login_btn(obj).click();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws IOException {
        prop.load(ip);
        System.out.println("Inside step user is navigated to the home page");
        obj.navigate().to(prop.getProperty("url"));
        //obj.navigate().to(String.valueOf(By.xpath("/html/body/div/div[1]/div[2]/section/ul/li[3]/a")));
        //obj.navigate().to(String.valueOf(By.xpath("//*[@id=\"sort\"]")));
        obj.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[6]/a")).click();
        obj.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/ul/li[1]/div/a")).click();
        obj.findElement(By.xpath("//*[@id=\"sort\"]")).click();
        //obj.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/a/i")).click();
        //WebElement dove2 = obj.findElement(By.cssSelector(""));
        //dove2.click();
        //Web_elements.dove_item(obj).click();
    }
}
