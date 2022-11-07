package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindAirplaneTicketSteps {
    WebDriver driver = null;
    @Given("browser tiket.com is opened")
    public void browser_tiket_com_is_opened() {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is " + projectPath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver107.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.navigate().to("https://www.tiket.com/");
    }
    @When("user clicks pesawat menu")
    public void user_clicks_pesawat_menu() {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/header/div/div[4]/div[2]/div/div/ul/li[1]/a")).click();
    }
    @When("user select from jakarta")
    public void user_select_from_jakarta() {
        driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input")).click();
        driver.findElement(By.cssSelector(".list:nth-child(2) .text-airport")).click();
    }
    @When("user select to surabaya")
    public void user_select_to_surabaya() {
        driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div/ul/li[3]/div/div/div[2]/div[1]")).click();
    }
    @When("user select date on calendar")
    public void user_select_date_on_calendar() {
        driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[4]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[1]/div")).click();
    }
    @When("user select penumpang dan kelas kabin")
    public void user_select_penumpang_dan_kelas_kabin() {
        driver.findElement(By.xpath("//button[contains(.,'SELESAI')]")).click();
    }
    @When("user clicks cari penerbangan")
    public void user_clicks_cari_penerbangan() {
        driver.findElement(By.xpath("//button[contains(.,'CARI PENERBANGAN')]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[4]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]")).click();
    }
    @Then("tiket penerbangan is displayed")
    public void tiket_penerbangan_is_displayed() {
        driver.findElement(By.xpath("//button[contains(.,'UBAH PENCARIAN')]")).isDisplayed();
        driver.quit();
    }
}
