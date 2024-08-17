//package StepDef;
//
//import config.env_target;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//
//
//import java.time.Duration;
//
//public class Search extends env_target{
//    @Given("the user is on the voila page")
//    public void the_user_is_on_the_voila_page() {
//        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get(loginURL);
//
//        // Langkah login
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
//
//        driver.findElement(By.name("identifier")).sendKeys("sialica012@gmail.com");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//        driver.findElement(By.name("password")).sendKeys("Sialica012");
//        driver.findElement(By.cssSelector("._920fuu5._920fuuf._920fuub._920fuu6.x63gt40")).click();
//    }
//    @When("the user enters {string} in search coloumn")
//    public void the_user_enters_in_search_coloumn(String searchText) {
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._3rrvu0")));
//        driver.findElement(By.cssSelector("._846x3h3._846x3h4._18krchz0")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._846x3h3._846x3h4")));
//        driver.findElement(By.cssSelector("._846x3h3._846x3h4")).sendKeys(searchText + Keys.ENTER);
//    }
//
//    @Then("the search results should be displayed")
//    public void the_search_results_should_be_displayed() {
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._17zx15te8._1ccbe2w9")));
//    }
//
//    @Then("the result is that an error message should be displayed.")
//    public void the_result_is_that_an_error_message_should_be_displayed() {
//        Duration duration = Duration.ofSeconds(10);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.xpath("[contains(text(),'Product not found')]"))
//        );
//    }
//}
