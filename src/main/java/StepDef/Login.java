//package StepDef;
//
//import config.env_target;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class Login extends env_target{
//    @Given("the user is on voila page")
//    public void the_user_is_on_voila_page(){
//        // Set driverlocation
//        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
//        //Maximize driver
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        //Set URL
//        driver.get(baseurl);
//    }
//
//    @When("the user choose the sign in button")
//    public void the_user_choose_the_sign_in_button() {
//        driver.findElement(By.xpath("//*[@id=\"base\"]/button[1]")).click();
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("identifier"))
//        );
//    }
//    @And("the user enters the username and password")
//    public void the_user_enters_the_username_and_password(){
//
//        driver.findElement(By.name("identifier")).sendKeys("sialica012@gmail.com");
//
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
//        );
//
//        driver.findElement(By.name("password")).sendKeys("Sialica012");
//    }
//
//    @Then("the user clicks the sign in button")
//    public void the_user_clicks_the_sign_in_button(){
//        driver.findElement(By.cssSelector("._920fuu5._920fuuf._920fuub._920fuu6.x63gt40")).click();
//    }
//
//    @When("the user enters the invalid username and password")
//    public void the_user_enters_the_invalid_username_and_password() {
//        driver.findElement(By.name("identifier")).sendKeys("sialica@gmail.com.com");
//
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
//        );
//
//        driver.findElement(By.name("password")).sendKeys("Sialica012");
//    }
//
//    @When("the user enters the username and invalid password")
//    public void the_user_enters_the_username_and_invalid_password() {
//        driver.findElement(By.name("identifier")).sendKeys("sialica012@gmail.com");
//
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                ExpectedConditions.visibilityOfElementLocated(By.name("password"))
//        );
//
//        driver.findElement(By.name("password")).sendKeys("sialica");
//    }
//
//    @Then("User get a error message")
//    public void user_get_a_error_message() {
//        Duration duration = Duration.ofSeconds(10);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("._7q2fqh0._7q2fqh4"))
//        );
//    }
//}
