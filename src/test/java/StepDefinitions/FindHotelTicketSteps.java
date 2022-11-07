package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindHotelTicketSteps {
    WebDriver driver = null;
    @Given("browser tiketcom is opened")
    public void browser_tiketcom_is_opened(){
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver107.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.navigate().to("https://www.tiket.com/");
    }
    @When("user clicks hotel menu")
    public void user_clicks_hotel_menu() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/header/div/div[4]/div[2]/div/div/ul/li[2]/a")).click();
    }
    @When("user select from bali")
    public void user_select_from_bali() {
        driver.findElement(By.id("destination-input")).click();
        driver.findElement(By.xpath("/html/body/div[3]/main/div/div[1]/div[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div/div/div[2]")).click();
    }
    @When("user select checkin date")
    public void user_select_checkin_date() {
        driver.findElement(By.xpath("//*[@id=\"checkinDate\"]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[4]/div[6]")).click();
    }
    @When("user select checkout date")
    public void user_select_checkout_date() {
        driver.findElement(By.xpath("//*[@id=\"checkoutDate\"]/div/div/div/div/div/div[1]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[5]/div[4]")).click();
    }
    @When("user select kamar dan tamu")
    public void user_select_kamar_dan_tamu() {
    driver.findElement(By.xpath("//*[@id=\"guestAndRoom\"]/div/div/div/div/div[4]/button")).click();
    }
    @When("user clicks cari hotel")
    public void user_clicks_cari_hotel() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[2]/div/div[3]/button")).click();
    }
    @Then("hotel ticket is displayed")
    public void hotel_ticket_is_displayed() {
        driver.findElement(By.xpath("//*[@id=\"app\"]/main/div/div[1]/div[1]/div/div/div[4]/button")).isDisplayed();
    }
}
