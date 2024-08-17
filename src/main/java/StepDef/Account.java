package StepDef;

import config.env_target;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Account extends env_target{
    @Given("the user is on the voila page")
    public void the_user_is_on_the_voila_page() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(loginURL);

        // Langkah login
        Duration duration = Duration.ofSeconds(15);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));

        driver.findElement(By.name("identifier")).sendKeys("sialica012@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.name("password")).sendKeys("Sialica012");
        driver.findElement(By.cssSelector("._920fuu5._920fuuf._920fuub._920fuu6.x63gt40")).click();

    }
    @When("the user click profile")
    public void the_user_click_profile() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("._15kd2weg._3syuln4"))).click();
    }
    @And("the user click on the my profile")
    public void the_user_click_on_the_my_profile() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"][@data-test-id = 'CT_account_navigation-item_My Profile']"))).click();
    }
    @When("the user choose edit account info")
    public void the_user_choose_edit_account_info() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@data-test-id = 'CT_Component_ProfileEdit_Button'])[2]"))).click();
    }
    @And("the user click on the add phone number")
    public void the_user_click_on_the_add_phone_number() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class=\"xw6nfa2 xw6nfa4\"])[1]"))).click();
    }
    @And("the user click the understanding button")
    public void the_user_click_the_understanding_button() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"]/button[@data-test-id = 'CT_SubmitButton_Proceed']"))).click();
    }
    @When("the user input the password account")
    public void the_user_input_the_password_account() {
        driver.findElement(By.name("password")).sendKeys("Sialica012");
    }
    @And("the user click the confirm button")
    public void the_user_click_the_confirm_button() {
        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"]/button"))).click();

    }
    @When("the user input the phone number")
    public void the_user_input_the_phone_number() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))
        );
        driver.findElement(By.name("identifier")).sendKeys("085261175054");
    }
    @And("the user click on the verify phone number button")
    public void the_user_click_on_the_verify_phone_number_button() {

        Duration duration = Duration.ofSeconds(20);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"]/button"))).click();

    }
    @Then("the user input the code")
    public void the_user_input_the_code() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"base\"]/div/input[@data-test-id='CT_Component_Otp_Input']"))
        );
        driver.findElement(By.xpath("//*[@id=\"base\"]/div/input[@data-test-id='CT_Component_Otp_Input']")).sendKeys("703033");

    }
}
