//package StepDef;
//
//import config.env_target;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebElement;
//
//import java.time.Duration;
//
//public class Checkout extends env_target {
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
//
//    @When("the user select the item menu")
//    public void the_user_select_the_item_menu() {
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base']/a[@href='/gender/women-s-clothes-314']"))).click();
//    }
//    @And("the user choose the item")
//    public void the_user_choose_the_item() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base']/a[@href='/products/zimmermann-halliday-lace-trim-shirt-multi-watercolour-floral-44379']"))).click();
//    }
//    @And("the user click on the add to bag button for the item")
//    public void the_user_click_on_the_add_to_bag_button_for_the_item() {
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("._920fuu5._920fuuf._920fuub._920fuu6._920fuui"))).click();
//    }
//    @And("the user click on the shopping bag icon")
//    public void the_user_click_on_the_shopping_bag_icon() {
//        driver.findElement(By.xpath("//*[@id=\"base\"][@data-test-id='CT_Component_CartMenu']")).click();
//    }
//    @And("the user click on the checkout button")
//    public void the_user_click_on_the_checkout_button() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.findElement(By.xpath("//*[@id=\"base\"]/button[@data-test-id='CT_Component_btnCheckout']")).click();
//
//    }
//    @When("the user fills out the address form")
//    public void the_user_fills_out_the_address_form() {
//        Duration duration = Duration.ofSeconds(15);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='base']/div/input[@data-test-id='CT_Component_AddressLabel']")));
//        driver.findElement(By.xpath("//*[@id='base']/div/input[@data-test-id='CT_Component_AddressLabel']")).sendKeys("Angelica Manurung-Candidate QA");
//
//        driver.findElement(By.name("name")).sendKeys("Angelica Theresia Manurung");
//
//        driver.findElement(By.name("phone")).sendKeys("085261175054");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,300)");
//        driver.findElement(By.name("selected_area")).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base'][@data-test-id='CT_Component_ProvinceSelector_Sumatera Utara']"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base'][@data-test-id='CT_Component_ProvinceSelector_Deli Serdang']"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base'][@data-test-id='CT_Component_SubdistrictSelector_Pancur Batu']"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base'][@data-test-id='CT_Component_PostalCodeSelector_20353']"))).click();
//
//        driver.findElement(By.name("address")).sendKeys("Angelica Theresia Manurung - Candidate QA");
//        driver.findElement(By.name("note")).sendKeys("Angelica Theresia Manurung - Candidate QA");
//
//        js.executeScript("window.scrollBy(0,200)");
//        //Save Address button
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='base']/button[@data-test-id='CT_Component_SubmitAddress']"))).click();
//
//    }
//
//    @And("the user clicks on the upload payment proof button")
//    public void the_user_clicks_on_the_upload_payment_proof_button() {
//        Duration duration = Duration.ofSeconds(25);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ id = 'base'][@ data-test-id ='CT_Component_SelectorPayment_ButtonPayment']"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[4]"))).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-test-id='CT_Component_SelectorPayment_ButtonSelectBank_BANKTRANSFER'])[2]"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@as='button'])[3]")));
//    }
//    @And("the user selects a shipping method")
//    public void the_user_selects_a_shipping_method() {
//
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ id = 'base'][@ data-test-id ='CT_Component_ShippingSelector_ButtonShipping']"))).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@ id = 'base'][@ data-test-id ='CT_component_shipping-item-item']"))).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@as='button'])[3]")));
//
//    }
//
//    @And("the user clicks on the placeholder button")
//    public void the_user_clicks_on_the_placeholder_button() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[3]"))).click();
//    }
//
//    @And("the user click the payment upload button")
//    public void the_user_click_the_payment_upload_button() {
//    Duration duration = Duration.ofSeconds(20);
//    WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@as='button'])[4]"))).click();
//    }
//
//    @And("the user fills out the payment upload form")
//    public void the_user_fills_out_the_payment_upload_form() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
////        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@id=\"base\"])[30]")));
////		 fileInput.sendKeys("C:\\Users\\ASUS\\Pictures\\bukti.jpg");
//        wait.until(ExpectedConditions.elementToBeClickable(By.name("bankId"))).click();
////        driver.findElement(By.cssSelector("//*[@class=\"_1vypj1a2\"]")).sendKeys("Bank Mandiri");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"][@data-test-id = 'CT_component_bank-select-item_mandiri']"))).click();
//        driver.findElement(By.name("accountName")).sendKeys("Angelica Theresia");
//        driver.findElement(By.name("accountNumber")).sendKeys("12345678902");
//        driver.findElement(By.name("amount")).sendKeys("6513000");
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='base'])[35]"))).click();
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[1]"))).click();
//
//        driver.findElement(By.name("remarks")).sendKeys("Angelica Manurung");
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@as='button'])"))).click();
//    }
//    @When("the user click profile")
//    public void the_user_click_profile() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("._15kd2weg._3syuln4"))).click();
//    }
//    @When("the user click on the order history")
//    public void the_user_click_on_the_order_history() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"base\"][@data-test-id = 'CT_account_navigation-item_Order History']"))).click();
//    }
//    @When("the user choose the order")
//    public void the_user_choose_the_order() {
//        Duration duration = Duration.ofSeconds(20);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"order-item-66c0637068708135c5216607\"]"))).click();
//    }
//    @And("the user clicks on the upload payment proof")
//    public void the_user_clicks_on_the_upload_payment_proof() {
//        Duration duration = Duration.ofSeconds(25);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"base\"]/button[@ data-test-id ='CT_Component_uploadPaymentProof']"))).click();
//    }
//
//    @Then("the user should see the checkout success message")
//    public void the_user_should_see_the_checkout_success_message() {
//        Duration duration = Duration.ofSeconds(25);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*//*[@id=\"base\"][contains(text(),'Successfully submitted')]"))).click();
//
//    }
//}
