package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver = null;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @When("browser tiket.com is open")
    public void browser_tiketcom_is_open() {
        driver.navigate().to("https://www.tiket.com/");
    }

    @And("^user enters number (.*)")
    public void user_enters_number_phone_or_email(String phone) {
        driver.findElement(By.linkText("Masuk")).click();
        driver.findElement(By.name("username")).sendKeys(phone);
    }

    @And("clicks on Lanjutkan")
    public void clicks_on_lanjutkan() {
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div[4]/button")).click();

    }

    @And("input otp code verification")
    public void input_otp_code_verification() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".index_desktop_only__ss43k:nth-child(2) .User_blink_icon__vBSTB")).isDisplayed();
        driver.quit();
        driver.close();
    }
}
